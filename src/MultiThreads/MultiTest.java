package MultiThreads;

public class MultiTest {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 10;i++){
			Thread t = new MyThread();
			t.start();
		}
		
		Thread.sleep(10000);
		MyRun r = new MyRun();
		for(int i = 0;++i < 10;){
			Thread t = new Thread(r);
			t.start();
		}
	}

}
