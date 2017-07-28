
public class JavaMain
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		Line l = new Line();
		doDrawing(c);
		doDrawing(l);
	}

	public static void doDrawing(Draw x)
	{
		x.drawing(x);
	}
}
