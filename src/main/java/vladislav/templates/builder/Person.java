package vladislav.templates.builder;

public class Person {
    private String name;
    private String lastName;
    private String speciality;
    private String rang;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getRang() {
        return rang;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", rang='" + rang + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static class Builder {
        Person person;

        public Builder() {
            person = new Person();
        }

        public Builder withName(String name) {
            person.name = name;
            return this;
        }

        public Builder withLastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder withSpeciality(String speciality) {
            person.speciality = speciality;
            return this;
        }

        public Builder withRang(String rang) {
            person.rang = rang;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            person.height = height;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
