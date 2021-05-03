import java.util.ArrayList;
import java.util.List;

import ammunitions.Cource;
import ammunitions.Equipment;
import ammunitions.Track;
import ammunitions.Wall;
import participants.Bot;
import participants.Cat;
import participants.Human;
import participants.Participant;
import participants.Team;

public class App {

    public static void main(String[] args) throws Exception {
        
        List<Equipment> actions = new ArrayList<>();
        actions.add(new Track(10));
        actions.add(new Wall(1));
        actions.add(new Track(15));
        actions.add(new Wall(2));

        Cource cource = new Cource(actions);

        Participant[] participant1 = {
            new Participant(300, 3, new Bot(), "C-3PO"),
            new Participant(10, 5, new Cat(), "Барсик"),
            new Participant(200, 2, new Human(), "Роберт"),
            new Participant(250, 1, new Human(), "Боб")
        };

        Team team1 = new Team("Команда мечты 1", participant1);

        Participant[] participant2 = {
            new Participant(15, 4, new Cat(), "Амели"),
            new Participant(10, 5, new Cat(), "Пушок"),
            new Participant(200, 2, new Bot(), "Бишоп"),
            new Participant(250, 1, new Human(), "Артур")
        };

        Team team2 = new Team("Команда мечты 2", participant2);
        
        System.out.println(team1);
        System.out.println(team2);

        cource.test(team1);
        cource.test(team2);
          
        team1.getInfo();
        team2.getInfo();

    }
}
