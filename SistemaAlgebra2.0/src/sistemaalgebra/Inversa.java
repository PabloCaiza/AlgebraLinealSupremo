/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Inversa extends javax.swing.JFrame {

    private int incognitas;
    public DefaultTableModel modelo;

    public Inversa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldnNumIncognitas = new javax.swing.JTextField();
        jButtonGenerarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Numero de Incognitas: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTextFieldnNumIncognitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldnNumIncognitasKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldnNumIncognitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, -1));

        jButtonGenerarMatriz.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonGenerarMatriz.setText("Generar Matriz");
        jButtonGenerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jTable.setForeground(new java.awt.Color(0, 0, 153));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 170));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 340, 270));

        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Resolver el Sistema Lineal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonfomate.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarMatrizActionPerformed

        if (!jTextFieldnNumIncognitas.getText().equals("")) {
            this.setIncognitas(Integer.parseInt(jTextFieldnNumIncognitas.getText()));
            int fila = this.getIncognitas();
            if (fila >= 2) {
                Object columna[] = new Object[incognitas + 1];
                for (int i = 0; i < columna.length; i++) {
                    if (i < fila) {
                        columna[i] = "X" + (i + 1);
                    } else {
                        columna[i] = "d";
                    }
                    modelo = new DefaultTableModel(columna, fila);
                    jTable.setModel(modelo);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe Ingresar minimo 2 incognitas");
                jTextFieldnNumIncognitas.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero ");
        }


    }//GEN-LAST:event_jButtonGenerarMatrizActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = this.getIncognitas();
        
        double matriz[][] = new double[n][n];
        double matriz1[][] = new double[n][n];
        double areglo[] = new double[n];
         boolean bandera=false;
        try{
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, j)));

            }
            areglo[i] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, n)));
            bandera=true;
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
        }
        if(bandera){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j]=matriz[i][j];
                
            }
        }
        
        Calculadora calcu= new Calculadora(); 
     if(!calcu.calcularDeterminante(matriz1, n)){
         
           JOptionPane.showMessageDialog(null, "La matriz no es invertible");     
     }else{
         JOptionPane.showMessageDialog(null, "Sistema Compatible");
           if(matriz[0][0]==0){
                    double aux2;
                    double aux1;
                    for (int i = 0; i < n; i++) {
                        if(matriz[0][0]==0){
                        for (int j = 0; j < n; j++) {
                           aux2=matriz[0][j];
                           matriz[0][j]=matriz[i][j];
                           matriz[i][j]=aux2;
                        }
                        aux1=areglo[0];
                        areglo[0]=areglo[i];
                        areglo[i]=aux1;
                        }
                        else{
                           break ;
                        }
                    }
                }
          areglo = this.calcularInversa(n, matriz, areglo);
         
        for (int i = 0; i < areglo.length; i++) {
            jTextArea.append("x" + (i + 1) + "=" + String.format("%.2f",areglo[i]) + "\n");
        }
          
       }
            
        
        

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextArea.setText(" ");
        
        jTextFieldnNumIncognitas.setText("");
        modelo.setRowCount(0);
        for (int i = 0; i < jTable.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        jTable.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldnNumIncognitasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnNumIncognitasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldnNumIncognitasKeyTyped

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        Menu a= new Menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inversa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGenerarMatriz;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldnNumIncognitas;
    // End of variables declaration//GEN-END:variables

    public void mostrarOperaciones(double matriz[][]) {
        int n = this.getIncognitas();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length / 2; j++) {
                jTextArea.append(String.format("%.2f",matriz[i][j]) + "\t");

            }
            jTextArea.append( "\n ");
            
        }
        jTextArea.append( "\n ");
        jTextArea.append("*-----------------------------------------------*\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length / 2; j < matriz[i].length; j++) {
                jTextArea.append( String.format("%.2f",matriz[i][j]) + "\t");

            }
            jTextArea.append( "\n ");
          
        }

        jTextArea.append("\n\n");
    }

    public int getIncognitas() {
        return incognitas;
    }

    public void setIncognitas(int incognitas) {
        this.incognitas = incognitas;
    }

    public double[] calcularInversa(int inc, double matriz[][], double arreglo[]) {

        int n = inc;

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
            jTextArea.append(String.format("%.2f",1 / a) + "*fila" + (i + 1) + "\n");
//            Transformar valores de la diagonal principal  en 1
            for (int j = 0; j < 2*n; j++) {

                matrizInversa[i][j] = (matrizInversa[i][j] / a);

            }
             mostrarOperaciones(matrizInversa);

            //operaciones gauss jordan tranformar los valores abajo y arriba de la diagonal en 0 
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    a = matrizInversa[j][i];
                    jTextArea.append("-" + String.format("%.2f",a) + "*F" + (i + 1) + " +F " + (j + 1) + "\n");
                    for (int y = 0; y < 2*n; y++) {
                        matrizInversa[j][y] = matrizInversa[j][y] - a *matrizInversa[i][y];
                    }
                    mostrarOperaciones(matrizInversa);

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

}
