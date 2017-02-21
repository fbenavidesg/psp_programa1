
package pspprograma1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fbenavides
 */
public class FileFlatReader {

    /**
     * Leé un archivo plano y cada linea lo agrega en un node de una lista encadenada
     * @param filename nombre del archivo
     * @return un objecto tipo ListChained lista encadena
     */
    public ListChained reader( String filename ){
        ListChained listChained = new ListChained();
        try (BufferedReader br = new BufferedReader(new FileReader( filename ))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println( Float.parseFloat(line) );
                listChained.addNode( Float.parseFloat(line) );
            }
        } catch (IOException e) {
           System.out.println( e.toString() );
        }
        return listChained;
    }
    
}
