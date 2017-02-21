package pspprograma1;

/**
 *
 * @author fbenavides
 */
public class ListChained {
    private NodeList first;
    private NodeList last;
    private int length;
    private NodeList current;
    
    /**
     * Constructor, se inicializan la lista sin nodos.
     */
    public ListChained() {
        first = null;
        last = null;
        length = 0;
        current = null;
    }
    
    /**
     * Metodo auxiliar para saber si la lista aun no tiene nodos,
     * @return true o false
     */
    public boolean isEmpty() {
        return (first == null);
    }
    
    /**
     * Agrega un nodo a la lista encadenada
     * @param value 
     */
    public void addNode( float value ){
        
        if( this.isEmpty() ){
            NodeList nodeNew = new NodeList( value );
            first = nodeNew;
            last =  nodeNew;
            nodeNew.nodeRight = nodeNew;
        }else{
            NodeList nodeNew = new NodeList( value );
            nodeNew.nodeRight = null;
            last.nodeRight = nodeNew;
            last = nodeNew;
        }
        this.length++;
        
    }
    
    /**
     * Retorna el siguiente nodo de la lista encadena
     * @return nodeResult objecto NodeList 
     */
    public NodeList next(){
        
        NodeList nodeResult;
        if( current == null ){
            nodeResult = first;
            current = nodeResult;
        }else{
            nodeResult = current.nodeRight;
            current = nodeResult;
        }
        return nodeResult;
        
    }
    
    public void initialize(){
        current = null;
    }
    
    /**
     * Retorna el tamaño de la lista
     * @return length número entero
     */
    public int getLength() {
        return length;
    }
    
    
}
