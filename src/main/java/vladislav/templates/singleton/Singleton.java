package vladislav.templates.singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    public String getValue() {
        return value;
    }

    public Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
