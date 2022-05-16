package Animal;

public class Parrot extends Animal {

    private String eat;
    private String color;

    public Parrot (String name, String voice, int paws, int tails) {
        super(name, voice, paws, tails);
        this.eat = "Черемша";
        this.color = "Радужный";
    }
    public Parrot (String name, String voice, int paws, int tails, String eat, String color) {
        super(name, voice, paws, tails);
        this.eat = eat;
        this.color = color;
    }
    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}








//    @Override
//    public void eat() {
//        System.out.println("Папуг:\n" +
//        "• Переел черемши");
//    }
//    @Override
//    public void sleep() {
//        System.out.println("• Чуткий сон");
//    }
//    public void parrotSound() {
//        System.out.println("• * кви-кви *");
//    }
//    public void parrotName() {
//        System.out.println();
//    }
