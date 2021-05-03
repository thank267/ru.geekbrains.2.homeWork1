package participants;

import actions.Actions;
import ammunitions.Track;
import ammunitions.Wall;

public class Human implements Actions{

    @Override
    public void run(Track track) {
        System.out.printf("Человек пробежал %s м\n", track.getTest());
    }

    @Override
    public void jump(Wall wall) {
        System.out.printf("Человек запрыгрул на %s м\n", wall.getTest());
    }


    
}
