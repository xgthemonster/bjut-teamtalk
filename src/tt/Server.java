package tt;

import   java.net.*;

public class Server extends Thread {
	
	public Server(){

		this.start();	

	}
	
	public void run(){
		
		//��������������10000�˿ڵ���Ϣ����
		try {
			ServerSocket ss=new ServerSocket(10000);
			while (true) {
				Socket s = ss.accept();
				//list.add(s); //���µ��׽���s�Ž�list�
				new ServerThread(s);//ͨ���˽ӿ�ִ�ж��߳�����
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}

