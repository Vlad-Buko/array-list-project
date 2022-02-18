package Alexander.BuilderPattern;

public class Human  {
    public final int age;
    public final int weight;
    public final int growth;
    public final int blood_type;
    public final int suit_size;


    public static class Builder
    {
        //Обязательные параметры

            public  int age;
        //Необязательные параметры со значениями по умолчанию
        public  int weight = 0;
        public  int growth = 0;
        public  int blood_type = 0;
        public  int suit_size = 0;

        public Builder(int age) {

            this.age = age;
        }

        public Builder weight (int val) {
            weight = val;
            return this;
        }
        public Builder growth (int val) {
            growth = val;
            return this;
        }
        public Builder blood_type (int val) {
            blood_type = val;
            return this;
        }
        public Builder suit_size (int val) {
            suit_size = val;
            return this;
        }

        public Human build() {
            return new Human (this);
        }
    }

    private Human(Builder builder) {

        age = builder.age;
        weight = builder.weight;
        growth = builder.growth;
        blood_type = builder.blood_type;
        suit_size = builder.suit_size;
    }
}
