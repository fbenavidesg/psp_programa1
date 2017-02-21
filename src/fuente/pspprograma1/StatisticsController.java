
package pspprograma1;

/**
 *
 * @author fbenavides
 */
public class StatisticsController {
    
    /**
     * Controller para mostrar la media 
     */
    public void showAverage(){
        
        CalculatorStatisticsModel calculatorModel = new CalculatorStatisticsModel();
        System.out.println( "MEDIA: " + calculatorModel.average() );
        
    }
    
    /**
     * Controller para mostrar la desviación estandar 
     */
    public void showStandardDeviation(){
        
        CalculatorStatisticsModel calculatorModel = new CalculatorStatisticsModel();
        System.out.println( "DESVIACIÓN ESTÁNDAR: " + calculatorModel.standardDeviation() );
        
    }
    
}
