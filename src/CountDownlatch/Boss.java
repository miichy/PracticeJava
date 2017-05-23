package CountDownlatch;

import java.util.concurrent.CountDownLatch;

public class Boss implements Runnable{

	private CountDownLatch downLatch;
	
	public Boss(CountDownLatch downLatch){
		this.downLatch = downLatch;
	}

	@Override
	public void run() {
		System.out.println("The Boss is waiting for the work being done.");
		try{
			this.downLatch.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("The workers have done the work.Boss is checking!");
	}
	
}
