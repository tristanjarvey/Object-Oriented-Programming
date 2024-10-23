public class StackQueueDriver
{
	public static void main(String[] args)
	{
		Stack myStack = new Stack();
		Queue myQueue = new Queue();
		
		System.out.println("Filling Stack:");
		double value;
		for (int s = 1; s < 11; ++s)
		{
			value = s + s/10.0;
			System.out.println("\tpushing " + value);
			myStack.push(value);
		}
		System.out.println("\nStack Dump:");
		myStack.stackDump();
		
		System.out.println("\nEmptying Stack:");
		while(!myStack.isEmpty())
		{
			value = myStack.pop();
			System.out.println("\tpop = " + value);
		}
		System.out.println("\nStack Dump:");
		myStack.stackDump();
		System.out.println("\nA pop too far = " + myStack.pop());
		
		System.out.println("\n");
		
		System.out.println("Filling Queue:");
		for (int q = 1; q < 11; ++q)
		{
			value = 2*q + q/10.0;
			System.out.println("\tqueing " + value);
			myQueue.que(value);
		}
		System.out.println("\nQueue Dump:");
		myQueue.queueDump();
		
		System.out.println("\nEmptying Queue:");
		while(!myQueue.isEmpty())
		{
			value = myQueue.deQue();
			System.out.println("\tdeQue = " + value);
		}
		System.out.println("\nQueue Dump:");
		myQueue.queueDump();
		
		System.out.println("\nA deQue too far = " + myQueue.deQue());
	}
}