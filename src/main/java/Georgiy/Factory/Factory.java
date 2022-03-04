package Georgiy.Factory;

public class Factory {
    public Quality State() {
        High high = new High();
        high.State();
        Middle middle = new Middle();
        middle.State();
        Low low = new Low();
        low.State();
        return null;
    }
}
