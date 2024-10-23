import java.util.ArrayList;

public class Oct1 
{
	public static void main(String[] args)
	{
		ArrayList<bear> bears = new ArrayList<>();
		
		// for-each loop
		for (Bear bear : bears) // <--- read as "for each bear in bears..."
		{
			bear.display;
		}
	}
}

/* Primitive / Atomic (methods or variables?): Standard arrays 
 * Objects / Class types: ArrayLists
 * 
 * LINKED LISTS
 * - most beneficial when a lot of adding and removing will take place
 * - if instead, you often need to search it, then you should use arrays
 * - great for queues (FIFO 'waiting lines')
 * 
 * A node contains:
 * - previous
 * - data
 * - next
 *
 * Front (related to the data) is fragile, it must be correct otherwise it is worthless
 * 	- only use it to look something up
 * 	- if you need to access it for some reason, create a temp of the element
 * 		you need
 * 
 * ADDING A NEW ELEMENT IN A LINKED LIST EXAMPLE:
 * 		temp = front; // find location
 * 
 * 		add.prev = temp;
 * 		add.next = temp.next;
 * 		temp.next = add;
 * 		add.next.prev = add;
 * 
 * REMOVING AN ELEMENT FROM A LINKED LIST EXAMPLE:
 * 		rem.prev.next = rem.next;
 * 		rem.next.prev = rem.prev;
 * 
 * you can have a variable of type 'list' and instantiate either an ArrayList or 
 * a LinkedList object to it. this separates the interface from the implementation
 * 	EXAMPLE
 * 	iPhoneApps = new ArrayList<String>;
 * 	... // later in the program
 *  iPhoneApps = new LinkedList<String>;
 *  
 * QUEUE
 * - first in, first out (FIFO)
 * 
 * STACK
 * - last in, first out (LIFO)
 * - we add (push) and remove (pop) elements at the top
 * 
 * if you can maintain an array that is never less than half full, you can prove that
 * it will be in Big O notation mathematically
 */











