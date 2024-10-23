public class Circle
{
  private static int instanceCnt = 0; // class variable, doesn't change for entire class
  private double radius; // instance variable, will depend on the calling object
  
  private static final double PI = 3.14159;
  private String unit = "cm";


  public static int getInstanceCnt()
  {
    return Circle.instanceCnt; // using 'Circle.' because it is a static class variable
  }

  private static void setInstanceCnt(int insCnt)
  {
    Circle.instanceCnt = insCnt;
  }

  // Default constructor, no parameters
  public Circle()
  {
    this(0.0);
  }

  // Specifying constructor, contains specifying parameters
  public Circle(double newRadius)
  {
    Circle.setInstanceCnt(Circle.getInstanceCnt() + 1);
    this.setRadius(newRadius);
  }
  
  // Copy constructor, passing in an object
  public Circle(Circle guest)
  {
    this(guest.getRadius());
  }
  
  /* It is standard to handle the default and copy constructors using the specifying
   * constructor
   */

  public double getRadius()
  {
    return this.radius;
  }

  private void setRadius(double radius)
  {
    if (radius >= 0)
      this.radius = radius;
    else
      this.radius = 0;
  }
  
  private void setRadius()
  {
	  this.setRadius(0);
  }
  
  public String getUnit()
  {
    return this.unit;
  }

  public void resize(double newRadius)
  {
    this.setRadius(newRadius);
  }

  public Circle clone()
  {
    return new Circle(this.getRadius());
  }

  public boolean equals(Circle guest)
  {
    return guest.getRadius() == this.getRadius();
  }
  
  public double area()
  {
	  return PI * this.getRadius() * this.getRadius(); // Area of circle = PI(r^2)
  }
  
  public void print()
  {
    System.out.println("The circle\'s radius is " +
    this.getRadius() + "cm");
  }
}
