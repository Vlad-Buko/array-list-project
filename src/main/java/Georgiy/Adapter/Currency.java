package Georgiy.Adapter;

public class Currency {
    private String[] item;
    public Currency() { item = new String[]{"USD = 30.3183", "EUR = 33.0358", "RUB = 0.3900", "PLN = 7.3632"}; }
    public void Currency() {
        System.out.println("Курс валют: ");
        for(int i = 0; i < item.length; i++)
            System.out.println(item[i]);
    }
}
