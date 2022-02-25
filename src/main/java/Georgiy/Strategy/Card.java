package Georgiy.Strategy;

public class Card implements Book{
    @Override
    public void buy(int price) {
        System.out.println("Безналичный расчет " + price);
    }
}
