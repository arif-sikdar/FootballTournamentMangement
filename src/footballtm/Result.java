package footballtm;

public class Result {
    private String winOrLost;
    private String opponent;
    private String score;

    public Result(String winOrLost, String opponent, String score){
        this.opponent = opponent;
        this.score = score;
        this.winOrLost = winOrLost;
    }

    public void displayResult(){
        System.out.println(winOrLost+ " Against " +opponent+ " And Score was: "+score);

    }
}
