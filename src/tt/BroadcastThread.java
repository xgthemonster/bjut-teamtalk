package tt;
import	java.util.*;


public class BroadcastThread extends Thread {
	Broadcast Listener;
    String InMsg;
    public static ArrayList list;

    public BroadcastThread(){

    	list = new ArrayList();  //���ArrayList�������洢����ͨѶ��IP�ĵ�ַ��  
    	
    	Listener = new Broadcast();  //��ʼ��Broadcast
    	
    	Listener.SendIP();  //������Ժ�ᷢ��һ�ι㲥��

    	this.start();
    }
    
    //������Ҫ�����������ڴ˶࿪һ���߳�
    public void run()
    {
    	MakeConnection sb = new MakeConnection(); //MakeConnection�� ������ʵ����
    
    	
    	while(true)
        {
        	System.out.println("caonima");
    		
    		InMsg = Listener.ReceiveIp();   // ���չ㲥����
    		
    	   	System.out.println(InMsg);
        	
        	//System.out.println(InMsg);
        	
        //	if(InMsg.equals("exit")){
        		
      //  		list.remove();
      //  	}
        	
        	 if(!list.contains(InMsg))
        	 {

        		list.add(InMsg);   //������յ����ظ���ip��Ҳ�����û��� �����ip��ӽ�list�� �൱�������û��б�
          	
        		Listener.SendIP();   //
            	
        		sb.Connect(InMsg);   // ���ݽ��յ���ip��������

        	}
        	 

        	
        }
    }

}
