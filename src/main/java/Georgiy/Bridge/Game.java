package Georgiy.Bridge;

public class Game implements Games{

    @Override
    public void name() {
        System.out.println("Название игры");
    }

    @Override
    public void brand() {
        System.out.println("Бренд");
    }

    @Override
    public void platform() {
        System.out.println("Платформа");
    }

    @Override
    public void genre() {
        System.out.println("Жанр");
    }

    @Override
    public void localization() {
        System.out.println("Локализация");
    }

    @Override
    public int age_limit() {
        System.out.println("Возрастное ограничение");
        return 0;
    }

    @Override
    public void developer() {
        System.out.println("Разработчик");
    }

    @Override
    public void producing_country() {
        System.out.println("Страна производитель");
    }
}
