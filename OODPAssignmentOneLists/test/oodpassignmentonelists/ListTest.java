
package oodpassignmentonelists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marshall_gj
 */
public class ListTest {
    private Integer next;
    
    public ListTest() {
       next = new Integer(20);
    }

    /**
     * Test of addToEnd method, of class List.
     */
    @Test
    public void testAddToEndEmpty() {  //tests addToEnd on an empty list
        List list = new List();
        Object expected = new Object();
        list.addToEnd(expected);
        Object output = list.getItems()[0];
        assertEquals("Checking object added to beginning of empty list.",expected,output);
    }
    
    @Test
    public void testAddToEndHalfFull() { //tests addToEnd on a half full list
        List list = new List();
        Object expected = new Object();
        for (int i = 0; i < 5;i++) {
            list.getItems()[i] = expected;
        }
        list.addToEnd(expected);
        Object output = list.getItems()[5];
        assertEquals("Checking object added to end of list when half full.",expected, output);
    }
    
    @Test
    public void testAddToEndFull() { //tests ass to end on a full array to ensure a new double-sized array is created
        List list = new List();
        Object expected = new Object();
        for (int i = 0; i < 10;i++) {
            list.getItems()[i] = expected;
        }
        list.addToEnd(expected);
        int output1 = list.getItems().length;
        int expected1 = 20;
        Object output2 = list.getItems()[10];
        Object expected2 = expected;
        assertEquals("Checking the list is double the size.",expected1,output1);
        assertEquals("Checking the object was added to the 11th slot",expected2,output2);
        
    }

    /**
     * Test of toString method, of class List.
     */
    @Test
    public void testToStringFull() {
        List list = new List();
        for (int i = 0; i < 10;i++) {
            list.getItems()[i] = next;
        }
        String output = list.toString();
        String expected = "[ 20 20 20 20 20 20 20 20 20 20 ]";
        assertEquals("Checking objects are sent toString successfully",output,expected);
    }
    
     @Test
    public void testToStringEmpty() { //tests for toString() when the list is empty
        List list = new List();
        String output = list.toString();
        String expected = "[]";
        assertEquals("Checking objects are sent toString successfully",output,expected);
    }
     
     @Test
     public void testFirstElement() { //testing to see if pointer is moved to correct location
         List list = new List();
         for (int i = 0; i < 10;i++) {
            list.getItems()[i] = next;
         }
         list.firstElement();
         int expected = 1;
         int output = list.getCurrentObjectPosition();
         assertEquals("Testing pointer is on first element.",expected,output);
     }
     
     @Test
     public void testNextElement() { //testing to see that pointer is moved to next element and current element is returned
         List list = new List();
         Integer one = new Integer(1);
         Integer two = new Integer(2);
         list.addToEnd(one);
         list.addToEnd(two);
         list.firstElement();
         String expected1 = "1";
         String output1 = list.nextElement().toString();
         int expected2 = 2;
         int output2 = list.getCurrentObjectPosition();
         assertEquals("Testing nextElement() returns object in position one.",expected1,output1);
         assertEquals("and testing that the pointer has moved from position one to position two",expected2,output2);
     }
     
     @Test
     public void testHasMoreElementsEmpty() { // testing result of hasMoreElements when the list is empty
         List list = new List();
         boolean expected = false;
         boolean output = list.hasMoreElements();
         assertEquals("Testing that empty list returns false: ", expected, output);         
     }
     
     @Test
     public void testHasMoreElementsPositive() { //tests to see that when there is at least another element in the array the result is true
         List list = new List();
         Integer one = new Integer(1);
         Integer two = new Integer(2);
         list.addToEnd(one);
         list.addToEnd(two);
         boolean expected = true;
         boolean output = list.hasMoreElements();
         assertEquals("Testing that empty list returns false: ", expected, output); 
     }
     
     @Test
     public void testHasMoreElemenetsNegative() {
         List list = new List();
         Integer one = new Integer(1);
         Integer two = new Integer(2);
         list.addToEnd(one);
         list.addToEnd(two);
         list.nextElement();
         boolean expected = false;
         boolean output = list.hasMoreElements();
         assertEquals("Testing that empty list returns false: ", expected, output); 
     }
     
}
