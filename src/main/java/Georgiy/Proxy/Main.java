package Georgiy.Proxy;

public class Main {
    public static void main(String[] args){
        Wallpaper wallpaper = new Proxy("Море");
        wallpaper.color();
        wallpaper.size();
        wallpaper.category();
        wallpaper.orientation();
    }
}
