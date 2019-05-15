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
public class NewClass1 {
    public static void main(String[] args) {
         double matriz[][]= {{1,2,3},{1,2,3},{1,2,3}};
         double areglo[]={1,1,1};
             int n=3;
        
      
       
         double matriz1[][]=new double[n+1][n+1];
        for (int i = 0; i < n; i++) {
            double a;
            a = matriz[i][i];
//            Transformar valores de la diagonal principal  en 1
            if(a!=0){
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
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("    ");
        }
        System.out.println("                   ");
        
        for (int i = 0; i < areglo.length; i++) {
            System.out.print(areglo[i]+" ");
            
        }
        System.out.println("  ");   
        
        int cont=0,cont1=0,rangoa=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j]==0){
                    cont++;
                }
               
            }
            if(cont==n){
                cont1++;
            }
            
            
             cont=0;
            
        }
        System.out.println("el rango es a"+(rangoa=n-cont1));
        
        
        
       
        
        
        
        for (int i = 0; i < matriz1.length-1; i++) {
            for (int j = 0; j < matriz1.length-1; j++) {
                 matriz1[i][j]=matriz[i][j];
                
            }
           
            
        }
          for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j]+"  ");
                
            }
            System.out.println("   ");
        }
        
        
        
        for (int i = 0; i < matriz1.length-1; i++) {
            for (int j = matriz1.length-1; j ==matriz1.length-1; j++) {
                 matriz1[i][j]=areglo[i];
                
            }
           
            
        }
        
        System.out.println("   ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j]+"  ");
                
            }
            System.out.println("   ");
        }
        
         int cont2=0,cont3=0,rangob=0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if(matriz1[i][j]==0){
                    cont2++;
                }
               
            }
            if(cont2==n+1){
                cont3++;
            }
            
            
             cont2=0;
            
        }
        System.out.println("  ");
        System.out.println("el rango de b es "+(rangob=(n-(cont3-1))));
        
        
        if(rangoa!=rangob){
            System.out.println("Sistema incompatible");
        }else{
            if(n==rangoa){
                System.out.println("Sistem conpatible determinado");   
            }else{
                
            
                System.out.println("Sistema cont "+(n-rangoa)+"variables libres");
            }
            
        }
        
        
        
        
        
        
       
        
    }
    
}
