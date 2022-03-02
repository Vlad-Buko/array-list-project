package Georgiy.Adapter;

public class MyCurrency {
    private String[] item;
    public MyCurrency() { item = new String[]{"USD = 0.3183", "EUR = 0.0358", "RUB = 0.3900", "PLN = 0.3632"}; }
    public void MyCurrency() {
        System.out.println("Мой курс валют: ");
        for(int i = 0; i < item.length; i++)
            System.out.println(item[i]);
    }
}
