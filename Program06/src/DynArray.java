
public class DynArray
{
	// INSTANCE VARIABLES *********************************************************
	private double[] array;
	private int size; // always a power of 2 (i.e. 2^0, 2^1,..., 2^n)
	private int nextIndex;
	
	// CONSTRUCTORS ***************************************************************
	
	public DynArray()
	{
		this.array = new double[1];
		this.size = 1; // 2^0
		this.nextIndex = 0;
	}
	
	// ACCESSORS ******************************************************************
	
	public int arraySize()
	{
		return this.size;
	}
	
	public int elements() 
	{
		return this.nextIndex;
	}
	
	public double at(int index)
	{
		if(0 <= index && index < this.nextIndex)
		{
			return this.array[index];
		}
		else
		{
			return Double.NaN;
		}
	}
	
	public void printArray()
	{
		for(int i=0; i<this.nextIndex; i++)
		{
			if(array[i] == 0.0)
			{
				break;
			}
			else
			{
				System.out.print(array[i] + ", ");
			}
		}
	}
	
	public void printStackDump()
	{
		for(int i=this.nextIndex-1; i>=0; i--)
		{
			System.out.print(array[i] + ", ");
		}
	}
	
	// MUTATORS *******************************************************************
	
	public void insertAt(int index, double value)
	{
		if(0 <= index && index <= this.nextIndex)
		{
			if(this.nextIndex == this.size)
			{
				grow();
			}
			for(int i=this.nextIndex; i>index; i--)
			{
				this.array[i] = this.array[i-1];
			}
		
			this.array[index] = value;
			this.nextIndex++;
		}
		// do we need to call grow() before or after?
	}
	
	public void insert(double value)
	{
		if(this.nextIndex == this.size)
		{
			grow();
		}
		this.array[nextIndex++] = value;
	}
	
	public double removeAt(int index)
	{
		if(0 <= index && index < this.nextIndex)
		{
			double value = this.array[index];
			for(int i=index; i<this.nextIndex-1; i++)
			{
				this.array[i] = this.array[i+1];
			}
			
			this.nextIndex--;
			
			if (this.nextIndex > 0 && this.size > 1 && this.nextIndex <= this.size / 4)
			{
	            shrink();
	        }
			
			return value;
		}
		
		return Double.NaN;
	}
	
	public double remove()
	{
		return removeAt(this.nextIndex-1);
	}
	
	// ALL OTHER ******************************************************************
	
	private void grow()
	{
		int newSize = 2 * this.size;
		double[] newArray = new double[newSize];
		
		for(int i=0; i<=nextIndex-1; i++)
		{
			newArray[i] = this.array[i];
		}
		
		this.array = newArray;
		this.size = newSize;
	}
	
	private void shrink()
	{
		if(this.size > 1)
		{
			int newSize = this.size / 2;
			double[] myArray = new double[newSize];
			
			for(int i=0; i<=nextIndex-1; i++)
			{
				myArray[i] = this.array[i];
			}
			
			this.array = myArray;
			this.size = newSize;
		}
	}
}
