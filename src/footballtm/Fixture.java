package footballtm;

public class Fixture {

        private String opponent;
        private String date;
        private String time;
        private String venue;

        public Fixture(String opponent, String date, String time, String venue){
            this.date = date;
            this.time = time;
            this.opponent = opponent;
            this.venue = venue;
        }

        public void displayFixture(){
            System.out.println("VS "+opponent+ "   Date: "+date+ "   Time: "+time+ "   Venue: "+venue);
    }

}
