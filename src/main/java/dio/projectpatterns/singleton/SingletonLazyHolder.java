package dio.projectpatterns.singleton;

/**
 * Singleton LAZYHOLDER
 *
 * @autor leofab
 */
public class SingletonLazyHolder {

    private static class Holder {
        private static SingletonLazyHolder lazyHolder = new SingletonLazyHolder();;
    }

    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return Holder.lazyHolder;
    }
}
