package alexey.patterns.factory.model;

public class Car {
    private String color;
    private String vin;

    public Car(String color, String vin) {
        this.color = color;
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String color;
        private String vin;

        public CarBuilder() {
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder vin(String vin) {
            this.vin = vin;
            return this;
        }
        public Car build(){
            return new Car(color,vin);
        }

    }
}

