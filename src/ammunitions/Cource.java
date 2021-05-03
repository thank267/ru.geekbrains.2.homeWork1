package ammunitions;

import java.util.List;

import participants.Team;
import util.Message;

public class Cource {

    private List<Equipment> equipments;

    /**
     * @return the equipments
     */
    public List<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * @param equipments the equipments to set
     */
    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    /**
     * @param equipments
     */
    public Cource(List<Equipment> equipments) {
        this.equipments = equipments;
    }
    
    public void test(Team team) {
        System.out.println("----------------------------------");
        Message.testTeam(team);
        team.test(getEquipments());

    }

    

}


