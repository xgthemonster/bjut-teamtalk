package tt;

import	java.io.*;
import	java.net.*;
import	java.util.ArrayList;


public class MakeConnection
{
	Socket s;

	static ArrayList listOut = new ArrayList();
	
    //全局变量的定义们

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