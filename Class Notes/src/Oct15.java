
public class Oct15
{
	public static void main(String[] args)
	{
		System.out.println("Test");
		for (int i=0; i<1_000_000_000; i++)
		{
			;
		}
		System.out.println("delay");
		
		// enumerated type usage
		Day day;
		day = Day.FRIDAY;
	}
	
// Enumerated Type: programmer-defined type used to restrict a variable to a
// fixed set of values
	public enum Day
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
}

/* Two most common reasons programs crash:
 * - dividing by 0
 * - indexing arrays or arrayLists out of range
 * 
 * you never NEED to use a "break", avoid them to keep code more easy to understand
 */