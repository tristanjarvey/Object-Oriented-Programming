
public class Circle
{
	private double radius;
	
	public Circle()
	{
		this.radius = 1;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	private void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public void resize(double newRadius)
	{
		setRadius(newRadius);
	}
	
	public Circle clone()
	{
		Circle circleClone = new Circle();
		circleClone.radius = this.radius;
		return circleClone;
	}
	
	void print()
	{
		System.out.print("radius = " + this.radius);
	}
	
	boolean equals(Circle guest)
	{
		if(guest.radius == this.radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
