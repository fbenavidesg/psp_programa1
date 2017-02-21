package pspprograma1;

/**
 *
 * @author fbenavides
 */
public class NodeList {
    NodeList nodeRight;
    float value;
    
    /**
     * Contructor de la clase, inicializa el valor 
     * @param value valor a guardar en el nodo
     */
    public NodeList(Float value) {
        this.value = value;
        this.nodeRight = null;
    }

    /**
     * Retorno el valor del nodo
     * @return 
     */    
    public float getValue() {
        return value;
    }
    
}
