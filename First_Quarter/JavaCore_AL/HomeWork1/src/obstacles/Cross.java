package obstacles;
import competitors.Competitor;

public class Cross extends Obstacle {

    private int disatance;

    public Cross(int disatance) {
        this.disatance = disatance;
    }

    public void doIt (Competitor competitors) {
        competitors.run(disatance);
    }
}
