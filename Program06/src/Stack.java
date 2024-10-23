
public class Stack
{
	private DynArray data;
	
	public Stack()
	{
		this.data = new DynArray();
	}
	
	public int size()
	{
		return this.data.elements();
	}
	
	public boolean isEmpty()
	{
		if(this.data.elements() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(double value)
	{
		this.data.insert(value);
	}
	
	public double pop()
	{
		if(this.data.elements() != 0)
		{
			return this.data.remove();
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public void stackDump()
	{
		this.data.printStackDump();
	}
}
