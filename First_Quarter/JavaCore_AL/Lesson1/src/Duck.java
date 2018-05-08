public class Duck extends Animal implements Swimmable, Flyable{

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
