package participants;

import actions.Actions;
import ammunitions.Track;
import ammunitions.Wall;

public class Cat implements Actions {

    @Override
    public void run(Track track) {
        System.out.printf("Кот пробежал %s м\n", track.getTest());
    }

    @Override
    public void jump(Wall wall) {
        System.out.printf("Кот запрыгрул на %s м\n", wall.getTest());
    }
    
}
