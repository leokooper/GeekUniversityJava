package competitors;

public interface Competitor {
    void run(int disatance);
    void jump(int disatance);
    void swim(int disatance);
    boolean isOnDistance();
    void showResult();
    void showName();
}
