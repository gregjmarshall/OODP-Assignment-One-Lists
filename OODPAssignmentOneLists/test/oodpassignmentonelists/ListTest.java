
package oodpassignmentonelists;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marshall_gj
 */
public class ListTest {
    
    public ListTest() {
    }

    /**
     * Test of addToEnd method, of class List.
     */
    @Test
    public void testAddToEndEmpty() {
        List list = new List();
        Object expected = new Object();
        list.addToEnd(expected);
        Object output = list.getItems()[0];
        assertEquals("Checking object added to beginning of empty list.",expected,output);
    }
    
    @Test
    public void testAddToEndHalfFull() {
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
    public void testAddToEndFull() {
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
    public void testToString() {
        System.out.println("toString");
        List instance = new List();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
