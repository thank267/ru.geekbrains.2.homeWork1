package participants;

import ammunitions.Equipment;
import ammunitions.Track;
import ammunitions.Wall;
import util.Message;

public class Participant {

    private int limitRun;

    private int limitJump;

    private Object part;

    private String name;

    private boolean fall; 

    

    /**
     * @return the fall
     */
    public boolean isFall() {
        return fall;
    }

    /**
     * @param fall the fall to set
     */
    public void setFall(boolean fall) {
        this.fall = fall;
    }

    /**
     * @param limitRun
     * @param limitJump
     * @param part
     * @param name
     */
    public Participant(int limitRun, int limitJump, Object part, String name) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.part = part;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the limitRun
     */
    public int getLimitRun() {
        return limitRun;
    }

    /**
     * @param limitRun the limitRun to set
     */
    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    /**
     * @return the limitJump
     */
    public int getLimitJump() {
        return limitJump;
    }

    /**
     * @param limitJump the limitJump to set
     */
    public void setLimitJump(int limitJump) {
        this.limitJump = limitJump;
    }

    /**
     * @return the part
     */
    public Object getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(Object part) {
        this.part = part;
    }

    public void test(Equipment equipment) {

        Object p = getPart();


        // проверяем может ли участник участвоватьв в соревновании
        if (!isFall()) {


            if (p instanceof Bot) {
                Bot b = (Bot) p;
                if (equipment instanceof Track) {

                    // проверяем может ли робот пройти тест на бегововой дорожке
                    if (getLimitRun() < equipment.getTest()) {
                        setFall(true);
                        Message.notRun(getPart(), this, equipment);
                    } else {
                        b.run((Track) equipment);
                    }

                } else if (equipment instanceof Wall) {

                    // проверяем может ли робот пройти тест на стене
                    if (getLimitJump() < equipment.getTest()) {
                        setFall(true);
                        Message.notJump(getPart(), this, equipment);
                    } else {
                        b.jump((Wall) equipment);
                    }
                } else
                    throw new ClassCastException();
            } else if (p instanceof Cat) {
                Cat c = (Cat) p;
                if (equipment instanceof Track) {

                    // проверяем может ли кот пройти тест на бегововой дорожке
                    if (getLimitRun() < equipment.getTest()) {
                        setFall(true);
                        Message.notRun(getPart(), this, equipment);
                    } else {
                        c.run((Track) equipment);
                    }

                } else if (equipment instanceof Wall) {

                    // проверяем может ли кот пройти тест на стене
                    if (getLimitJump() < equipment.getTest()) {
                        setFall(true);
                        Message.notJump(getPart(), this, equipment);
                    } else {
                        c.jump((Wall) equipment);
                    }
                } else
                    throw new ClassCastException();
            } else if (p instanceof Human) {
                Human h = (Human) p;
                if (equipment instanceof Track) {

                    // проверяем может ли человек пройти тест на бегововой дорожке
                    if (getLimitRun() < equipment.getTest()) {
                        setFall(true);
                        Message.notRun(getPart(), this, equipment);
                    } else {
                        h.run((Track) equipment);
                    }

                } else if (equipment instanceof Wall) {

                    // проверяем может ли человек пройти тест на стене
                    if (getLimitJump() < equipment.getTest()) {
                        setFall(true);
                        Message.notJump(getPart(), this, equipment);
                    } else {
                        h.jump((Wall) equipment);
                    }
                } else
                    throw new ClassCastException();
            } else {
                throw new ClassCastException();
            }

            

        } else {

            System.out.printf("Участник %s %s выбыл из соревнований\n", p.getClass().getSimpleName(), getName());

        }

       


    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Participant [fall=" + fall + ", limitJump=" + limitJump + ", limitRun=" + limitRun + ", name=" + name
                + ", part=" + part + "]";
    }

    
    
}
