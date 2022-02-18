package alexey.patterns.strategy.model;

import alexey.patterns.strategy.service.CatVoice;
import alexey.patterns.strategy.service.RunByPaws;

public class Cat extends Pet {
    public Cat(int weight) {
        super(weight);
        moveBehavior = new RunByPaws();
        voiceBehavior = new CatVoice();
    }

    @Override
    public void display() {
        System.out.println("Im cat!");
    }
}
