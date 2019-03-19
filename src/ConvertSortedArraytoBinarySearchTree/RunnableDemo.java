package ConvertSortedArraytoBinarySearchTree;

public class RunnableDemo implements Runnable{

    private Thread thread;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println(" This is thread : " + threadName + " starting");
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override public void run() {
        System.out.println("Running ....  ");

        try {
            for (int i = 0;i < 4;i++){
                System.out.println("Thread : " + threadName + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread : " + threadName + " interrupted");
        }

        System.out.println("Thread :");
    }


    public static void main(String[] args) {
        RunnableDemo demo1 = new RunnableDemo("demo1");
        RunnableDemo demo2 = new RunnableDemo("demo2");
        demo1.run();
        demo2.run();
    }

}
