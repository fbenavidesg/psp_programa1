
package pspprograma1;

/**
 *
 * @author fbenavides
 */
public class CalculatorStatisticsModel {
    
    private final String fileNameDataBase = "numbers.txt";
    
    /**
     * Calcula la media, tiene acceso a datos.
     * @return result valor tipo double con el valor de la media
     */
    public double average(){
        double result;
        double sum = 0;
        FileFlatReader fileflat = new FileFlatReader();
        ListChained listChained = fileflat.reader( fileNameDataBase );
        
        NodeList nodeList;
        listChained.initialize();
        for (int i = 0; i < listChained.getLength(); i++) {
            nodeList = listChained.next();
            sum += nodeList.getValue();
        }
        result = sum / listChained.getLength();
        
        return result;
    }
    
    /**
     * Calcula la desviación estandar de un grupo de números, tiene acceso a datos
     * @return result valor tipo double con el valor de la desviación estandar
     */
    public double standardDeviation(){
        double average;
        double result = 0;
        double sum = 0;
        double sum2 = 0;
        FileFlatReader fileflat = new FileFlatReader();
        ListChained listChained = fileflat.reader( fileNameDataBase );
        
        NodeList nodeList;
        for (int i = 0; i < listChained.getLength(); i++) {
            nodeList = listChained.next();
            sum += nodeList.getValue();
        }
        average = sum / listChained.getLength();
        
        listChained.initialize();
        for (int i = 0; i < listChained.getLength(); i++) {
            nodeList = listChained.next();
            
            sum2 += Math.pow(( nodeList.getValue() - average ), 2);
            
        }
        result = Math.sqrt( sum2 / ( listChained.getLength() - 1 ) );
        
        return result;
    }
    
}
