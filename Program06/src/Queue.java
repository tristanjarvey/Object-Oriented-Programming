
public class Queue
{
	private DynArray data;
	
	public Queue()
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
	
	public void que(double value)
	{
		this.data.insert(value);
	}
	
	public double deQue()
	{
		if(this.data.elements() != 0)
		{
			return this.data.removeAt(0);
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public void queueDump()
	{
		this.data.printArray();
	}
}
