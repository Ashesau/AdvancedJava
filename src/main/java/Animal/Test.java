package Animal;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Rat rat = new Rat();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        test(animal); //собственно полиморфизм

        test(rat);
            rat.ratSound();
            rat.ratName();

        test(cat);
            cat.catSound();
            cat.catName();

        test(parrot);
            parrot.parrotSound();
            parrot.parrotName();
    }

    public static void test(Animal animal) {
        animal.eat();
        animal.sleep();
    }
}
