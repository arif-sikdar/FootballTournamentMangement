package footballtm;

public class Players {
    private String name;
    private int jerseyNumber;
    private String healthCondition;
    private  String playerPosition;

    public Players(String name, int jerseyNumber, String playerPosition, String healthCondition){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.playerPosition = playerPosition;
        this.healthCondition = healthCondition;

    }

    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }
}
