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
	            // 构造数据广播组标示符 (波段)
			BroadcastGroup = InetAddress.getByName("230.0.0.1");
     
	        	// 构造数据发送端口
	        Sender	= new DatagramSocket(1128);
	            
	        	// 构造数据接收端口 (频率)……用来监听！！！
	        ReceiverSocket	= new MulticastSocket(1126);
	            
	        	// 指定数据接收端口的数据广播组 (波段)
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
        	
      	    // 字节序列b里是本机的ip
        	b = ip.getBytes();
            packet = new DatagramPacket(b, b.length, BroadcastGroup, 1126);
            
            // 发送数据包
            Sender.send(packet);
            
            System.out.println("fdjslafjdl");
            
        } catch (Exception e) {}
    }
	
	public String ReceiveIp()
	{
        byte[] b = new byte[1024];
        String InMsg;
             
        DatagramPacket packet = new DatagramPacket(b, 1024);    // 构造一个空的数据包
 
        try{	              
        	ReceiverSocket.receive(packet); // 接收数据
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
        	
      	    // 字节序列b里是本机的ip
        	b = sign.getBytes();
            packet = new DatagramPacket(b, b.length, BroadcastGroup, 1126);
        
            
            // 发送数据包
            Sender.send(packet);
            
        } catch (Exception e) {}
	}



}
