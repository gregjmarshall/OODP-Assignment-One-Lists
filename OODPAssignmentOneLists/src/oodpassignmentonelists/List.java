/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oodpassignmentonelists;

/**
 *
 * @author marshall_gj
 */
public class List<T> {
    private static final int INIT_LEN = 10;
    private T[] items; // the actual items array
    private int numItems; // the number of items currently in the list
    /*
    * constructor: initialize the list to be empty
    */
    @SuppressWarnings("unchecked")
    public List() {
    items = (T[]) new Object[INIT_LEN];
    numItems = 0;
    }
    /*
    * AddToEnd
    *
    * Given: Object obj Do: Add obj to the end of the list.
    */
    public T[] getItems() {
        return items;
    }
    
    
    public void addToEnd(T obj) {
        for(int i = 0; i < items.length; i++){
            if(items[i] == null) {
            items[i] = obj;
            numItems = i+1;
            return;
            }
        }
        numItems = items.length;
        T[] tempItems = (T[]) new Object[numItems*2];
        for(int i = 0; i < items.length; i++){
            tempItems[i] = items[i];
        }
        items = tempItems;
        addToEnd(obj);
        
    }

    /*
    * toString
    *
    * A String form of the objects in the list in order, enclosed in
    * square brackets, separated by spaces.
    */
    @Override
    public String toString() {
    return null; // REPLACE WITH YOUR CODE
    }
}