package Animal;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal rat = new Rat("Клюковка", "крысячий писк", 4, 1, "сыр");
        Animal cat = new Cat("Данька", "требовательный мяу", 4, 1, "черный", "молоко");
        Animal parrot = new Parrot("Петух", "кви-кви", 2, 1, "Черемша", "Радужный");

        System.out.println("Мою крысу зовут " + rat.getName());
        System.out.println("Иногда он издает недовольный " + rat.getVoice());
       

        System.out.println(cat.getName());
        System.out.println(cat.getTails());
    }
}





//        test(animal); //собственно полиморфизм
//        test(rat);
//            rat.ratSound();
//            rat.ratName();
//
//        test(cat);
//            cat.catSound();
//            cat.catName();
//
//        test(parrot);
//            parrot.parrotSound();
//            parrot.parrotName();
//    }
//    public static void test(Animal animal) {
//        animal.eat();
//        animal.sleep();
//    }