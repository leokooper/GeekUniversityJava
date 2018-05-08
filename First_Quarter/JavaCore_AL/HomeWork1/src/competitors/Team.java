package competitors;

public class Team {

    //массив переменной длины, должен стоять в конце
    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    String teamName;
    Competitor[] competitors;

    //Костылик ;) Метод необходим, для обращения к массиву Competitors[] класса Team в классе Obstacle
    public Competitor[] returnCompetitors()
    {
        return competitors;
    }

    //Метод показывае прошел ли участник дистанцию
    public void showResults() {
        for (Competitor c: competitors) {
            c.showResult();
        }
    }
        //Метод вывода информаци о команде
        public void showNames() {
            System.out.println("Вывод информации о команде" + " " + teamName);
            for (Competitor c: competitors) {
                c.showName();
            }
        }
}
