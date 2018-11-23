package tt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Iterator;

public class ButtonFunction_Send implements ActionListener
{
	PrintWriter out;

	String ip_out;

	InetAddress ad;
	
	
	//用于发送聊天信息的类 将输入框的内容发送出去 并且清空
	public void actionPerformed(ActionEvent e)
    {
		String sa = UserInterface.txaInput.getText();
    	try
			{
			ad = InetAddress.getLocalHost();
  			ip_out = ad.toString();
  			
  	        if(sa.equals("")==false)
		    {
  	        	Iterator iterator = MakeConnection.listOut.iterator();
				
  	        	while(iterator.hasNext()){
					PrintWriter o=new PrintWriter(new BufferedWriter(new OutputStreamWriter(((Socket)(iterator.next())).getOutputStream())),true);
					o.println(sa);
					o.println(ip_out);
				}   				
				UserInterface.txaInput.setText("");
            }
			
		}
		
		    catch (Exception ex)
	    {
			;
		}
		
 	}
}
