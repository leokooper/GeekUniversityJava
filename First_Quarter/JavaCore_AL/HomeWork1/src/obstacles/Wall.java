package obstacles;

import competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt (Competitor competitors) {competitors.jump(height);
    }

}
