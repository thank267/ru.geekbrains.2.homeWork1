package participants;

import actions.Actions;
import ammunitions.Track;
import ammunitions.Wall;

public class Bot implements Actions {

    @Override
    public void run(Track track) {
        System.out.printf("Робот пробежал %s м\n",track.getTest());
    }

    @Override
    public void jump(Wall wall) {
        System.out.printf("Робот запрыгрул на %s м\n", wall.getTest());
        
    }
    
}
