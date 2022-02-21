package Alexander.FactoryPattern.BuilderPattern;

public class Cat  {
   public final int age;
   public final int weight;
   public final int growth;
   public final int bloodType;
   public final int suitSize;

    public Cat(Builder builder) {
        age=builder.age;
        weight = builder.weight;
        growth = builder.growth;
        bloodType = builder.bloodType;
        suitSize = builder.suitSize;
    }

    public static class Builder
   {
       public int age;

       public  int weight;
       public  int growth;
       public  int bloodType;
       public  int suitSize;

       public Builder(int age) {
           this.age = age;
       }

       public Builder weight (int val)
       {
          weight = val;
          return this;
       }
       public Builder growth (int val)
       {
           growth = val;
           return this;
       }
       public Builder bloodType (int val)
       {
           bloodType = val;
           return this;
       }
       public Builder suitSize (int val)
       {
           suitSize = val;
           return this;
       }

       public Cat build()
       {
           return new Cat(this);
       }
   }
}
