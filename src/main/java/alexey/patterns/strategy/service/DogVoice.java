package alexey.patterns.strategy.service;

public class DogVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("Woof!");
    }
}

