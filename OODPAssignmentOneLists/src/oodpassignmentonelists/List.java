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
    private int currentObject;
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
        for(int i = 0; i < items.length; i++){ // this for loops looks for the next null pointer 
            if(items[i] == null) {              // in the array and adds the object to that point
            items[i] = obj;                     // if no pointers are null, it moves on
            numItems = i+1;
            return;
            }
        }
        numItems = items.length;
        T[] tempItems = (T[]) new Object[numItems*2]; // creates a new array of double the length of items
        for(int i = 0; i < items.length; i++){ // copies the contents of items into the new temporary array
            tempItems[i] = items[i];
        }
        items = tempItems; // points items variable at the new array
        addToEnd(obj); // method then calls itself and adds the object to the end of the new longer array
        
    }
    
    public void firstElement() {
        currentObject = 0;
        if(items[0] == null) {
            System.out.println("List is empty");
        }
    }
    
    public int getCurrentObjectPosition() {
        return currentObject +1;
    }
    
    public T nextElement() { // method is such that pointer actually cannot fall off the end of the list
                               // and so hasMoreElements will be edited to announce such
        currentObject++;
        if(items[0] == null) { //if list is empty
            System.out.println("The list is empty. Pointer remains at start.");
            currentObject--;
            return null;
        }
        else if(items[currentObject] == null) { // if there are no more object after the current object in the list
            System.out.println("Next element is empty. Pointer not moved");
            currentObject--;
            return items[currentObject];
        }
        return items[currentObject-1];
    }
    
    public boolean hasMoreElements() { // as nextElement() has safeguards in place to stop the pointer
        if(items[0] == null) {          // 'currentObject' from falling off the end of the list,
            System.out.println("The list is empty!"); //this method is such that it will return false
            return false;                           // when the pointer is at the last element and there are in fact
        }                                            //'no more elements' in the list
        if(items[currentObject+1] == null) {         // it also returns false if the list is empty
            System.out.println("There are no more objects in the array after the current object");
            return false;
        }
        return true;
    }

    /*
    * toString
    *
    * A String form of the objects in the list in order, enclosed in
    * square brackets, separated by spaces.
    */
    @Override
    public String toString() {
        String printOut = "";
        String itemList = "";
        if(items[0] == null){
            printOut = "[]";
        }
        else {
            for(int i = 0;i < items.length; i++) {
            itemList += items[i].toString() + " ";
        }
        printOut += "[ " +itemList+ "]";
        }
        return printOut;
    }
    
}