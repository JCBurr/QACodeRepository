
public class JavaMain
{
	public static void main(String[] args)
	{
		CustomStack newStack = new CustomStack();
		
		newStack.pushToStack(2);
		newStack.pushToStack(17);
		newStack.pushToStack(23);
		newStack.pushToStack(9);
		newStack.pushToStack(65);
		newStack.pushToStack(6);
		newStack.pushToStack(93);
		newStack.peekAtStack();
		newStack.popFromStack();
		newStack.peekAtStack();
		newStack.popFromStack();
		newStack.popFromStack();
		newStack.popFromStack();
		newStack.popFromStack();
		newStack.popFromStack();
		newStack.popFromStack();
	}
}
