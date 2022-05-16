package Animal;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal("Den", 4,1);
        Animal rat = new Rat();
        Animal cat = new Cat();
        Animal parrot = new Parrot();

        System.out.println(rat.getName());
        System.out.println(rat.getTails());

        System.out.println(cat.getName());
        System.out.println(cat.getTails());
        test(animal); //собственно полиморфизм

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
    public static void test(Animal animal) {
        animal.eat();
        animal.sleep();
    }
}
