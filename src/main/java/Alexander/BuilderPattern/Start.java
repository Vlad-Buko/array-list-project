package Alexander.BuilderPattern;

public class Start {
    public static void main(String[] args) {
        Human human = new Human.Builder(23)
                .weight(67)
                .blood_type(2)
                .growth(182)
                .build();
        Dog dog = new Dog.Builder(2)
                .weight(7)
                .builder();
        Cat cat = new Cat.Builder(3)
                .weight(4)
                .build();


        System.out.println(human.weight+" "+human.age+" "+human.blood_type+" "+human.growth);
        System.out.println(dog.weight+" "+dog.age);
        System.out.println(cat.weight+" "+cat.age);

    }
}
