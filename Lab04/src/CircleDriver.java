
public class CircleDriver
{
	public static void main(String[] args)
	{
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(10.0);
		Circle circle3 = new Circle(circle2);
		
		// circle 1
		circle1.print();
		circle1.resize(2.0);
		circle1.print();
		
		if(circle1.equals(circle2))
		{
			System.out.println("Circle 1 equals Circle 2");
		}
		else
		{
			System.out.println("Circle 1 DOES NOT equal Circle 2");
		}
		
		// circle 2
		System.out.println("Circle 2 radius: " + circle2.getRadius());
		System.out.println("Circle 2 area: " + circle2.area());
		
		if(circle2.equals(circle3))
		{
			System.out.println("Circle 2 EQUALS Circle 3");
		}
		else
		{
			System.out.println("Circle 2 DOES NOT equal Circle 3");
		}
		
		// circle 3
		System.out.println("Circle 3 radius: " + circle3.getRadius());
		System.out.println("Circle 3 area: " + circle3.area());
		
		// Instance count
		System.out.println("Instance count: " + circle1.getInstanceCnt());
	}
}
