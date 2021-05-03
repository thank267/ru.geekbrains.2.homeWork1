package participants;

import java.util.Arrays;
import java.util.List;

import ammunitions.Equipment;
import util.Message;

public class Team {

    private String name;

    private Participant[] participants = new Participant[4];

    

    /**
     * @param name
     * @param participants
     */
    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = participants;
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
     * @return the participants
     */
    public Participant[] getParticipants() {
        return participants;
    }

    /**
     * @param participants the participants to set
     */
    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

    public void getInfo() {
        System.out.println("=========================================");
        System.out.printf("Команда \"%s\" выступила со следующим результатом:\n", getName());
        System.out.printf("Прошли дистанцию:\n");
        Arrays.asList(getParticipants()).stream().filter(p -> !p.isFall()).forEach(p -> {
            Message.info(p);
        });
        System.out.printf("Не прошли дистанцию:\n");
        Arrays.asList(getParticipants()).stream().filter(p -> p.isFall()).forEach(p -> {
            Message.info(p);
        });

    }

    public void test(List<Equipment> equipments) {
        Arrays.asList(getParticipants()).forEach(p -> {
            equipments.forEach(equipment -> {
                p.test(equipment);
            });
        });

    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Team [name=" + name + ", participants=" + Arrays.toString(participants) + "]";
    }
    
    
    
}
