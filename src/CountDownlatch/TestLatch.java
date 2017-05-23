package CountDownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestLatch {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		CountDownLatch latch = new CountDownLatch(3);
		Worker w1 = new Worker(latch,"Worker 1");
		Worker w2 = new Worker(latch,"Worker 2");
		Worker w3 = new Worker(latch,"Worker 3");
		
		Boss boss = new Boss(latch);
		
		executor.execute(w1);
		executor.execute(w2);
		executor.execute(w3);
		executor.execute(boss);
		
		executor.shutdown();

	}

}
