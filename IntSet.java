/*
 * This class maintains a set of ints. 
 */
import java.util.*;


public class IntSet {
	LinkedList<Integer> list;

	public IntSet() {
        //creates new linked list of integers called list
    	list = new LinkedList<Integer>();        	
	}
	
	/* Find if a key is present in the set. Returns true if the key is present, otehrwise false.*/
	public boolean find(int key) {
        //returns the return value of the linked list function contains which
        //checks the list for the provided key parameter  
         return list.contains(key);
	}
	
	/* Insert a key into the set. */
	public void insert(int key) {
		// Make sure that the key is not present.    
		assert (!find(key));
        //if the key is not present then add it.  
        //doesnt bother with sorting cause the sorting
        //will be done right before printing
	    list.add(key);
    }

	/* Remove a key from the set. */
	public void remove(int key) {
        //makes sure the key passed is present in the list
		assert (find(key));
        //finds the index of the key then passes that into the remove function
	    list.remove(list.indexOf(key));
	}
	
	/* Print the contents of the set in sorted order. */
	public void print() {
       //sorts the list in ascending order   
       Collections.sort(list);
       
       
       //goes through a for loop of size = list.size
       //printing out the value at list's index i followed by a space
       //with a new line at the end for formatting reasons
        for(int i= 0; i < list.size(); i++)
        {
            System.out.print(list.get(i)+ " ");
        }

        System.out.println();


	}
}
