package tt;
import java.io.*;
import java.net.*;

public class Broadcast{
	MulticastSocket ReceiverSocket;
	DatagramSocket	Sender;
	InetAddress BroadcastGroup;
	
	public Broadcast(){
		try
	    {		
	            // �������ݹ㲥���ʾ�� (����)
			BroadcastGroup = InetAddress.getByName("230.0.0.1");
     
	        	// �������ݷ��Ͷ˿�
	        Sender	= new DatagramSocket(1128);
	            
	        	// �������ݽ��ն˿� (Ƶ��)������������������
	        ReceiverSocket	= new MulticastSocket(1126);
	            
	        	// ָ�����ݽ��ն˿ڵ����ݹ㲥�� (����)
	        ReceiverSocket.joinGroup(BroadcastGroup);
	        	    
	    } catch (Exception e) {}
	}
	
	public void SendIP()
    {
        byte[] b = new byte[1024];
        DatagramPacket packet;
        String ip;
        
        try
        {
        	InetAddress addr = InetAddress.getLocalHost();
      	    ip = addr.getHostAddress().toString();
        	
      	    // �ֽ�����b���Ǳ�����ip
        	b = ip.getBytes();
            packet = new DatagramPacket(b, b.length, BroadcastGroup, 1126);
            
            // �������ݰ�
            Sender.send(packet);
            
            System.out.println("fdjslafjdl");
            
        } catch (Exception e) {}
    }
	
	public String ReceiveIp()
	{
        byte[] b = new byte[1024];
        String InMsg;
             
        DatagramPacket packet = new DatagramPacket(b, 1024);    // ����һ���յ����ݰ�
 
        try{	              
        	ReceiverSocket.receive(packet); // ��������
	    } catch (IOException e) {}
	    
		b = packet.getData();
		InMsg = new String(b);
		
		return InMsg;

	}
	
	public void SendTerminalSign()
	{
        byte[] b = new byte[1024];
        DatagramPacket packet;
        String sign;
        
        try
        {
        	sign = "exit";
        	
      	    // �ֽ�����b���Ǳ�����ip
        	b = sign.getBytes();
            packet = new DatagramPacket(b, b.length, BroadcastGroup, 1126);
        
            
            // �������ݰ�
            Sender.send(packet);
            
        } catch (Exception e) {}
	}



}
