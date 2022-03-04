package Georgiy.Prototype;

public class Main {
    public static void main(String[] args){
        Object object = new Object();
        Object prototype = object.prototype();
        prototype.Type(Object.Type.values());
        prototype.Print();
    }
}
