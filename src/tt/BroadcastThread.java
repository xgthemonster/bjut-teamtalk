package tt;
import	java.util.*;


public class BroadcastThread extends Thread {
	Broadcast Listener;
    String InMsg;
    public static ArrayList list;

    public BroadcastThread(){

    	list = new ArrayList();  //这个ArrayList是用来存储用来通讯的IP的地址的  
    	
    	Listener = new Broadcast();  //初始化Broadcast
    	
    	Listener.SendIP();  //程序打开以后会发送一次广播包

    	this.start();
    }
    
    //由于需要监听，所以在此多开一个线程
    public void run()
    {
    	MakeConnection sb = new MakeConnection(); //MakeConnection类 在这里实例化
    
    	
    	while(true)
        {
        	System.out.println("caonima");
    		
    		InMsg = Listener.ReceiveIp();   // 接收广播数据
    		
    	   	System.out.println(InMsg);
        	
        	//System.out.println(InMsg);
        	
        //	if(InMsg.equals("exit")){
        		
      //  		list.remove();
      //  	}
        	
        	 if(!list.contains(InMsg))
        	 {

        		list.add(InMsg);   //如果接收到不重复的ip（也就是用户） 将这个ip添加进list里 相当于在线用户列表
          	
        		Listener.SendIP();   //
            	
        		sb.Connect(InMsg);   // 根据接收到的ip进行连接

        	}
        	 

        	
        }
    }

}
