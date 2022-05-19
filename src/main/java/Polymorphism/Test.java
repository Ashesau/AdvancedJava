package Polymorphism;

public class Test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal rat = new Rat("крысячий писк","сыр",4,1);
        Animal cat = new Cat("Мяу!","рыбка",4, 1);
        Animal spider = new Spider("молча глазеет","насекомые",8,0);
        Animal kitsune = new Kitsune("человеческим голосом","плоть и души людей",4,9);


        System.out.println("Крысятина издает " + rat.getVoice());
        System.out.println("Крыска любит есть " + rat.getEat());
        System.out.println("У крысы " + rat.getPaws() + " лапки и " + rat.getTails() + " хвостик\n");

        System.out.println("Кот настойчиво кричит " + cat.getVoice());
        System.out.println("Его любимая еда - " + cat.getEat());
        System.out.println("У кота " + cat.getPaws() + " лапки и " + cat.getTails() + " хвост\n");

        System.out.println("Павук сидит и " + spider.getVoice());
        System.out.println("Его обычный рацион -  " + spider.getEat());
        System.out.println("У павука имеется " + spider.getPaws() + " мерзких лап и " +
                spider.getTails() + " (нет) хвоста\n");

        System.out.println("Кицуне может говорить " + kitsune.getVoice());
        System.out.println("Этот демон предпочитает " + kitsune.getEat());
        System.out.println("У него " + kitsune.getPaws() + " лапы" + " и аж " + kitsune.getTails() + " хвостов\n");
    }
}