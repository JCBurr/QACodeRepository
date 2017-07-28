import java.awt.*;

public class Main
{
	public static void main(String[] args)
	{
		
		Frame win = new Frame();
		TextField field = new TextField();
		Button button = new Button("Hello");

		Event1 e = new Event1(field);
		
		button.addActionListener(e);
		win.add(field, BorderLayout.NORTH);
		win.add(button, BorderLayout.CENTER);
		win.setSize(300, 300);
		win.setVisible(true);
	}

}
