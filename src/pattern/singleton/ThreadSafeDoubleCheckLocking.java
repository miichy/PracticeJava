package pattern.singleton;

public final class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking () {
        if (instance != null) {
            throw new IllegalStateException("already exists!");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance(){

        ThreadSafeDoubleCheckLocking reulst = instance;
        if (reulst == null){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                reulst = instance;
                if (reulst == null){
                    instance = reulst = new ThreadSafeDoubleCheckLocking();
                }
            }
        }

        return reulst;

    }

}
