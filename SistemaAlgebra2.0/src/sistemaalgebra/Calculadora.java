/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

/**
 *
 * @author carlos orbe
 */
public class Calculadora {

    public static double[] resolver(double[][] matriz, double[] areglo, int inc) {
        int n = inc;
        
        for (int i = 0; i < n; i++) {
            double a;
            
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < n; j++) {
                if (a != 0) {
                    
                    matriz[i][j] = (matriz[i][j] / a);
                } else {
                    double auxe;
                    double auxe2;
                    if (i < n) {
                        for (int k = 0; k < matriz[i].length; k++) {

                            auxe = matriz[i][k];
                            matriz[i][k] = matriz[i + 1][k];
                            matriz[i + 1][k] = auxe;
                        }
                        auxe2 = areglo[i];
                        areglo[i] = areglo[i + 1];
                        areglo[i + 1] = auxe2;
                        a = matriz[i][i];
                        for (int l = 0; l < matriz[i].length; l++) {
                            matriz[i][l] = (matriz[i][l] / a);
                        }

                        break;
                    } else {
                        areglo[n - 1] = 0;
                        break;
                    }
                }

            }
            if (a != 0) {
                areglo[i] = (areglo[i] / a);
            }

            //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    a = matriz[j][i];
                    for (int y = 0; y < n; y++) {
                        matriz[j][y] = matriz[j][y] - a * matriz[i][y];
                    }
                    areglo[j] = areglo[j] - a * areglo[i];
                }
            }

        }
       
        //ordenar matriz

        return areglo;
    }

    public boolean compatibleIndetermidanado(double matriz[][], double areglo[]) {
        boolean bandera = false;

        double a1 = matriz[0][0], a2 = matriz[1][0], b1 = matriz[0][1], b2 = matriz[1][1], c1 = areglo[0], c2 = areglo[1];
        double x1 = a1 / a2, x2 = b1 / b2, x3 = c1 / c2;
        if (x1 == x2 && x2 == x3) {
            bandera = true;
        } else {
            bandera = false;
        }

        return bandera;
    }

    public static int[] comprobarSistema(double matriz[][], double areglo[], int inc, int ecua) {

        int n = inc;
        int m = ecua;

        if (matriz[0][0] == 0) {
            double aux2;
            double aux1;
            for (int i = 0; i < m; i++) {
                if (matriz[0][0] == 0) {
                    for (int j = 0; j < m; j++) {
                        aux2 = matriz[0][j];
                        matriz[0][j] = matriz[i][j];
                        matriz[i][j] = aux2;
                    }
                    aux1 = areglo[0];
                    areglo[0] = areglo[i];
                    areglo[i] = aux1;
                } else {
                    break;
                }
            }
        }

        if (n >= m) {

            double matriz1[][] = new double[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                double a;
                a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
                if (a != 0) {
                    for (int j = 0; j < n; j++) {
                        matriz[i][j] = (matriz[i][j] / a);

                    }
                    areglo[i] = (areglo[i] / a);
                    //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            a = matriz[j][i];
                            for (int y = 0; y < n; y++) {

                                matriz[j][y] = matriz[j][y] - a * matriz[i][y];

                            }
                            areglo[j] = areglo[j] - a * areglo[i];
                        }
                    }
                }
            }

            int cont = 0, cont1 = 0, rangoa = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] == 0) {
                        cont++;
                    }

                }
                if (cont == n) {
                    cont1++;
                }

                cont = 0;

            }

            rangoa = n - cont1;

            for (int i = 0; i < matriz1.length - 1; i++) {
                for (int j = 0; j < matriz1.length - 1; j++) {
                    matriz1[i][j] = matriz[i][j];

                }

            }

            for (int i = 0; i < matriz1.length - 1; i++) {
                for (int j = matriz1.length - 1; j == matriz1.length - 1; j++) {
                    matriz1[i][j] = areglo[i];

                }

            }

            int cont2 = 0, cont3 = 0, rangob = 0;
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    if (matriz1[i][j] == 0) {
                        cont2++;
                    }

                }
                if (cont2 == n + 1) {
                    cont3++;
                }

                cont2 = 0;

            }
            rangob = (n - (cont3 - 1));

            int[] areglo1 = new int[2];
            areglo1[0] = rangob;
            areglo1[1] = rangoa;

            return areglo1;
        } else {
            double matriz1[][] = new double[m + 1][m + 1];
            for (int i = 0; i < m; i++) {
                double a;
                a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
                if (a != 0) {
                    for (int j = 0; j < m; j++) {
                        matriz[i][j] = (matriz[i][j] / a);

                    }
                    areglo[i] = (areglo[i] / a);
                    //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
                    for (int j = 0; j < m; j++) {
                        if (i != j) {
                            a = matriz[j][i];
                            for (int y = 0; y < m; y++) {

                                matriz[j][y] = matriz[j][y] - a * matriz[i][y];

                            }
                            areglo[j] = areglo[j] - a * areglo[i];
                        }
                    }
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");

                }
                System.out.println("  ");
            }

            for (int i = 0; i < areglo.length; i++) {
                System.out.println(areglo[i]);

            }

            int cont = 0, cont1 = 0, rangoa = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] == 0) {
                        cont++;
                    }

                }
                if (cont == n) {
                    cont1++;
                }

                cont = 0;

            }

            System.out.println(rangoa = (m - cont1));

            for (int i = 0; i < matriz1.length - 1; i++) {
                for (int j = 0; j < matriz1.length - 1; j++) {
                    matriz1[i][j] = matriz[i][j];

                }

            }

            for (int i = 0; i < matriz1.length - 1; i++) {
                for (int j = matriz1.length - 1; j == matriz1.length - 1; j++) {
                    matriz1[i][j] = areglo[i];

                }

            }
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.print(matriz1[i][j] + " ");

                }
                System.out.println("  ");
            }

            int cont2 = 0, cont3 = 0, rangob = 0;
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    if (matriz1[i][j] == 0) {
                        cont2++;
                    }

                }
                if (cont2 == m + 1) {
                    cont3++;
                }

                cont2 = 0;

            }
            rangob = (m - (cont3 - 1));
            int[] areglo1 = new int[2];

            areglo1[0] = rangoa;
            areglo1[1] = rangob;

            return areglo1;

        }

    }

    public static String[] resolver1(double[][] matriz, double[] areglo, int inc, int parametros) {
        int n = inc;
        String arreglo[] = new String[inc];
        for (int i = 0; i < n; i++) {
            double a;
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < n; j++) {
                if (matriz[i][i] != 0) {
                    matriz[i][j] = (matriz[i][j] / a);
                } else {
//                  
//                    if (parametros == 1) {
//                        char simbolo1 = '+';
//                        arreglo[inc - 1] = "t";
//                        for (int z = inc - 2; z >= 0; z--) {
//                            double auxiliar = (-1) * matriz[z][inc - 1];
//                            if (matriz[z][inc - 1] >= 0) {
//                                simbolo1 = '-';
//                            } else {
//                                simbolo1 = '+';
//                            }
//                            arreglo[z] = String.valueOf(String.format("%.3f", areglo[z]));
//                            if (matriz[z][inc - 1] != 0) {
//                                arreglo[z] = arreglo[z] + simbolo1 + String.format("%.3f", Math.abs(matriz[z][inc - 1])) + "t";
//                            }
//                        }
//                    }

//                        //
//                      

                    char[] simbolo = new char[parametros];
                    for (int k = 1; k <= parametros; k++) {
                        arreglo[inc - k] = "t" + k;
                        for (int z = inc - (parametros + 1); z >= 0; z--) {
                            
                            arreglo[z] = String.valueOf(String.format("%.3f", areglo[z]));
                            for (int l =1; l < parametros+1 ; l++) {
                                
                         
                           if (matriz[z][inc -l] >= 0) {
                                    simbolo[l-1] = '-';
                                } else {
                                    simbolo[l-1] = '+';
                                }
                          
                           if (matriz[z][inc - l] != 0) {
                                arreglo[z] = arreglo[z] + simbolo[l-1] + String.format("%.3f", Math.abs(matriz[z][inc - l])) + "t" + l;
                                }
                            }
                        
                        
                        
                        }

                        }

//                    if (parametros == 2) {
////
//                        char simbolo1 = '+';
//                        char simbolo2 = '+';
//                        
//                        for (int k = 1; k < parametros + 1; k++) {
//                            arreglo[inc - k] = "t" + k;
//                            for (int z = inc - (parametros + 1); z >= 0; z--) {
//                                if (matriz[z][inc - 1] >= 0) {
//                                    simbolo1 = '-';
//                                } else {
//                                    simbolo1 = '+';
//                                }
//                                if (matriz[z][inc - 2] >= 0) {
//                                    simbolo2 = '-';
//                                } else {
//                                    simbolo2 = '+';
//                                }
//                                
//
//                                arreglo[z] = String.valueOf(String.format("%.3f", areglo[z]));
//                                if (matriz[z][inc - 1] != 0) {
//                                    arreglo[z] = arreglo[z] + simbolo1 + String.format("%.3f", Math.abs(matriz[z][inc - 1])) + "t" + 1;
//                                }
//                                if (matriz[z][inc - 2] != 0) {
//                                    arreglo[z] = arreglo[z] + simbolo2 + String.format("%.3f", Math.abs(matriz[z][inc - 2])) + "t" + 2;
//                                }
//                                
//                            }
//                        }
//
//                    }
//                    if (parametros == 3) {
//
//                        char simbolo1 = '+';
//                        char simbolo2 = '+';
//                        char simbolo3 = '+';
//                        for (int k = 1; k < parametros + 1; k++) {
//                            arreglo[inc - k] = "t" + k;
//                            for (int z = inc - (parametros + 1); z >= 0; z--) {
//                                if (matriz[z][inc - 1] >= 0) {
//                                    simbolo1 = '-';
//                                } else {
//                                    simbolo1 = '+';
//                                }
//                                if (matriz[z][inc - 2] >= 0) {
//                                    simbolo2 = '-';
//                                } else {
//                                    simbolo2 = '+';
//                                }
//                                if (matriz[z][inc - 3] >= 0) {
//                                    simbolo3 = '-';
//                                } else {
//                                    simbolo3 = '+';
//                                }
//
//                                arreglo[z] = String.valueOf(String.format("%.3f", areglo[z]));
//                                if (matriz[z][inc - 1] != 0) {
//                                    arreglo[z] = arreglo[z] + simbolo1 + String.format("%.3f", Math.abs(matriz[z][inc - 1])) + "t" + 1;
//                                }
//                                if (matriz[z][inc - 2] != 0) {
//                                    arreglo[z] = arreglo[z] + simbolo2 + String.format("%.3f", Math.abs(matriz[z][inc - 2])) + "t" + 2;
//                                }
//                                if (matriz[z][inc - 3] != 0) {
//                                    arreglo[z] = arreglo[z] + simbolo3 + String.format("%.3f", Math.abs(matriz[z][inc - 3])) + "t" + 3;
//                                }
//                            }
//                        }
//
//                    }
                    }
                }

                if (matriz[i][i] != 0) {
                    areglo[i] = (areglo[i] / a);
                }

                //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        a = matriz[j][i];
                        for (int y = 0; y < n; y++) {
                            matriz[j][y] = matriz[j][y] - a * matriz[i][y];
                        }
                        areglo[j] = areglo[j] - a * areglo[i];
                    }
                }
            }
            return arreglo;
        }

    

    public boolean calcularDeterminante(double matriz[][], int inc) {
        boolean bandera = false;
        int n = inc;
        double matriz1[][] = new double[2][2];
        for (int i = 0; i < n - 2; i++) {
            double a;

            a = matriz[i][i];
            for (int j = 0; j < n; j++) {
                if (a != 0) {
                    matriz[i][j] = (matriz[i][j] / a);
                }

            }
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

        double a = matriz1[0][0], b = matriz1[0][1], c = matriz1[1][0], d = matriz1[1][1], determinante;

        determinante = (a * d) - (c * b);

        if (determinante == 0) {
            bandera = false;
        } else {
            bandera = true;
        }

        return bandera;

    }

}
