package Georgiy.Strategy;

public class Main {
    public static void main(String[] args){
        Payment payment = new Payment(new Card());
        payment.buy(145);
        payment = new Payment(new Cash());
        payment.buy(220);
    }
}
