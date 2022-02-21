package Alexander.FactoryPattern.SingletonPattern;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("Обьект создан в единственном экземпляре");
    }
}
