package alexey.patterns.strategy.model;

import alexey.patterns.strategy.service.MoveBehavior;
import alexey.patterns.strategy.service.VoiceBehavior;

import java.util.Objects;

public abstract class Pet {
    int weight;
    MoveBehavior moveBehavior;
    VoiceBehavior voiceBehavior;

    protected Pet(int weight) {
        this.weight = weight;
    }

    public abstract void display();

    public void performMove() {
        moveBehavior.move();
    }

    public void performVoice() {
        voiceBehavior.makeVoice();
    }

    public void setMoveBehavior(final MoveBehavior mb) {
        moveBehavior = mb;
    }

    public void setVoiceBehavior(final VoiceBehavior vb) {
        voiceBehavior = vb;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Pet pet = (Pet) o;
        return this.weight == pet.weight && Objects.equals(this.moveBehavior, pet.moveBehavior) && Objects.equals(this.voiceBehavior, pet.voiceBehavior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.weight, this.moveBehavior, this.voiceBehavior);
    }

    @Override
    public String toString() {
        return "Pet{" + "weight=" + weight + '}';
    }
}
