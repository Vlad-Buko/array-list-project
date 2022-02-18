package alexey.patterns.strategy.service;

public class FlyByWings implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I can fly using my wings!");
    }
}
