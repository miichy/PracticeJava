package CountDownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable{
	
	private CountDownLatch downLatch;
	private String name;
	
	public Worker(CountDownLatch downLatch,String name){
		this.downLatch = downLatch;
		this.name = name;
	}
	
	public void run(){
		this.doWork();
		try{
			TimeUnit.SECONDS.sleep(new Random().nextInt(10));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(this.name + " have done the work.");
		this.downLatch.countDown();
	}
	
	public void doWork(){
		System.out.println(this.name + " doing work~~~");
	}

}
