package MultiThreads;

public class MyThread extends Thread{
	
	public void run(){
		System.out.println("Thread Number : " + Thread.currentThread());
	}

}
