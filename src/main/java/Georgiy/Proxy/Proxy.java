package Georgiy.Proxy;

public class Proxy implements Wallpaper{

    private Object o;
    private Image image;

    public Proxy(Object o){
        image = new Image(o);
        image.Name();
        this.o = o;
    }

    @Override
    public void orientation() {
        image.orientation();
    }

    @Override
    public void category() {
        image.category();
    }

    @Override
    public void size() {
        image.size();
    }

    @Override
    public void color() {
        image.color();
    }
}
