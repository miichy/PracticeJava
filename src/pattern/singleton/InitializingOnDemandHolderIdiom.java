package pattern.singleton;

public final class InitializingOnDemandHolderIdiom {

    private InitializingOnDemandHolderIdiom () {};

    public static InitializingOnDemandHolderIdiom getInstance(){
        return HelperHolder.INSTANCE;
    }

    private static final class HelperHolder{
        private static final  InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }

}
