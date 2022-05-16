package Animal;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Animal {


    private String name;
    private String sound;
    private int paws;
    private int tails;

    public Animal(String name, int paws, int tails){
        this.name = name;
        this.sound = sound;
        this.paws = paws;
        this.tails = tails;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getPaws() {
        return paws;
    }

    public int getTails() {
        return tails;
    }

    public void eat() {
        System.out.println("Ем вкусняшки"); //даем какому-то животному метод
    }
    public void sleep() {
        System.out.println("Zzz..\n"); //и этот метод
    }
}
