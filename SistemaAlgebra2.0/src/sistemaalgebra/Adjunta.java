/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

/**
 *
 * @author Administrador
 */
public class Adjunta {

    public static double[][] adjunta(int n, double matriz[][]) {

        double matrizIdentidad[][] = new double[n][n];
        double matrizInversa[][] = new double[n][2 * n];
        double matrizAuxiliar[][] = new double[n][n];
        double matrizMultiplicaion[][] = new double[n][1];
        double matrizRespuesta[][] = new double[n][1];

        //Rellenadno la matriz identidad
        for (int i = 0; i < matrizIdentidad.length; i++) {
            for (int j = 0; j < matrizIdentidad[i].length; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                }
            }
        }

        //Uniendo Matrices
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = 0; j < matrizInversa[i].length / 2; j++) {
                matrizInversa[i][j] = matriz[i][j];

            }

        }

        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = matrizInversa[i].length / 2, x = 0; j < matrizInversa[i].length; j++, x++) {
                matrizInversa[i][j] = matrizIdentidad[i][x];

            }

        }

        //imprimir(matrizInversa);
        if (matrizInversa[0][0] == 0) {
            double aux2;

            for (int i = 0; i < matrizInversa.length; i++) {
                if (matrizInversa[0][0] == 0) {

                    for (int j = 0; j < matrizInversa[i].length; j++) {
                        aux2 = matrizInversa[0][j];
                        matrizInversa[0][j] = matrizInversa[i][j];
                        matrizInversa[i][j] = aux2;
                    }

                } else {
                    break;
                }
            }
        }

        //Usando Gauus jordan
        for (int i = 0; i < n; i++) {

            double a;

            a = matrizInversa[i][i];
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < 2 * n; j++) {

                matrizInversa[i][j] = (matrizInversa[i][j] / a);

            }

            //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    a = matrizInversa[j][i];
                    for (int y = 0; y < 2 * n; y++) {
                        matrizInversa[j][y] = matrizInversa[j][y] - a * matrizInversa[i][y];
                    }

                }
            }
        }

        //guardando los valores de la matriz inversa
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = matrizInversa[i].length / 2, x = 0; j < matrizInversa[i].length; j++, x++) {
                matrizAuxiliar[i][x] = matrizInversa[i][j];

            }

        }
        double dt = resolverDeterminante(matriz, matriz);
        System.out.println(dt);
        for (int i = 0; i < matrizAuxiliar.length; i++) {
            for (int j = 0; j < matrizAuxiliar.length; j++) {
                matrizAuxiliar[i][j] *= dt;

            }

        }
        imprimir(matrizAuxiliar);
        return matrizAuxiliar;
    }

    public static double resolverDeterminante(double matriz[][], double matrizaux[][]) {
        double determinante = 0;

        int xy = 1;

        //ordenar si hay un 0
        if (matriz[0][0] == 0) {
            double aux2;

            xy = xy * -1;

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[0][0] == 0) {

                    for (int j = 0; j < matriz.length; j++) {
                        aux2 = matriz[0][j];
                        matriz[0][j] = matriz[i][j];
                        matriz[i][j] = aux2;
                    }
                    xy = xy * -1;
                    System.out.println(xy);

                } else {
                    break;
                }
            }
        }

        int n = matriz.length;
        double xz = 1;
        double matriz1[][] = new double[2][2];

        for (int i = 0; i < n - 2; i++) {
            double a;

            a = matriz[i][i];

            for (int j = 0; j < n; j++) {
                if (a != 0) {
                    matriz[i][j] = (matriz[i][j] / a);

                }

            }
            xz = xz * a;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    a = matriz[j][i];
                    for (int k = 0; k < n; k++) {
                        matriz[j][k] = matriz[j][k] - a * matriz[i][k];

                    }
                }

            }

        }

        for (int i = n - 2, x = 0; i < matriz.length; i++, x++) {
            for (int j = n - 2, y = 0; j < matriz.length; j++, y++) {
                if (x < 2 && y < 2) {
                    matriz1[x][y] = matriz[i][j];
                }

            }

        }

        double a = matriz1[0][0], b = matriz1[0][1], c = matriz1[1][0], d = matriz1[1][1];

        determinante = (a * d) - (c * b);
        determinante = (determinante * xz * xy);

        return determinante;

    }

    public static boolean comprobarFilas(double matriz[][]) {
        boolean bandera = false;
        int cont = 0;
        if (matriz[0][0] == 0) {
            double aux2;

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[0][0] == 0) {
                    for (int j = 0; j < matriz.length; j++) {
                        aux2 = matriz[0][j];
                        matriz[0][j] = matriz[i][j];
                        matriz[i][j] = aux2;
                    }

                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            double a;
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            if (a != 0) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = (matriz[i][j] / a);

                }

                //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
                for (int j = 0; j < matriz.length; j++) {
                    if (i != j) {
                        a = matriz[j][i];
                        for (int y = 0; y < matriz.length; y++) {

                            matriz[j][y] = matriz[j][y] - a * matriz[i][y];

                        }

                    }
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    cont++;
                }

            }
            if (cont == matriz.length) {
                bandera = true;
            }
            cont = 0;

        }
        // System.out.println(bandera);

        return bandera;
    }

    public static void imprimir(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "");

            }
            System.out.println("    ");

        }
    }

}
