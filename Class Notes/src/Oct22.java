
public class Oct22
{
	// PERSON (Employee superclass) CLASS START
	public class Person
	{
		private String name = "";
		
		public Person()
		{}
		
		public Person (String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return this.name;
		}
	}
	// PERSON (Employee superclass) CLASS END
	
	
	// EMPLOYEE (Person subclass, FullTime superclass) CLASS START
	public class Employee extends Person
	{
		private int id = 0;
		
		public Employee()
		{}
		
		public Employee(String name, int id)
		{
			super(name); // this is a constructor call, it must be the first statement in a constructor (as shown here)
			
			this.id = id;
			id++;
		}
		
		public void display()
		{
			System.out.println("Name: " + super.getName());
			System.out.println("ID: " + this.id);
		}
	}
	// EMPLOYEE (Person subclass, FullTime superclass) CLASS END
	
	
	// FULLTIME (Employee subclass) CLASS START
	public class FullTime extends Employee
	{
		private double salary = 0.0;
		
		public FullTime()
		{}
		
		public FullTime(String name, int id, double salary)
		{
			super(name, id);
			this.salary = salary;
		}
	}
	// FULLTIME (Employee subclass) CLASS END

}	
/* INHERITANCE
 * -'Super' class is the most general class that each 'sub' class (specific class) may
 * 	be derived from
 * 		-sub classes inherit the data and methods from super classes
 * 
 * Benefits of inheritance:
 * -reusability of code
 * -smaller modules (splitting classes into sub- and super-classes; i.e. "divide and
 * 	conquer")
 * 		-makes debugging and upgrading easier
 * 
 * -to access super class data and methods, we'll now need to use 'super.' and 'super()'
 * 
 * METHOD OVERRIDING
 * -when a subclass has a method with the same name and all the same parameter types
 * 	as a method in its superclass
 * -an object of the subclass will use the subclass's overriding method (not the
 * 	superclass's overridden method)
 * 		-'this.' will call the subclass's overriding method, 'super.' will call the
 * 		superclass's overridden method
 * 
 * FINAL ACCESS MODIFIER
 * -a 'final' method cannot be overridden by a subclass method
 * -a 'final' class cannot have subclasses
 * 
 * -use the default super call 'super();' within a constructor method (which will call
 * 	the superclass's default constructor) to avoid needing to type in the default
 * 	parameters for each waterfall subclass constructor
 */