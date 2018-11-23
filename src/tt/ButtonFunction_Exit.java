package tt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFunction_Exit implements ActionListener
{
	public void actionPerformed(ActionEvent e)
    {
	//	Broadcast forStop = new Broadcast();
		
	//	forStop.SendTerminalSign();
		
		System.exit(0);
    }
}
