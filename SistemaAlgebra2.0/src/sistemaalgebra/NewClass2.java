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
public class NewClass2 {
    
    public static void main(String[] args) {
        int inc =3; 
        int n = inc;
        int parametros=2;
         double matriz[][]={{2,3,4},{0,0,0},{0,0,0}};
         double areglo[]={5,0,0};
        String arreglo []=new String [inc];
        for (int i = 0; i < n; i++) {
            double a;
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < n; j++) {
                if(matriz[i][i]!=0){
                matriz[i][j] = (matriz[i][j] / a);
                }
                else{ 
                    for (int k = 1; k <parametros+1;k++) {
                    arreglo[inc-k]="t"+k;
                    for ( int z = inc - (parametros+1); z >= 0; z--) {
                        double auxiliar = (-1)* matriz[z][inc-k];
                      
                        if(auxiliar>=0){
                           
                            arreglo[z]=  String.valueOf(String.format("%.3f",areglo[z]))  +"+" +String.format("%.3f",(-1) * matriz[z][inc-k]) + "t"+(k-1)+
                                    "+" +String.format("%.3f",(-1) * matriz[z][inc-k+1]) + "t"+(k);
                                    
                                    
                        }
                        else{
                           
                            
                        arreglo[z]=  String.valueOf(String.format("%.3f",areglo[z]))  + String.format("%.3f",(-1) * matriz[z][inc-k]) + "t"+(k-1)
                                +  "+" +String.format("%.3f",(-1) * matriz[z][inc-k]) + "t"+(k);
                        }
                    }
                }
                }

            }
             if(matriz[i][i]!=0){
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
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            
        }
    }
}
