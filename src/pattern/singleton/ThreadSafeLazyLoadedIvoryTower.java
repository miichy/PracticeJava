package pattern.singleton;

public final class ThreadSafeLazyLoadedIvoryTower {

    private static ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower () {
        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("already exsits!");
        }

    }

    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance(){
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }

        return instance;
    }

}
