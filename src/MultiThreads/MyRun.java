package MultiThreads;

public class MyRun implements Runnable{
	private int x = 0;

	@Override
	public void run() {
		System.out.println("MyRun number : " + (++x));
	}

}
