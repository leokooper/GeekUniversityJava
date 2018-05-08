package obstacles;

import competitors.*;

public class Course{

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    Obstacle[] obstacles;

    //Метод получает экземпляр класс Team, и с помощью метода returnCompetitors обращается к массиву Competitors класс Team
    public void doIt(Team team) {
        for (Competitor c: team.returnCompetitors()) {
            for (Obstacle o: obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }
    }
}
