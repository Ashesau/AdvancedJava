package Animal;

public class Parrot extends Animal {

    @Override
    public void eat() {
        System.out.println("Папуг:\n" +
        "• Переел черемши");
    }
    @Override
    public void sleep() {
        System.out.println("• Чуткий сон");
    }
    public void parrotSound() {
        System.out.println("• * кви-кви *");
    }
    public void parrotName() {
        System.out.println();
    }
}
