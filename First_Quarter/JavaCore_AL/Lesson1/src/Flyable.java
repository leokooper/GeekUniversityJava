public interface Flyable {

    public static final int field = 10;

    void fly();

    default void defaultFly() {
        System.out.println("Default fly!");
    }
}
