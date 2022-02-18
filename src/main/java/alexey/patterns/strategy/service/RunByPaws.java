package alexey.patterns.strategy.service;

public class RunByPaws implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I can run using my paws!");
    }
}
