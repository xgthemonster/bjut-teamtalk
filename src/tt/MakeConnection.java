package tt;

import	java.io.*;
import	java.net.*;
import	java.util.ArrayList;


public class MakeConnection
{
	Socket s;

	static ArrayList listOut = new ArrayList();
	
    //ȫ�ֱ����Ķ�����

    public void Connect(String ip){
	
    	try{	 
	        s=new Socket(ip,10000);	   

	        listOut.add(s);
		}
        catch(IOException   ex)
        {
        	ex.printStackTrace();
        }
        
    }
 
}