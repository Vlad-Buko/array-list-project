package Georgiy.Facade;

public class Parts implements PC {

    private Parts cpu;

    public void Intel(){
        cpu = new Parts();
        System.out.println("Intel");
    }

    public void AMD(){
        cpu = new Parts();
        System.out.println("AMD");
    }

    @Override
    public void model() {
        Intel();
        AMD();
    }

}
