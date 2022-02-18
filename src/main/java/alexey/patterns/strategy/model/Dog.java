package alexey.patterns.strategy.model;

import alexey.patterns.strategy.service.DogVoice;
import alexey.patterns.strategy.service.RunByPaws;

public class Dog extends Pet {
    public Dog(int weight) {
        super(weight);
        moveBehavior = new RunByPaws();
        voiceBehavior = new DogVoice();
    }

    @Override
    public void display() {
        System.out.println("Im dog!");
    }
}

