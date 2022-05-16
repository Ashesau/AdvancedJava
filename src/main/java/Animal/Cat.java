package Animal;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Кот:\n" +
        "• Я предпочитаю то, что упало на пол, а не королевские креветки");
    }
    @Override
    public void sleep() {
        System.out.println("• Здоровый 15-часовой сон");
    }
    public void catSound() {
        System.out.println("• * требовательный мяу *");
    }
    public void catName() {
        System.out.println();
    }
}
