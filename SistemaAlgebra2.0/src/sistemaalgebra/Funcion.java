
package sistemaalgebra;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;

/**
 *
 * @author saul_
 */
public class Funcion {
    
    String definicion;
    IMathParser parser = MathParserFactory.create();

    public Funcion(String def) {
        this.definicion = def;  //def=definicion;
        parser.setExpression(def); //asígar la expresion y despues evaluar
        
    }
    
    /**
     *
     * @param x
     * @return
     * @throws java.lang.Exception
     */
    public double eval(double x) throws Exception{ //evaluar un solo dato
        double r = Double.NaN;
         parser.setX(x);
         r = parser.getValue();  //ya evaluado mi resultado
         return r; 
    }
    public double [] eval(double[] x) throws Exception { //metodo que evalua etodo en caso de ser un vector
         int n = x.length;
         double[] r = new double [n];
         for (int i = 0; i < n; i++) {
            r[i] = eval(x[i]);            
        }
         return r;
    }
    public double[] rango(double x0,double xn,double d){ 
        int n = (int) (Math.abs(xn-x0)/d);
        double[] r = new double [n];
        for (int i = 0; i < n; i++) {
            r[i] = x0;
            x0 += d;       
        }
        return r;
    }       
}
 