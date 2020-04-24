/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

/**
 *
 * @author sarthak sethi
 */
public class MapNode<K,V> {
    K key;
    V value;
    MapNode<K,V> next;
    
    public MapNode(K key ,V value)
    {
        this.key= key;
        this.value = value;
    }
}
