package dio.projectpatterns.singleton;

/**
 * Singleton LAZY
 *
 * @autor leofab
 */
public class SingletonLazy {

    private static SingletonLazy lazy;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstance(){
        if(lazy == null){
            lazy = new SingletonLazy();
        }
        return lazy;
    }
}
