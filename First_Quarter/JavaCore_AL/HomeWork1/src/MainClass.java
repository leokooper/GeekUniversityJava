import competitors.*;
import obstacles.*;

public class MainClass {
    public static void main(String[] args) {



        Course course1 = new Course(new Cross(500), new Wall(8), new Water(8));
        Team team1 = new Team("Команда 1", new Cat("Барсик"), new Dog("Шарик"), new Human("Боб"));

        course1.doIt(team1);
        team1.showResults();
        team1.showNames();

    }

}
