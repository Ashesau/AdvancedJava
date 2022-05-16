package Animal;

public class Rat extends Animal { //Rat - дочерний класс родительского класса Animal


    @Override
    public void eat() {
        System.out.println("Крыса:\n" +
        "• Яростно грызет семачки");
    }
    @Override
    public void sleep() {
        System.out.println("• Шпит");
    }
    public void ratSound() {
        System.out.println("• * крысячий писк *");
    }
    public void ratName() {
        System.out.println();
    }
}
