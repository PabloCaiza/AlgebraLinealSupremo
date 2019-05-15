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
public class MatrizInversa {

    public static double []caculo (int n,double matriz[][],double arreglo[])  {
        
    

        //int n = 3;
        
        //double matriz[][]= {{3,4,-2},{1,1,-1},{3,5,-2}};
       // double arreglo[]= {2,-1,-2};
        
        
        double matrizIdentidad[][]= new double[n][n];
        double matrizInversa[][]= new double [n][2*n];
        double matrizAuxiliar[][]=new double[n][n];
        double matrizMultiplicaion[][]= new double[n][1];
        double matrizRespuesta[][]=new double[n][1];
        
        double arregloRespuesta[]= new double[n];
        
        //Rellenadno la matriz identidad
        
        for (int i = 0; i <matrizIdentidad.length; i++) {
            for (int j = 0; j < matrizIdentidad[i].length; j++) {
                if(i==j){
                    matrizIdentidad[i][j]=1;
                }
            }
        }
        
        
        //Uniendo Matrices
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = 0; j < matrizInversa[i].length/2; j++) {
                matrizInversa[i][j]=matriz[i][j];
                
            }
            
        }
        
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = matrizInversa[i].length/2, x=0; j < matrizInversa[i].length; j++,x++) {
                matrizInversa[i][j]=matrizIdentidad[i][x];
                
            }
            
        }
        imprimir(matriz);
        //imprimir(matrizInversa);
        
        //Usando Gauus jordan
        for (int i = 0; i < n; i++) {
            double a;
           
            
            a = matrizInversa[i][i];
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < 2*n; j++) {

                matrizInversa[i][j] = (matrizInversa[i][j] / a);

            }

            //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    a = matrizInversa[j][i];
                    for (int y = 0; y < 2*n; y++) {
                        matrizInversa[j][y] = matrizInversa[j][y] - a *matrizInversa[i][y];
                    }

                }
            }
        }
        
        //guardando los valores de la matriz inversa
        for (int i = 0; i < matrizInversa.length; i++) {
            for (int j = matrizInversa[i].length/2,x=0; j < matrizInversa[i].length; j++,x++) {
                matrizAuxiliar[i][x]=matrizInversa[i][j];
                
            }
            
        }
        //rellenando una matriz para hacer la multiplicacion
        for (int i = 0; i < matrizMultiplicaion.length; i++) {
            for (int j = 0; j < matrizMultiplicaion[i].length; j++) {
                matrizMultiplicaion[i][j]=arreglo[i];
                
                
            }
            
        }
        
        //Multiplicaion de Matrices
         for (int i = 0; i < matrizAuxiliar.length; i++) {
            for (int j = 0; j < matrizMultiplicaion[0].length; j++) {
                for (int k = 0; k < matrizIdentidad[0].length; k++) {
                    // aquí se multiplica la matriz
                    matrizRespuesta[i][j] += matrizAuxiliar[i][k] * matrizMultiplicaion[k][j];
                }
            }
        }
         for (int i = 0; i < matrizRespuesta.length; i++) {
             for (int j = 0; j < matrizRespuesta[i].length; j++) {
                 arregloRespuesta[i]=matrizRespuesta[i][j];
                 
             }
            
        }
        
        
        
        for (int i = 0; i < arregloRespuesta.length; i++) {
            System.out.print(arregloRespuesta[i]+"  ");
            
        }
       return arregloRespuesta;

    }
    
    public static void imprimir(double matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("     ");
            
        }
    }

}
