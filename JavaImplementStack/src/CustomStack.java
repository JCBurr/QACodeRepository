
public class CustomStack
{
	int sizeOfStack = 8;
	int[] stackArray = new int[sizeOfStack];
	int currentStackIndex;

	public void peekAtStack()
	{
		System.out.println("Top of the stack is currently " + stackArray[currentStackIndex]);
	}

	public void pushToStack(int a)
	{
		if (currentStackIndex >= stackArray.length)
		{
			System.out.println("Stack overflow error: stack is full.");
		} else
		{
			currentStackIndex++;
			stackArray[currentStackIndex] = a;
		}
	}

	public void popFromStack()
	{

		if (currentStackIndex <= 0)
		{
			System.out.println("Stack underflow error: stack is empty.");
		} else
		{
			System.out.println("Popped " + stackArray[currentStackIndex]);
			stackArray[currentStackIndex] = 0;
			currentStackIndex--;
		}
	}
}
