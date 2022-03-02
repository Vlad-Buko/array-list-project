package Georgiy.Adapter;

public class Main {
    public static void main(String[] args){
        Currency currency = new Currency();
        currency.Currency();
        Adapter adapter = new Adapter(new MyCurrency());
        adapter.Currency();
    }
}
