package vladislav.templates.adapter;

public class MotorcycleWheel implements wheelSpin {
    private MotorcycleEngine motorcycleEngine;

    public MotorcycleWheel(MotorcycleEngine motorcycleEngine) {
        this.motorcycleEngine = motorcycleEngine;
    }

    @Override
    public void spin() {
        motorcycleEngine.movieMotorcycle();
    }
}
