public class SingletonAPI {
    private static SingletonAPI singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}
