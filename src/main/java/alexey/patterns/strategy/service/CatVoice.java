package alexey.patterns.strategy.service;

public class CatVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("Meow!");
    }
}

