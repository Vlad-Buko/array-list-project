package Georgiy.Strategy;

public class Payment {
    private Book book;
    public Payment(Book book) {
        this.book = book;
    }
    public void buy(int price){
        book.buy(price);
    }
}
