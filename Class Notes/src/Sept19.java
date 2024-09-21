
public class Sept19 {

}

/* CONSTRUCTORS
 * - allows you to decide what happens when an object is instantiated with 'new'
 * - has 'no' return, not void
 * 	EX: Car jamesCar = new Car("Corolla", 2006, "silver")
 * 		- "Corolla", 2006, "silver" are constructor calls
 * - Java compiler provides an empty-bodied zero-parameter default constructor for
 * a class if and only if the class contains no explicitly defined constructors
 * 		> once a constructor has been defined, the default constructor ceases to exist
 * - you can call an overloaded constructor from another overloaded constructor by
 * calling this(-arguments-)
 * - good practice to write the driven class in this order:
 * 		(data)-(accessors)-(mutators)-(constructors)-(all other instance methods)
 * 
 * INSTANCE CONSTANTS
 * - used to maintain the initial value of a variable upon creation (e.g. someone's
 * name)
 * 		EX: public final String NAME; (placed at the top of the class, before methods)
 */
