package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable{

	private CyclicBarrier cyclicBarrier;
	private String name;
	
	public Worker(CyclicBarrier cyclicBarrier,String name){
		this.cyclicBarrier = cyclicBarrier;
		this.name = name;
	}
	
	public void run(){
		System.out.println(name + " is doing work...");
		try{
			Thread.sleep(3000);
			System.out.println(name + " not easy");
			cyclicBarrier.await();
		}catch(Exception e){
			
		}
		System.out.println(name + " : others done the job. Begin again.");
	}
	
}
