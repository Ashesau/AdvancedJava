package Animal;

public class Cat extends Animal {   //Cat - дочерний класс родительского класса Animal

    private String color;
    private String eat;
    public Cat (String name, String voice, int paws, int tails) {
        super(name, voice, paws, tails);
        this.color = "Черный";
        this.eat = "Молоко";
    }
    public Cat (String name, String voice, int paws, int tails, String color, String eat) {
        super(name, voice, paws, tails);
        this.color = color;
        this.eat = eat;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
}
//    public void catSound() {
//        System.out.println("• * требовательный мяу *");
//    }
//    public void catName() {
//        System.out.println();
//    }

//    public void eat() {
//        System.out.println("Кот:\n" +
//        "• Я предпочитаю то, что упало на пол, а не королевские креветки");
//    }
//    @Override
//    public void sleep() {
//        System.out.println("• Здоровый 15-часовой сон");
//    }