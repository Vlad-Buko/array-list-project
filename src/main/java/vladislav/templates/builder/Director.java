package vladislav.templates.builder;

public class Director {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withAge(23)
                .withLastName("Buko")
                .withName("vlad")
                .withRang("Captain four rang")
                .withSpeciality("Speciality")
                .build();
        System.out.println(person.toString());
    }
}
