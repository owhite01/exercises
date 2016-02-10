package singleton;


public class SingletonEager {
    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return new SingletonEager();
    }

}
