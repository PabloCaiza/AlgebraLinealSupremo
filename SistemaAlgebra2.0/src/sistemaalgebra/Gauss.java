/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Gauss extends javax.swing.JFrame {
    private int asegurador;
    private int incognitas;
    private int ecuaciones;
    private DefaultTableModel modelo;

    String defi = "";
    String[] memoria;
    double[][] matriz;
    double[] areglo;

    public Gauss() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        intervalo = new javax.swing.JTextField();
        hasta = new javax.swing.JTextField();
        desde = new javax.swing.JTextField();
        panel = grafica.obtieneGrafica();
        jTextFieldnNumIncognitas = new javax.swing.JTextField();
        jButtonGenerarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldnNumEcuaciones = new javax.swing.JTextField();
        jButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Número de ecuaciones: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Importante: Seleccionar la primera fila antes de presionar el botón \" Resolver el Sistema Lineal \" y presionar \"Limpiar\" antes de volver a graficar.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 790, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Desde");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Hasta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Intervalo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, -1, -1));
        getContentPane().add(intervalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 50, -1));

        hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaActionPerformed(evt);
            }
        });
        getContentPane().add(hasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 50, -1));

        desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeActionPerformed(evt);
            }
        });
        getContentPane().add(desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 50, -1));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 400, 330));

        jTextFieldnNumIncognitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldnNumIncognitasKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldnNumIncognitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 110, -1));

        jButtonGenerarMatriz.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonGenerarMatriz.setText("Generar Matriz");
        jButtonGenerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGenerarMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jTable.setForeground(new java.awt.Color(0, 0, 153));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 190));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 140, 190));

        jButtonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Resolver el Sistema Lineal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Número de incógnitas: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTextFieldnNumEcuaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldnNumEcuacionesKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldnNumEcuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 110, -1));

        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonfomate.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -40, 1470, 540));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonfomate.jpg"))); // NOI18N
        jLabel7.setText("jLabel2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -40, 1010, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarMatrizActionPerformed
        Grafica a = new Grafica();
        a.crearGrafica1(defi, areglo, areglo);
        if (!jTextFieldnNumIncognitas.getText().equals("") && !jTextFieldnNumEcuaciones.getText().equals("")) {
            this.setIncognitas(Integer.parseInt(jTextFieldnNumIncognitas.getText()));
            int inc = this.getIncognitas();
            this.setEcuaciones(Integer.parseInt(jTextFieldnNumEcuaciones.getText()));
            int fila = this.getEcuaciones();
            if (inc >= 2) {
                //las filas son las igcognitas y el +1 es por los resultados
                // Object columna[] = new Object[fila + 1];
                Object columna[] = new Object[inc + 1];
                for (int i = 0; i < columna.length; i++) {
                    if (i < inc) {
                        columna[i] = "x" + (i + 1);
                    } else {
                        columna[i] = "Lado Derecho";
                    }
                    modelo = new DefaultTableModel(columna, fila);
                    jTable.setModel(modelo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe Ingresar minimo 2 incognitas");
                jTextFieldnNumIncognitas.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene los Datos");
        }


    }//GEN-LAST:event_jButtonGenerarMatrizActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//        Rellenar la matriz de coeficientes y el arreglo de resultados
       
        Calculadora aux = new Calculadora();
        int n = this.getIncognitas();
        int m = this.getEcuaciones();

        boolean bandera = false;
        if (n < m) {
            double areglo[] = new double[m];
            int areglo1[] = new int[2];
            double matriz[][] = new double[m][m];

            for (int i = 0; i < m; i++) {
//              Rellenar la matriz de coeficientes
                for (int j = 0; j < m - 1; j++) {
                    try {
                        matriz[i][j] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, j)));
                    } catch (NumberFormatException e) {

                        bandera = true;
                    }

                }
//              Rellenar el arreglo de resultados
                try {
                    areglo[i] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, n)));
                } catch (NumberFormatException e) {

                    bandera = true;
                }
            }
            grafica(matriz, areglo);
            ////Gauss grafi = new Gauss(matriz,areglo);
            //grafi.setVisible(true);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");

                }
                System.out.println("  ");
            }

//      Identificar si el sistema es compatible
            if (bandera == false) {
                int rangoA = 0, rangoB;
                areglo1 = aux.comprobarSistema(matriz, areglo, n, m);
                rangoA = areglo1[0];
                rangoB = areglo1[1];
                System.out.println(rangoA + "Rangoa");
                System.out.println(rangoB + "Rango");

                if (rangoA != rangoB) {

                    JOptionPane.showMessageDialog(null, "Sistema incompatible");
                } else {
                    if (n == rangoA) {
                        JOptionPane.showMessageDialog(null, "Sistem conpatible determinado");
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

                        areglo = aux.resolver(matriz, areglo, getIncognitas());

                        for (int i = 0; i < areglo.length; i++) {
                            System.out.println(areglo[i]);

                        }
                        for (int i = 0; i < areglo.length; i++) {
                            if (areglo[i] != 2.885633) {
                                jTextArea.append("x" + (i + 1) + "=" + String.format("%.3f", areglo[i]) + "\n");
                            }
                        }

                    } else {
                        int parametros = m - rangoA - 1;
                        JOptionPane.showMessageDialog(null, "Sistema Compatible Indeterminado  con  " + parametros + " parametros");
                        String[] arreglo = new String[getIncognitas()];
////                if(parametros<=3){

                        arreglo = Calculadora.resolver1(matriz, areglo, getIncognitas(), parametros);

                        for (int i = 0; i < arreglo.length; i++) {
                            jTextArea.append("x" + (i + 1) + "=" + arreglo[i] + "\n");
                        }
//                }else{
//                    JOptionPane.showMessageDialog(null, "Solo puede resolver hasta tres parametros");
//                }
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } else {

            double areglo[] = new double[n];
            int areglo1[] = new int[2];
            double matriz[][] = new double[n][n];
            for (int i = 0; i < m; i++) {
//              Rellenar la matriz de coeficientes
                for (int j = 0; j < matriz[i].length; j++) {
                    try {
                        matriz[i][j] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, j)));
                    } catch (NumberFormatException e) {

                        bandera = true;
                    }

                }
//              Rellenar el arreglo de resultados
                try {
                    areglo[i] = Double.parseDouble(String.valueOf(jTable.getValueAt(i, n)));
                } catch (NumberFormatException e) {

                    bandera = true;
                }
            }
//             grafica(matriz,areglo);
            grafica(matriz, areglo);
//          grafi.setVisible(true);
//      Identificar si el sistema es compatible
            if (bandera == false) {
                int rangoA = 0, rangoB;
                areglo1 = aux.comprobarSistema(matriz, areglo, n, m);
                rangoA = areglo1[0];
                rangoB = areglo1[1];

                if (rangoA != rangoB) {

                    JOptionPane.showMessageDialog(null, "Sistema incompatible");
                } else {
                    if (n == rangoA) {
                        JOptionPane.showMessageDialog(null, "Sistema compatible determinado");

                        areglo = aux.resolver(matriz, areglo, getIncognitas());

                        for (int i = 0; i < areglo.length; i++) {

                            jTextArea.append("x" + (i + 1) + "=" + String.format("%.3f", areglo[i]) + "\n");

                        }

                    } else {
                        int parametros = n - rangoA;
                        JOptionPane.showMessageDialog(null, "Sistema Compatible Indeterminado  con  " + parametros + " parametros");
                        String[] arreglo = new String[getIncognitas()];
////                if(parametros<=3){

                        arreglo = Calculadora.resolver1(matriz, areglo, getIncognitas(), parametros);

                        for (int i = 0; i < arreglo.length; i++) {
                            jTextArea.append("x" + (i + 1) + "=" + arreglo[i] + "\n");
                        }
//                }else{
//                    JOptionPane.showMessageDialog(null, "Solo puede resolver hasta tres parametros");
//                }
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextArea.setText(" ");
        jTextFieldnNumEcuaciones.setText("");
        jTextFieldnNumIncognitas.setText("");
        modelo.setRowCount(0);

        for (int i = 0; i < jTable.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }

        jTable.setModel(new DefaultTableModel());
        Gauss a = new Gauss();
        this.dispose();
        a.setVisible(true);


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

    private void jTextFieldnNumEcuacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnNumEcuacionesKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldnNumEcuacionesKeyTyped

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        Menu a = new Menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaActionPerformed

    private void desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeActionPerformed

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
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gauss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gauss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desde;
    private javax.swing.JTextField hasta;
    private javax.swing.JTextField intervalo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonGenerarMatriz;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldnNumEcuaciones;
    private javax.swing.JTextField jTextFieldnNumIncognitas;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
    Grafica grafica = new Grafica("Gráfico", "x", "y");

    public int getIncognitas() {
        return incognitas;
    }

    public void setIncognitas(int incognitas) {
        this.incognitas = incognitas;
    }

    public int getEcuaciones() {
        return ecuaciones;
    }

    public void setEcuaciones(int ecuaciones) {
        this.ecuaciones = ecuaciones;
    }

    public void grafica(double[][] matriz, double[] areglo) {
        if (matriz.length < 3) {
            Gauss aa = new Gauss();
            aa.repaint();
            this.matriz = matriz;
            this.areglo = areglo;
            desde.setText(String.valueOf(-10));
            desde.setEditable(false);
            hasta.setText(String.valueOf(10));
            hasta.setEditable(false);
            intervalo.setText(String.valueOf(0.1));
            intervalo.setEditable(false);
            memoria = new String[areglo.length];
            int cont = 0;

            for (int i = 0; i < matriz.length; i++) {

                double auxiliar = matriz[i][1];
                char simbolo1;
                char simbolo2;

//        
                if (!desde.getText().equals("")) {
                    if (!hasta.getText().equals("")) {

                        if (!intervalo.getText().equals("")) {
                            try {

                                System.out.println(matriz[i][cont]);
                                String def;
                                if (areglo[i] / auxiliar >= 0) {
                                    simbolo2 = '+';

                                } else {
                                    simbolo2 = '-';

                                }
                                if (((-1) * matriz[i][cont]) / auxiliar >= 0) {
                                    simbolo1 = '+';

                                } else {
                                    simbolo1 = '-';

                                }
                                if (simbolo1 < 0) {
                                    def = simbolo1 + Double.toString(Math.abs((matriz[i][cont] / auxiliar))) + "*" + "x" + simbolo2 + Double.toString(Math.abs((areglo[i] / auxiliar)));
                                } else {
                                    def = Double.toString(Math.abs((matriz[i][cont] / auxiliar))) + "*" + "x" + simbolo2 + Double.toString(Math.abs((areglo[i] / auxiliar)));
                                }

                                memoria[i] = def;
                                System.out.println(def);
                                double x0 = Double.parseDouble(desde.getText());
                                double xn = Double.parseDouble(hasta.getText());
                                double d = Double.parseDouble(intervalo.getText());

                                Funcion f = new Funcion(def);
                                double[] x = f.rango(x0, xn, d);
                                double[] y = f.eval(x);
                                ///grafica.datos.removeAllSeries();
                                grafica.crearGrafica(def, x, y);

                            } catch (Exception ex) {
                                Logger.getLogger(Gauss.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Ingrese el intervalo");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un rango en xn");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un rango en x0");
                }
//      
            }
        }
    }
}
