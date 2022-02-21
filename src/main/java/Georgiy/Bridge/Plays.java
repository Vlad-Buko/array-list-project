package Georgiy.Bridge;

public abstract class Plays {
    private Games games;
    public Plays(Games games){
        this.games = games;
    }

    public void request(){
        this.games = games;
        games.name();
        games.brand();
        games.genre();
        games.localization();
        games.producing_country();
        games.platform();
        games.age_limit();
        games.developer();
    }

    public Games get(){
        return games;
    }

}
