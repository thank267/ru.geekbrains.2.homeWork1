package actions;

import ammunitions.Track;
import ammunitions.Wall;

public interface Actions {

    public void run(Track track);

    public void jump(Wall wall);

}