package Georgiy.Singleton;

public class Main {
    public static void main(String[] args){
        Person person = Person.get("Привет, мир!!!");
        person.set();
    }
}
