/**
 * Singleton EAGER
 *
 * @autor leofab
 */
public class SingletonEager {

    private static SingletonEager eager = new SingletonEager();;

    private SingletonEager(){
        super();
    }
    public static SingletonEager getInstance(){
        return eager;
    }
}
