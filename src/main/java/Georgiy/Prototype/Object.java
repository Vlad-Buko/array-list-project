package Georgiy.Prototype;

public class Object implements Prototype {

    private Type[] type;

    public enum Type {
        Integer,
        String,
        Boolean,
        Double,
        Float
    }

    @Override
    public Object prototype() {
        Object object = new Object();
        return object;
    }

    public void Type(Type[] type) {
        this.type = type;
    }

    public void Print() {
        for (Type type : type)
            System.out.println(type);
    }
}
