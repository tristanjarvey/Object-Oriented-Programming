
public class Oct10
{
	public static void main(String[] args)
	{
		int b = 4;
		System.out.print(++b);
	}
}

/* To determine min and max values of Integer types, take:
 * [-2^(n-1), -1] U [0, 2^(n-1)-1]
 * 	In other words, [-2^(n-1), -1] is the min & [0, 2^(n-1)-1] is the max, given that
 * 	n = the number of bits (i.e. byte = 8 bits; short = 16 bits; int = 32 bits)
 */