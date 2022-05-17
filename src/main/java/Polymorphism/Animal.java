package Polymorphism;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Animal {

    private String voice;
    private String eat;
    private int paws;
    private int tails;

    public Animal(String voice, String eat, int paws, int tails) {
        this.voice = voice;
        this.eat = eat;
        this.paws = paws;
        this.tails = tails;
    }

    public String getVoice() {
        return voice;
    }
    public String getEat() {
        return eat;
    }
    public int getPaws() {
        return paws;
    }
    public int getTails() {
        return tails;
    }
}

