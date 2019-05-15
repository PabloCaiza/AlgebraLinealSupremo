package sistemaalgebra;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author saul_
 */
public class Grafica {

    JFreeChart grafica;
    XYSeriesCollection datos = new XYSeriesCollection();
    String titulo;
    String etiquetax;
    String etiquetay;

    public Grafica(String t, String x, String y) {

        titulo = t;
        etiquetax = x;
        etiquetay = y;
        grafica = ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
    }

    public Grafica() {
        this("Sin titulo", "x", "y");
    }

    public void agregarGrafica(String id, double[] x, double[] y) {
        
        try{
            
        XYSeries s = new XYSeries(id);
        
        int n = x.length;
            
    
        
            
        for (int i = 0; i < n; i++) {

            s.add(x[i], y[i]);

        }
        
        datos.addSeries(s);
        }catch(Exception e){
            e.getMessage();
        }
        
    }

    public void crearGrafica(String id, double[] x, double[] y) {
        
        agregarGrafica(id, x, y);
    }

    public JPanel obtieneGrafica() {
        //datos.removeAllSeries();
       
        return new ChartPanel(grafica);
    }
    public void crearGrafica1(String id, double[] x, double[] y){
        datos.removeAllSeries();
               
    }

}
