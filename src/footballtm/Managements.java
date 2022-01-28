package footballtm;

public class Managements {
    private String coachName;
    private String aCoachName;


    public Managements(String coachName, String aCoachName){
        this.aCoachName = aCoachName;
        this.coachName = coachName;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getaCoachName() {
        return aCoachName;
    }
}
