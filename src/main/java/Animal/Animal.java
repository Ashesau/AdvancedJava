package Animal;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Animal {

    private String name;
    private String voice;
    private int paws;
    private int tails;

    public Animal(String name, String voice, int paws, int tails){
        this.name = name;
        this.voice = voice;
        this.paws = paws;
        this.tails = tails;
    }

    public String getName() {
        return name;
    }
    public String getVoice() {
        return voice;
    }
    public int getPaws() {
        return paws;
    }
    public int getTails() {
        return tails;
    }
}





//    public void eat() {
//        System.out.println("Ем вкусняшки"); //даем какому-то животному метод
//    }
//    public void sleep() {
//        System.out.println("Zzz..\n"); //и этот метод
//    }

