
import java.util.Scanner;

public class SMouseDriver
{
  public static void main(String[] args) 
  {
    Scanner stdIn = new Scanner(System.in);
	
    SMouse mighty = new SMouse();  
    SMouse mickey = new SMouse();

    System.out.print("Please enter an age for Mighty mouse: ");
    int ageMighty = stdIn.nextInt();
    mighty.grow(ageMighty);
    mighty.display(ageMighty);
    
    System.out.print("Please enter an age for Mickey mouse: ");
    int ageMickey = stdIn.nextInt();
    mickey.grow(ageMickey);
    mickey.display(ageMickey);
    
    stdIn.close();
  }
}