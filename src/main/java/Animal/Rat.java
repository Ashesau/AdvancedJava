package Animal;

public class Rat extends Animal {

    private String eat;

    public Rat (String name, String voice, int paws, int tails) {
        super(name, voice, paws, tails);
        this.eat = "яыр";
    }
    public Rat (String name, String voice, int paws, int tails, String eat) {
        super(name, voice, paws, tails);
        this.eat = eat;
    }
    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
}






//    @Override
//    public void eat() {
//        System.out.println("Крыса:\n" +
//        "• Яростно грызет семачки");
//    }
//    @Override
//    public void sleep() {
//        System.out.println("• Шпит");
//    }
//    public void ratSound() {
//        System.out.println("• * крысячий писк *");
//    }
//    public void ratName() {
//        System.out.println();
//    }

