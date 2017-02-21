
package pspprograma1;

/**
 *
 * @author fbenavides
 */
public class PspPrograma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StatisticsController controller = new StatisticsController();
        System.out.println( "Calculo de la media" );
        controller.showAverage();
        System.out.println( "\nCalculo de la desviación estándar" );
        controller.showStandardDeviation();
        
    }
    
}
