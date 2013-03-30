
package oodpassignmentonelists;

/**
 *
 * @author marshall_gj
 */
public class OODPAssignmentOneLists {
    
    
    public static void main(String[] args) {
        List list = new List();
        Integer next = new Integer(20);
        list.getItems()[0] = next;
        System.out.println("Checking '20' has been added to empty list in first position: ");
        System.out.println("First position contains: "+list.getItems()[0]);
        System.out.println("Filling array with the number 20");
        for (int i = 0; i < 10;i++) {
            list.getItems()[i] = next;
        }
        System.out.println("Testing out the toString() method to check that Integer objects have been sent toString successfully..Printing out..");
        System.out.println(list.toString());
        System.out.println("Adding another Integer(21) object to the list to test that a new array is made of double size and object added to the end.");
        next = new Integer(21);
        list.addToEnd(next);
        int length = list.getItems().length;
        System.out.println("New length of list = " +length);
        System.out.println("Item 11 in the list is now: " +list.getItems()[10]);
        System.out.println("Sending the pointer to the start of the list..");
        list.firstElement();
        int pointerLocation = list.getCurrentObjectPosition();
        System.out.println("Pointer/current object is now at number "+pointerLocation+" in the list.");
        System.out.println("Testing nextElement method....");
        System.out.println("Returning current element:"+list.nextElement().toString());
        pointerLocation = list.getCurrentObjectPosition();
        System.out.println("Pointer/current object is now at number "+pointerLocation+" in the list.");
        System.out.println("Testing hasMoreElements().....");
        System.out.println("The list has more elements:"+list.hasMoreElements());
        System.out.println("Now emptying list....");
        list = new List();
        System.out.println("The list has more elements:"+list.hasMoreElements());
        System.out.println("Now adding 1 element to the list to check borderline case of pointer at end of list:");
        list.getItems()[0] = next;
        pointerLocation = list.getCurrentObjectPosition();
        System.out.println("Pointer/current object is now at number "+pointerLocation+" in the list.");
        System.out.println("The list has more elements:"+list.hasMoreElements());
    }
    
}
