package alexey.patterns.strategy.service;

public class RepeatAnyVoice implements VoiceBehavior {
    @Override
    public void makeVoice() {
        System.out.println("I can repeat anything you say!");
    }
}
