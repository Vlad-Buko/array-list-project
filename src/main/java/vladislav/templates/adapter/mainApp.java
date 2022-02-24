package vladislav.templates.adapter;

public class mainApp {
    public static void main(String[] args) {
        MotorcycleWheel moto = new MotorcycleWheel(new MotorcycleEngine());
        moto.spin();
    }
}
