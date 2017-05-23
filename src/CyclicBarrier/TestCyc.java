package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCyc {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		
		Worker w1 = new Worker(cyclicBarrier,"w1");
		Worker w2 = new Worker(cyclicBarrier,"w2");
		Worker w3 = new Worker(cyclicBarrier,"w3");
		
		executor.execute(w1);
		executor.execute(w2);
		executor.execute(w3);
		
		executor.shutdown();
	}

}
