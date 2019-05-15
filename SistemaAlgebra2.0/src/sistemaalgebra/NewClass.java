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
public class NewClass {
    public static void main(String[] args) {
        double matriz[][]= {{1,2,3},{2,-1,-1},{3,-2,2}};
             int n=3;
        
      
       
         double matriz1[][]=new double[2][2];
        for(int i=0;i<n-2;i++){
            double a;
            a=matriz[i][i];
            for (int j = 0; j < n; j++) {
                matriz[i][j]=(matriz[i][j]/a);
                
            }
            for (int j = 0; j < n; j++) {
                if(i!=j){
                   a= matriz[j][i];
                    for (int k = 0; k < n; k++) {
                        matriz[j][k]=matriz[j][k]-a*matriz[i][k];
                        
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
        
        
       
     
        
        for (int i = n-2,x=0; i < matriz.length; i++,x++) {
            for (int j = n-2,y=0; j < matriz.length; j++,y++) {
                if(x<2&&y<2){
                matriz1[x][y]=matriz[i][j];
                }
                
            }
            
        }
     
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j]+"  ");
                
            }
            System.out.println("   ");
        }
        
        double a=matriz1[0][0],b=matriz1[0][1],c=matriz1[1][0],d=matriz1[1][1],determinante;
        
        System.out.println(a+"  "+b+"  "+c+"  "+d);
        
        determinante=(a*d)-(c*b);
        
        System.out.println("el determinante es: "+determinante);
        if(determinante==0){
            System.out.println("sistema compatilbe indefinido");
        }else{
            System.out.println("sistema dompatilbe definido ");
        }
        
        
    }
}
