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
public class NewClass3 {
    public static void main(String[] args) {
        int m=3,n=2;
           double matriz[][]={{1,2,0},{1,1,0},{2,1,0}};
           double areglo[]={3,1,3};
          double matriz1[][]=new double[m+1][m+1];
       for (int i = 0; i < m; i++) {
            double a;
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            if(a!=0){
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
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("  ");
        }
        
        for (int i = 0; i < areglo.length; i++) {
            System.out.println(areglo[i]);
            
        }
        
       
     
        
        int cont=0,cont1=0,rangoa=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]==0){
                    cont++;
                }
               
            }
            if(cont==matriz.length){
                cont1++;
            }
            
            
             cont=0;
            
        }
        
        
        System.out.println(rangoa=(m-cont1));
        
       
        
        
        
        for (int i = 0; i < matriz1.length-1; i++) {
            for (int j = 0; j < matriz1.length-1; j++) {
                 matriz1[i][j]=matriz[i][j];
                
            }
           
            
        }
      
        
        for (int i = 0; i < matriz1.length-1; i++) {
            for (int j = matriz1.length-1; j ==matriz1.length-1; j++) {
                 matriz1[i][j]=areglo[i];
                
            }
           
            
        }
         for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j]+" ");
                
            }
            System.out.println("  ");
        }
        
        
        
       
        
         int cont2=0,cont3=0,rangob=0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(matriz1[i][j]==0){
                    cont2++;
                }
               
            }
            if(cont2==m+1){
                cont3++;
            }
            
            
             cont2=0;
            
        }
       rangob=(m-(cont3-1));
        
        int [ ]areglo1=new int[2];
        
        System.out.println(areglo1[0]=rangob);
        System.out.println(areglo1[1]=rangoa);
    }
    
}
