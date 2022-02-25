package Georgiy.Proxy;

public class Image implements Wallpaper{

    private Object o;

    public Image(Object o){
        this.o = o;
        Image(o);
    }

    private Object orientation, color, size, category;

    public void Image(Object o) {;
        orientation = "Вертикальная";
        color = "Синий";
        size = "1920 x 1080";
        category = "Океан";
    }

    public void Name() {
        System.out.println("Название: " + o);
    }

    @Override
    public void orientation() {
        System.out.println("Ориентация: " + orientation);
    }

    @Override
    public void category() {
        System.out.println("Категория: " + category);
    }

    @Override
    public void size() {
        System.out.println("Размер: " + size);
    }

    @Override
    public void color() {
        System.out.println("Цвет: " + color);
    }
}
