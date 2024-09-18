
public class SMouse
{
  private int age = 0;
  private double weight = 1.0;

  public void grow(int age)
  {
	for(int i = 0; i < age; i++)
	{
		this.weight += 0.2 * this.age;
	    ++this.age;
	}
  }

  public void display(int age)
  {
	  System.out.println("Age: " + this.age);
	  System.out.println("Weight: " + this.weight);
  }
}
