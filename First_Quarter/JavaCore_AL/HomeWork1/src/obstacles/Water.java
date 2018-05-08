package obstacles;

import competitors.Competitor;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    public void doIt (Competitor competitors) {competitors.swim(distance);
    }

}
