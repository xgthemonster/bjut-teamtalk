package tt;

import   java.net.*;

public class Server extends Thread {
	
	public Server(){

		this.start();	

	}
	
	public void run(){
		
		//服务器监听来自10000端口的消息……
		try {
			ServerSocket ss=new ServerSocket(10000);
			while (true) {
				Socket s = ss.accept();
				//list.add(s); //将新的套接字s放进list里！
				new ServerThread(s);//通过此接口执行多线程命令
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}

