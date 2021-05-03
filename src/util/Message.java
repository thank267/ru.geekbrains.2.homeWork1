package util;

import ammunitions.Equipment;
import participants.Participant;
import participants.Team;

public class Message {

    public static void notJump(Object test, Participant p, Equipment equipment) {
        System.out.printf("Участник %s %s. Не смог запрыгнуть на %s и выбывает из соревнований\n",
                test.getClass().getSimpleName(), p.getName(), equipment.getTest());
    }

    public static void notRun(Object test, Participant p, Equipment equipment) {
        System.out.printf("Участник %s %s. Не смог пробежать %s и выбывает из соревнований\n",
                test.getClass().getSimpleName(), p.getName(), equipment.getTest());
    }

    public static void info(Participant p) {
        System.out.printf("Участник %s %s.\n", p.getPart().getClass().getSimpleName(), p.getName());
    }
    
    public static void testTeam(Team t) {
        System.out.printf("Команда \"%s\" пройдите тестирование.\n", t.getName());
    }
    
}
