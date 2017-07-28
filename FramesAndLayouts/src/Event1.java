import java.awt.TextField;
import java.awt.event.*;

public class Event1	implements ActionListener
{
	TextField x;

	public Event1 (TextField y)
	{
		x = y;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		x.setText("Hello.");
		
	}
}
