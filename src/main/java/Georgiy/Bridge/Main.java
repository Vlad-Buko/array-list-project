package Georgiy.Bridge;

public class Main {
    public static void main(String[] args){
        Games games = new Game();
        Plays plays = new Play(games);
        plays.request();
    }
}
