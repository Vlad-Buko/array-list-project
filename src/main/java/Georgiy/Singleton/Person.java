package Georgiy.Singleton;

class Person {
    private static Person instance;
    public String say;
    private Person(String value) { this.say = value; }
    public static Person get(String value) {
        instance = new Person(value);
        return instance;
    }
    public void set() { System.out.println(say); }
}
