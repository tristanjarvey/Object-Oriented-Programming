
public class Sept17 {

}

/* memory locations are stored in hexadecimal notation
 *
 * if we declare a new reference variable and assign it the same address as another
 * it will point to the same object as that variable, rather than being a separate
 * object -- EX:
 * 		Natural n1 = new Natural();
 * 		n1.inc();
 * 		Natural n2 = n1;
 * 		n2.inc();
 * -- In the above case, n2 now points to the same object as n1, therefore calling either
 * n1.inc(); OR n2.inc(); will increment the same object. Simply declaring the new
 * variable 'n2' and instantiating it to 'n1' will essentially create two reference
 * variables that point to the same object (i.e. either one could manipulate or 
 * alter the data within that object)
 * 
 * Instead what we should do is first instantiate two separate reference variables,
 * then we can copy all of the first variables attributes to the second
 * 
 * public Car makeCopy()
 * {
 * 		Car car = new Car();
 * 		car.make = this.make;
 * 		car.year = this.year;
 * 
 * 		return car;
 * }
 * 
 * If we leak the reference to an object outside of the method (e.g. by returning
 * 'car' to assign to a reference variable within the driver like in the method above),
 * it will persist as long as that reference variable exists
 * 
 * Suppose two reference variables 'car1' and 'car2' - comparing them using
 * (car1 == car2) would return false because it's comparing the references, rather
 * than the actual values of each. to compare the values of two objects, we need to
 * write a method (as below):
 * 
 * public boolean equals(Car2 guest)
 * {
 * 		return (this.make.equals(guest.make)) && (this.year == guest.year) && +
 * 				(this.color.equals(guest.color));
 * }
 * 
 * -- the parameter type is the name of the class when passing in an object by 
 * 		reference variable
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */