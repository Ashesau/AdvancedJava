package Polymorphism;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal rat = new Rat("крысячий писк","сыр",4,1);
        Animal cat = new Cat("Мяу","рыбка",4, 1);


        System.out.println("Крысятина издает " + rat.getVoice());
        System.out.println("Крыска любит есть " + rat.getEat());
        System.out.println("У крысы " + rat.getPaws() + " лапки и " + rat.getTails() + " хвостик\n");

        System.out.println("Кот настойчиво кричит " + cat.getVoice());
        System.out.println("Его любимая еда - " + cat.getEat());
        System.out.println("У кота " + cat.getPaws() + "лапки и " + cat.getTails() + " хвост\n");
    }
}