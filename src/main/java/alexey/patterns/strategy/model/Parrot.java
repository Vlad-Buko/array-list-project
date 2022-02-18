package alexey.patterns.strategy.model;

import alexey.patterns.strategy.service.FlyByWings;
import alexey.patterns.strategy.service.RepeatAnyVoice;

public class Parrot extends Pet {
    public Parrot(int weight) {
        super(weight);
        voiceBehavior = new RepeatAnyVoice();
        moveBehavior = new FlyByWings();
    }

    @Override
    public void display() {
        System.out.println("Im parrot!");
    }
}

