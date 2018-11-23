package tt;

public class Main {
	
	public static void main(String[] args) {

		UserInterface ui = new UserInterface();
		
		ui.btnSend.addActionListener(new ButtonFunction_Send());
		
		ui.btnExit.addActionListener(new ButtonFunction_Exit());
		
		UserInterface.txaInput.addActionListener(new ButtonFunction_Send());
				
		new Server();
		    			
		new BroadcastThread();
		
	}

}
