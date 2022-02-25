package Georgiy.Strategy;

public class Cash implements Book{
    @Override
    public void buy(int price) {
        System.out.println("Оплата наличными " + price);
    }
}
