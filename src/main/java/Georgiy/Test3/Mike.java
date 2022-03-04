package Georgiy.Test3;

public class Mike extends Character {

    Character character;

    public void Character() {
        character = new Character();
        character.FirstName = "Mike";
        character.LastName = "Douglas";
        character.age = 0 + (int) (Math.random() * 100);
        character.repute = 0 + (int) (Math.random() * 10);
        character.iq = 0 + (int) (Math.random() * 300);
    }

    public void Print() {
        Character();
        System.out.println("<-- CHARACTER -->");
        System.out.println("FirstName: " + character.FirstName);
        System.out.println("LastName: " + character.LastName);
        System.out.println("Age: " + character.age);
        System.out.println("Repute: " + character.repute);
        System.out.println("IQ: " + character.iq);
    }
}
