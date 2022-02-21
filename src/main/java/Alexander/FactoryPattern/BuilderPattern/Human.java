package Alexander.FactoryPattern.BuilderPattern;

public class Human  {
    public final int age;
    public final int weight;
    public final int growth;
    public final int bloodType;
    public final int suitSize;


    public static class Builder
    {
        //Обязательные параметры

            public  int age;
        //Необязательные параметры со значениями по умолчанию
        public  int weight ;
        public  int growth ;
        public  int bloodType;
        public  int suitSize;

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
            bloodType = val;
            return this;
        }
        public Builder suit_size (int val) {
            suitSize = val;
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
        bloodType = builder.bloodType;
        suitSize = builder.suitSize;
    }
}
