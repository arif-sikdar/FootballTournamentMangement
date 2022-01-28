package footballtm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       /*Real Madrid Informations
       * Players
       * Management
       * Result
       * Fixture
       * */

        Managements realMadridManagements = new Managements("Carlo Ancelotti", "Davide Ancelotti");
        List<Managements> rmMList = new ArrayList<>();
        rmMList.add(realMadridManagements);

       Players rmP1 = new Players("Thibaut Courtois", 1, "Goal Keeper", "Fit");
       Players rmP2 = new Players("Eder Militao", 3, "Center Back", "Fit");
       Players rmP3 = new Players("Nacho Fernandez", 6, "Center Back", "Fit");
       Players rmP4 = new Players("Jesus Vallejo", 5, "Center Back", "Injured");
       Players rmP5 = new Players("Ferland Mendy", 23, "Left Back", "Fit");
       Players rmP6 = new Players("Marcelo", 12, "Left Back", "Fit");
       Players rmP7 = new Players("Daniel Carvajal", 2, "Right Back", "Fit");
       Players rmP8 = new Players("Lucas Vazquez", 17, "Right Back", "Fit");
       Players rmP9 = new Players("Casemiro", 14, "Defensive Midfield", "Fit");
       Players rmP10 = new Players("Toni Kroos", 8, "Central Midfield", "Fit");
       Players rmP11 = new Players("Luka Modric", 10, "Central Midfield", "Fit");
       Players rmP12 = new Players("Isco", 22, "Attacking Midfield", "Fit");
       Players rmP13 = new Players("Vinicius Junior", 20, "Left Winger", "Fit");
       Players rmP14 = new Players("Eden Hazard", 7, "Left Winger", "Fit");
       Players rmP15 = new Players("Marco Asensio", 11, "Right Winger", "Injured");
       Players rmP16 = new Players("Rodrygo", 21, "Right Winger", "Fit");
       Players rmP17 = new Players("Gareth Bale", 18, "Right Winger", "Fit");
       Players rmP18 = new Players("Karim Benzema", 9, "Centre Forward", "Injured");
       Players rmP19 = new Players("Luka Jovic", 16, "Centre Forward", "Fit");
       Players rmP20 = new Players("Mariano Diaz", 24, "Centre Forward", "Injured");
       List<Players> rmPList = new ArrayList<>();
       rmPList.add(rmP1);
       rmPList.add(rmP2);
       rmPList.add(rmP3);
       rmPList.add(rmP4);
       rmPList.add(rmP5);
       rmPList.add(rmP6);
       rmPList.add(rmP7);
       rmPList.add(rmP8);
       rmPList.add(rmP9);
       rmPList.add(rmP10);
       rmPList.add(rmP11);
       rmPList.add(rmP12);
       rmPList.add(rmP13);
       rmPList.add(rmP14);
       rmPList.add(rmP15);
       rmPList.add(rmP16);
       rmPList.add(rmP17);
       rmPList.add(rmP18);
       rmPList.add(rmP19);
       rmPList.add(rmP20);

       Team realMadrid = new Team(rmPList, rmMList);

       Result rmResult1 = new Result("Win", "Elche", "2-1");
       Result rmResult2 = new Result("Win", "Athletic Club", "2-0");

       Fixture rmFixture1 = new Fixture("Athletic Club", "Feb 4", "2.30 AM BDT", "San Mames Stadium");
       Fixture rmFixture2 = new Fixture("Granada", "Feb 7", "2.00 AM BDT", "Santiago Bernabeu Stadium");

       /*PSG Informations
        * Players
        * Management
        * Result
        * Fixture
        * */

       Managements psgManagements = new Managements("Mauricio Pochettino", "Jusus Perez");
       List<Managements> psgMList = new ArrayList<>();
       psgMList.add(psgManagements);

       Players psgP1 = new Players("Gianluigi Donnarumma", 50, "Goal Keeper", "Fit");
       Players psgP2 = new Players("Marquinhos", 5, "Center Back", "Fit");
       Players psgP3 = new Players("Presnel Kimpembe", 3, "Center Back", "Fit");
       Players psgP4 = new Players("Sergio Ramos", 4, "Center Back", "Fit");
       Players psgP5 = new Players("Nuno Mendes", 25, "Left Back", "Fit");
       Players psgP6 = new Players("Abdou Diallo", 22, "Left Back", "Injured");
       Players psgP7 = new Players("Achraf Hakimi", 2, "Right Back", "Fit");
       Players psgP8 = new Players("Colin Dagba", 17, "Right Back", "Fit");
       Players psgP9 = new Players("Leandro Paredes", 14, "Defensive Midfield", "Fit");
       Players psgP10 = new Players("Marco Verratti", 8, "Central Midfield", "Fit");
       Players psgP11 = new Players("Ander Herrera", 10, "Central Midfield", "Fit");
       Players psgP12 = new Players("Xavi Simons", 22, "Attacking Midfield", "Fit");
       Players psgP13 = new Players("Neymer Junior", 10, "Left Winger", "Injured");
       Players psgP14 = new Players("Julian Draxler", 23, "Left Winger", "Fit");
       Players psgP15 = new Players("Lionel Messi", 30, "Right Winger", "Fit");
       Players psgP16 = new Players("Angel Di Maria", 11, "Right Winger", "Fit");
       Players psgP17 = new Players("Kylian Mbappe", 7, "Centre Forward", "Fit");
       Players psgP18 = new Players("Mauro Icardi", 9, "Centre Forward", "Fit");

       List<Players> psgPList = new ArrayList<>();
       psgPList.add(psgP1);
       psgPList.add(psgP2);
       psgPList.add(psgP3);
       psgPList.add(psgP4);
       psgPList.add(psgP5);
       psgPList.add(psgP6);
       psgPList.add(psgP7);
       psgPList.add(psgP8);
       psgPList.add(psgP9);
       psgPList.add(psgP10);
       psgPList.add(psgP11);
       psgPList.add(psgP12);
       psgPList.add(psgP13);
       psgPList.add(psgP14);
       psgPList.add(psgP15);
       psgPList.add(psgP16);
       psgPList.add(psgP17);
       psgPList.add(psgP18);

       Team psg = new Team(psgPList, psgMList);

       Result psgResult1 = new Result("Win", "Reims", "4-0");
       Result psgResult2 = new Result("Win", "Brest", "2-0");

       Fixture psgFixture1 = new Fixture("Nice", "Feb 1", "2.15 AM BDT", "Parc des Princes");
       Fixture psgFixture2 = new Fixture("LOSC", "Feb 7", "1.45 AM BDT", "Stade Pierre-Mauroy");

       /*Barcelona Informations
        * Players
        * Management
        * Result
        * Fixture
        * */

       Managements barcelonaManagements = new Managements("Xavi", "Oscar Hernandez");
       List<Managements> barcelonaMList = new ArrayList<>();
       barcelonaMList.add(barcelonaManagements);

       Players barcelonaP1 = new Players("Marc-Andre ter Stegen", 1, "Goal Keeper", "Fit");
       Players barcelonaP2 = new Players("Ronald Araujo", 4, "Center Back", "Fit");
       Players barcelonaP3 = new Players("Eric Garcia", 24, "Center Back", "Injured");
       Players barcelonaP4 = new Players("Clement Lenglet", 15, "Center Back", "Fit");
       Players barcelonaP5 = new Players("Jordi Alba", 18, "Left Back", "Fit");
       Players barcelonaP6 = new Players("Sergino Dest", 2, "Left Back", "Fit");
       Players barcelonaP7 = new Players("Alex Balde", 31, "Left Back", "Fit");
       Players barcelonaP8 = new Players("Dani Alves", 8, "Right Back", "Fit");
       Players barcelonaP9 = new Players("Sergio Busquets", 5, "Defensive Midfield", "Fit");
       Players barcelonaP10 = new Players("Pedri", 16, "Central Midfield", "Fit");
       Players barcelonaP11 = new Players("Frenkie De Jong", 21, "Central Midfield", "Fit");
       Players barcelonaP12 = new Players("Sergio Roberto", 20, "Central Midfield", "Injured");
       Players barcelonaP13 = new Players("Ansu Fati", 10, "Left Winger", "Injured");
       Players barcelonaP14 = new Players("Ez Abde", 33, "Left Winger", "Fit");
       Players barcelonaP15 = new Players("Ferran Torres", 19, "Right Winger", "Fit");
       Players barcelonaP16 = new Players("Ousmane Dembele", 7, "Right Winger", "Fit");
       Players barcelonaP17 = new Players("Memphis Depay", 9, "Centre Forward", "Injured");
       Players barcelonaP18 = new Players("Luuk de Jong", 17, "Centre Forward", "Fit");

       List<Players> barcelonaPList = new ArrayList<>();
       barcelonaPList.add(barcelonaP1);
       barcelonaPList.add(barcelonaP2);
       barcelonaPList.add(barcelonaP3);
       barcelonaPList.add(barcelonaP4);
       barcelonaPList.add(barcelonaP5);
       barcelonaPList.add(barcelonaP6);
       barcelonaPList.add(barcelonaP7);
       barcelonaPList.add(barcelonaP8);
       barcelonaPList.add(barcelonaP9);
       barcelonaPList.add(barcelonaP10);
       barcelonaPList.add(barcelonaP11);
       barcelonaPList.add(barcelonaP12);
       barcelonaPList.add(barcelonaP13);
       barcelonaPList.add(barcelonaP14);
       barcelonaPList.add(barcelonaP15);
       barcelonaPList.add(barcelonaP16);
       barcelonaPList.add(barcelonaP17);
       barcelonaPList.add(barcelonaP18);

       Team barcelona = new Team(barcelonaPList, barcelonaMList);

       Result barcelonaResult1 = new Result("Win", "Alaves", "1-0");
       Result barcelonaResult2 = new Result("Lost", "Athletic Club", "2-3");

       Fixture barcelonaFixture1 = new Fixture("Atletico Madrid", "Feb 6", "9.15 PM BDT", "Camp Nou");
       Fixture barcelonaFixture2 = new Fixture("Espanyol", "Feb 14", "2.00 AM BDT", "Cornellà-El Prat");

       /*Manchester United Informations
        * Players
        * Management
        * Result
        * Fixture
        * */

       Managements muManagements = new Managements("Ralf Rangnick", "Mike Phelan");
       List<Managements> muMList = new ArrayList<>();
       muMList.add(muManagements);

       Players muP1 = new Players("David de Gea", 1, "Goal Keeper", "Fit");
       Players muP2 = new Players("Harry Maguire", 5, "Center Back", "Fit");
       Players muP3 = new Players("Eric Baily", 3, "Center Back", "Fit");
       Players muP4 = new Players("Phil Jones", 4, "Center Back", "Fit");
       Players muP5 = new Players("Luke Shaw", 23, "Left Back", "Injured");
       Players muP6 = new Players("Alex Telles", 27, "Left Back", "Fit");
       Players muP7 = new Players("Alex Balde", 31, "Left Back", "Fit");
       Players muP8 = new Players("Diogo Dalot", 20, "Right Back", "Fit");
       Players muP9 = new Players("Scott McTominay", 39, "Defensive Midfield", "Fit");
       Players muP10 = new Players("Paul Pogba", 6, "Central Midfield", "Injured");
       Players muP11 = new Players("Donny van de Beek", 34, "Central Midfield", "Fit");
       Players muP12 = new Players("Fred", 17, "Central Midfield", "Fit");
       Players muP13 = new Players("Bruno Fernades", 18, "Attacking Midfield", "Fit");
       Players muP14 = new Players("Jesse Lingard", 14, "Attacking Midfield", "Fit");
       Players muP15 = new Players("Marcus Rash ford", 10, "Left Winger", "Fit");
       Players muP16 = new Players("Jadon Sancho", 25, "Left Winger", "Fit");
       Players muP17 = new Players("Mason Greenwood", 11, "Right Winger", "Fit");
       Players muP18 = new Players("Cristiano Ronaldo", 7, "Centre Forward", "Fit");
       Players muP19 = new Players("Edinson Cavani", 21, "Centre Forward", "Fit");

       List<Players> muPList = new ArrayList<>();
       muPList.add(muP1);
       muPList.add(muP2);
       muPList.add(muP3);
       muPList.add(muP4);
       muPList.add(muP5);
       muPList.add(muP6);
       muPList.add(muP7);
       muPList.add(muP8);
       muPList.add(muP9);
       muPList.add(muP10);
       muPList.add(muP11);
       muPList.add(muP12);
       muPList.add(muP13);
       muPList.add(muP14);
       muPList.add(muP15);
       muPList.add(muP16);
       muPList.add(muP17);
       muPList.add(muP18);
       muPList.add(muP19);

       Team mu = new Team(muPList, muMList);

       Result muResult1 = new Result("Win", "West Ham", "1-0");
       Result muResult2 = new Result("Win", "Brentford", "3-1");

       Fixture muFixture1 = new Fixture("Middlesbrough", "Feb 5", "2.00 AM BDT", "Old Trafford");
       Fixture muFixture2 = new Fixture("Burnley", "Feb 9", "2.00 AM BDT", "Turf Moor");

       /*User Interface
       * Input and Output*/

       System.out.println("\nWe are Currently working with only 4 teams So you can find these teams Information Here!");
       System.out.println("\nWarning! You have to type the team name correctly\n" +
               "Team Names:\n" +
               "1) real madrid\n" +
               "2) psg\n" +
               "3) barcelona\n" +
               "4) manchester united\n");

       System.out.print("Enter a Team Name to See the Informations: ");
       String teamName = input.nextLine();

       if(teamName.equals("real madrid")){
          System.out.println("\nTeam Name: Real Madrid\n");

          System.out.println("Management: ");
          System.out.println("Coach: "+realMadridManagements.getCoachName()+"\n" +
                  "Assistant Coach: "+realMadridManagements.getaCoachName());

          System.out.println("\nPlayer List:");
          System.out.println("1) " +rmP1.getName()+ "   Jersey Number: " +rmP1.getJerseyNumber()+ "   Player Position: " +rmP1.getPlayerPosition()+ "   Player Health Condition: "+rmP1.getHealthCondition());
          System.out.println("2) " +rmP2.getName()+ "   Jersey Number: " +rmP2.getJerseyNumber()+ "   Player Position: " +rmP2.getPlayerPosition()+ "   Player Health Condition: "+rmP2.getHealthCondition());
          System.out.println("3) " +rmP3.getName()+ "   Jersey Number: " +rmP3.getJerseyNumber()+ "   Player Position: " +rmP3.getPlayerPosition()+ "   Player Health Condition: "+rmP3.getHealthCondition());
          System.out.println("4) " +rmP4.getName()+ "   Jersey Number: " +rmP4.getJerseyNumber()+ "   Player Position: " +rmP4.getPlayerPosition()+ "   Player Health Condition: "+rmP4.getHealthCondition());
          System.out.println("5) " +rmP5.getName()+ "   Jersey Number: " +rmP5.getJerseyNumber()+ "   Player Position: " +rmP5.getPlayerPosition()+ "   Player Health Condition: "+rmP5.getHealthCondition());
          System.out.println("6) " +rmP6.getName()+ "   Jersey Number: " +rmP6.getJerseyNumber()+ "   Player Position: " +rmP6.getPlayerPosition()+ "   Player Health Condition: "+rmP6.getHealthCondition());
          System.out.println("7) " +rmP7.getName()+ "   Jersey Number: " +rmP7.getJerseyNumber()+ "   Player Position: " +rmP7.getPlayerPosition()+ "   Player Health Condition: "+rmP7.getHealthCondition());
          System.out.println("8) " +rmP8.getName()+ "   Jersey Number: " +rmP8.getJerseyNumber()+ "   Player Position: " +rmP8.getPlayerPosition()+ "   Player Health Condition: "+rmP8.getHealthCondition());
          System.out.println("9) " +rmP9.getName()+ "   Jersey Number: " +rmP9.getJerseyNumber()+ "   Player Position: " +rmP9.getPlayerPosition()+ "   Player Health Condition: "+rmP9.getHealthCondition());
          System.out.println("10) " +rmP10.getName()+ "   Jersey Number: " +rmP10.getJerseyNumber()+ "   Player Position: " +rmP10.getPlayerPosition()+ "   Player Health Condition: "+rmP10.getHealthCondition());
          System.out.println("11) " +rmP11.getName()+ "   Jersey Number: " +rmP11.getJerseyNumber()+ "   Player Position: " +rmP11.getPlayerPosition()+ "   Player Health Condition: "+rmP11.getHealthCondition());
          System.out.println("12) " +rmP12.getName()+ "   Jersey Number: " +rmP12.getJerseyNumber()+ "   Player Position: " +rmP12.getPlayerPosition()+ "   Player Health Condition: "+rmP12.getHealthCondition());
          System.out.println("13) " +rmP13.getName()+ "   Jersey Number: " +rmP13.getJerseyNumber()+ "   Player Position: " +rmP13.getPlayerPosition()+ "   Player Health Condition: "+rmP13.getHealthCondition());
          System.out.println("14) " +rmP14.getName()+ "   Jersey Number: " +rmP14.getJerseyNumber()+ "   Player Position: " +rmP14.getPlayerPosition()+ "   Player Health Condition: "+rmP14.getHealthCondition());
          System.out.println("15) " +rmP15.getName()+ "   Jersey Number: " +rmP15.getJerseyNumber()+ "   Player Position: " +rmP15.getPlayerPosition()+ "   Player Health Condition: "+rmP15.getHealthCondition());
          System.out.println("16) " +rmP16.getName()+ "   Jersey Number: " +rmP16.getJerseyNumber()+ "   Player Position: " +rmP16.getPlayerPosition()+ "   Player Health Condition: "+rmP16.getHealthCondition());
          System.out.println("17) " +rmP17.getName()+ "   Jersey Number: " +rmP17.getJerseyNumber()+ "   Player Position: " +rmP17.getPlayerPosition()+ "   Player Health Condition: "+rmP17.getHealthCondition());
          System.out.println("18) " +rmP18.getName()+ "   Jersey Number: " +rmP18.getJerseyNumber()+ "   Player Position: " +rmP18.getPlayerPosition()+ "   Player Health Condition: "+rmP18.getHealthCondition());
          System.out.println("19) " +rmP19.getName()+ "   Jersey Number: " +rmP19.getJerseyNumber()+ "   Player Position: " +rmP19.getPlayerPosition()+ "   Player Health Condition: "+rmP19.getHealthCondition());
          System.out.println("20) " +rmP20.getName()+ "   Jersey Number: " +rmP20.getJerseyNumber()+ "   Player Position: " +rmP20.getPlayerPosition()+ "   Player Health Condition: "+rmP20.getHealthCondition());

          System.out.println("\nResult of Last 2 Matches: ");
          rmResult1.displayResult();
          rmResult2.displayResult();

          System.out.println("\nFixture of Upcoming 2 Matches: ");
          rmFixture1.displayFixture();
          rmFixture2.displayFixture();
       }

       else if(teamName.equals("psg")) {
          System.out.println("\nTeam Name: PSG\n");

          System.out.println("Management: ");
          System.out.println("Coach: " + psgManagements.getCoachName() + "\n" +
                  "Assistant Coach: " + psgManagements.getaCoachName());

          System.out.println("\nPlayer List:");
          System.out.println("1) " + psgP1.getName() + "   Jersey Number: " + psgP1.getJerseyNumber() + "   Player Position: " + psgP1.getPlayerPosition() + "   Player Health Condition: " + psgP1.getHealthCondition());
          System.out.println("2) " + psgP2.getName() + "   Jersey Number: " + psgP2.getJerseyNumber() + "   Player Position: " + psgP2.getPlayerPosition() + "   Player Health Condition: " + psgP2.getHealthCondition());
          System.out.println("3) " + psgP3.getName() + "   Jersey Number: " + psgP3.getJerseyNumber() + "   Player Position: " + psgP3.getPlayerPosition() + "   Player Health Condition: " + psgP3.getHealthCondition());
          System.out.println("4) " + psgP4.getName() + "   Jersey Number: " + psgP4.getJerseyNumber() + "   Player Position: " + psgP4.getPlayerPosition() + "   Player Health Condition: " + psgP4.getHealthCondition());
          System.out.println("5) " + psgP5.getName() + "   Jersey Number: " + psgP5.getJerseyNumber() + "   Player Position: " + psgP5.getPlayerPosition() + "   Player Health Condition: " + psgP5.getHealthCondition());
          System.out.println("6) " + psgP6.getName() + "   Jersey Number: " + psgP6.getJerseyNumber() + "   Player Position: " + psgP6.getPlayerPosition() + "   Player Health Condition: " + psgP6.getHealthCondition());
          System.out.println("7) " + psgP7.getName() + "   Jersey Number: " + psgP7.getJerseyNumber() + "   Player Position: " + psgP7.getPlayerPosition() + "   Player Health Condition: " + psgP7.getHealthCondition());
          System.out.println("8) " + psgP8.getName() + "   Jersey Number: " + psgP8.getJerseyNumber() + "   Player Position: " + psgP8.getPlayerPosition() + "   Player Health Condition: " + psgP8.getHealthCondition());
          System.out.println("9) " + psgP9.getName() + "   Jersey Number: " + psgP9.getJerseyNumber() + "   Player Position: " + psgP9.getPlayerPosition() + "   Player Health Condition: " + psgP9.getHealthCondition());
          System.out.println("10) " + psgP10.getName() + "   Jersey Number: " + psgP10.getJerseyNumber() + "   Player Position: " + psgP10.getPlayerPosition() + "   Player Health Condition: " + psgP10.getHealthCondition());
          System.out.println("11) " + psgP11.getName() + "   Jersey Number: " + psgP11.getJerseyNumber() + "   Player Position: " + psgP11.getPlayerPosition() + "   Player Health Condition: " + psgP11.getHealthCondition());
          System.out.println("12) " + psgP12.getName() + "   Jersey Number: " + psgP12.getJerseyNumber() + "   Player Position: " + psgP12.getPlayerPosition() + "   Player Health Condition: " + psgP12.getHealthCondition());
          System.out.println("13) " + psgP13.getName() + "   Jersey Number: " + psgP13.getJerseyNumber() + "   Player Position: " + psgP13.getPlayerPosition() + "   Player Health Condition: " + psgP13.getHealthCondition());
          System.out.println("14) " + psgP14.getName() + "   Jersey Number: " + psgP14.getJerseyNumber() + "   Player Position: " + psgP14.getPlayerPosition() + "   Player Health Condition: " + psgP14.getHealthCondition());
          System.out.println("15) " + psgP15.getName() + "   Jersey Number: " + psgP15.getJerseyNumber() + "   Player Position: " + psgP15.getPlayerPosition() + "   Player Health Condition: " + psgP15.getHealthCondition());
          System.out.println("16) " + psgP16.getName() + "   Jersey Number: " + psgP16.getJerseyNumber() + "   Player Position: " + psgP16.getPlayerPosition() + "   Player Health Condition: " + psgP16.getHealthCondition());
          System.out.println("17) " + psgP17.getName() + "   Jersey Number: " + psgP17.getJerseyNumber() + "   Player Position: " + psgP17.getPlayerPosition() + "   Player Health Condition: " + psgP17.getHealthCondition());
          System.out.println("18) " + psgP18.getName() + "   Jersey Number: " + psgP18.getJerseyNumber() + "   Player Position: " + psgP18.getPlayerPosition() + "   Player Health Condition: " + psgP18.getHealthCondition());

          System.out.println("\nResult of Last 2 Matches: ");
          psgResult1.displayResult();
          psgResult2.displayResult();

          System.out.println("\nFixture of Upcoming 2 Matches: ");
          psgFixture1.displayFixture();
          psgFixture2.displayFixture();
       }

       else if(teamName.equals("barcelona")) {
          System.out.println("\nTeam Name: Barcelona\n");

          System.out.println("Management: ");
          System.out.println("Coach: " + barcelonaManagements.getCoachName() + "\n" +
                  "Assistant Coach: " + barcelonaManagements.getaCoachName());

          System.out.println("\nPlayer List:");
          System.out.println("1) " + barcelonaP1.getName() + "   Jersey Number: " + barcelonaP1.getJerseyNumber() + "   Player Position: " + barcelonaP1.getPlayerPosition() + "   Player Health Condition: " + barcelonaP1.getHealthCondition());
          System.out.println("2) " + barcelonaP2.getName() + "   Jersey Number: " + barcelonaP2.getJerseyNumber() + "   Player Position: " + barcelonaP2.getPlayerPosition() + "   Player Health Condition: " + barcelonaP2.getHealthCondition());
          System.out.println("3) " + barcelonaP3.getName() + "   Jersey Number: " + barcelonaP3.getJerseyNumber() + "   Player Position: " + barcelonaP3.getPlayerPosition() + "   Player Health Condition: " + barcelonaP3.getHealthCondition());
          System.out.println("4) " + barcelonaP4.getName() + "   Jersey Number: " + barcelonaP4.getJerseyNumber() + "   Player Position: " + barcelonaP4.getPlayerPosition() + "   Player Health Condition: " + barcelonaP4.getHealthCondition());
          System.out.println("5) " + barcelonaP5.getName() + "   Jersey Number: " + barcelonaP5.getJerseyNumber() + "   Player Position: " + barcelonaP5.getPlayerPosition() + "   Player Health Condition: " + barcelonaP5.getHealthCondition());
          System.out.println("6) " + barcelonaP6.getName() + "   Jersey Number: " + barcelonaP6.getJerseyNumber() + "   Player Position: " + barcelonaP6.getPlayerPosition() + "   Player Health Condition: " + barcelonaP6.getHealthCondition());
          System.out.println("7) " + barcelonaP7.getName() + "   Jersey Number: " + barcelonaP7.getJerseyNumber() + "   Player Position: " + barcelonaP7.getPlayerPosition() + "   Player Health Condition: " + barcelonaP7.getHealthCondition());
          System.out.println("8) " + barcelonaP8.getName() + "   Jersey Number: " + barcelonaP8.getJerseyNumber() + "   Player Position: " + barcelonaP8.getPlayerPosition() + "   Player Health Condition: " + barcelonaP8.getHealthCondition());
          System.out.println("9) " + barcelonaP9.getName() + "   Jersey Number: " + barcelonaP9.getJerseyNumber() + "   Player Position: " + barcelonaP9.getPlayerPosition() + "   Player Health Condition: " + barcelonaP9.getHealthCondition());
          System.out.println("10) " + barcelonaP10.getName() + "   Jersey Number: " + barcelonaP10.getJerseyNumber() + "   Player Position: " + barcelonaP10.getPlayerPosition() + "   Player Health Condition: " + barcelonaP10.getHealthCondition());
          System.out.println("11) " + barcelonaP11.getName() + "   Jersey Number: " + barcelonaP11.getJerseyNumber() + "   Player Position: " + barcelonaP11.getPlayerPosition() + "   Player Health Condition: " + barcelonaP11.getHealthCondition());
          System.out.println("12) " + barcelonaP12.getName() + "   Jersey Number: " + barcelonaP12.getJerseyNumber() + "   Player Position: " + barcelonaP12.getPlayerPosition() + "   Player Health Condition: " + barcelonaP12.getHealthCondition());
          System.out.println("13) " + barcelonaP13.getName() + "   Jersey Number: " + barcelonaP13.getJerseyNumber() + "   Player Position: " + barcelonaP13.getPlayerPosition() + "   Player Health Condition: " + barcelonaP13.getHealthCondition());
          System.out.println("14) " + barcelonaP14.getName() + "   Jersey Number: " + barcelonaP14.getJerseyNumber() + "   Player Position: " + barcelonaP14.getPlayerPosition() + "   Player Health Condition: " + barcelonaP14.getHealthCondition());
          System.out.println("15) " + barcelonaP15.getName() + "   Jersey Number: " + barcelonaP15.getJerseyNumber() + "   Player Position: " + barcelonaP15.getPlayerPosition() + "   Player Health Condition: " + barcelonaP15.getHealthCondition());
          System.out.println("16) " + barcelonaP16.getName() + "   Jersey Number: " + barcelonaP16.getJerseyNumber() + "   Player Position: " + barcelonaP16.getPlayerPosition() + "   Player Health Condition: " + barcelonaP16.getHealthCondition());
          System.out.println("17) " + barcelonaP17.getName() + "   Jersey Number: " + barcelonaP17.getJerseyNumber() + "   Player Position: " + barcelonaP17.getPlayerPosition() + "   Player Health Condition: " + barcelonaP17.getHealthCondition());
          System.out.println("18) " + barcelonaP18.getName() + "   Jersey Number: " + barcelonaP18.getJerseyNumber() + "   Player Position: " + barcelonaP18.getPlayerPosition() + "   Player Health Condition: " + barcelonaP18.getHealthCondition());

          System.out.println("\nResult of Last 2 Matches: ");
          barcelonaResult1.displayResult();
          barcelonaResult2.displayResult();

          System.out.println("\nFixture of Upcoming 2 Matches: ");
          barcelonaFixture1.displayFixture();
          barcelonaFixture2.displayFixture();
       }

       else if(teamName.equals("manchester united")) {
          System.out.println("\nTeam Name: Manchester United\n");

          System.out.println("Management: ");
          System.out.println("Coach: " + muManagements.getCoachName() + "\n" +
                  "Assistant Coach: " + muManagements.getaCoachName());

          System.out.println("\nPlayer List:");
          System.out.println("1) " + muP1.getName() + "   Jersey Number: " + muP1.getJerseyNumber() + "   Player Position: " + muP1.getPlayerPosition() + "   Player Health Condition: " + muP1.getHealthCondition());
          System.out.println("2) " + muP2.getName() + "   Jersey Number: " + muP2.getJerseyNumber() + "   Player Position: " + muP2.getPlayerPosition() + "   Player Health Condition: " + muP2.getHealthCondition());
          System.out.println("3) " + muP3.getName() + "   Jersey Number: " + muP3.getJerseyNumber() + "   Player Position: " + muP3.getPlayerPosition() + "   Player Health Condition: " + muP3.getHealthCondition());
          System.out.println("4) " + muP4.getName() + "   Jersey Number: " + muP4.getJerseyNumber() + "   Player Position: " + muP4.getPlayerPosition() + "   Player Health Condition: " + muP4.getHealthCondition());
          System.out.println("5) " + muP5.getName() + "   Jersey Number: " + muP5.getJerseyNumber() + "   Player Position: " + muP5.getPlayerPosition() + "   Player Health Condition: " + muP5.getHealthCondition());
          System.out.println("6) " + muP6.getName() + "   Jersey Number: " + muP6.getJerseyNumber() + "   Player Position: " + muP6.getPlayerPosition() + "   Player Health Condition: " + muP6.getHealthCondition());
          System.out.println("7) " + muP7.getName() + "   Jersey Number: " + muP7.getJerseyNumber() + "   Player Position: " + muP7.getPlayerPosition() + "   Player Health Condition: " + muP7.getHealthCondition());
          System.out.println("8) " + muP8.getName() + "   Jersey Number: " + muP8.getJerseyNumber() + "   Player Position: " + muP8.getPlayerPosition() + "   Player Health Condition: " + muP8.getHealthCondition());
          System.out.println("9) " + muP9.getName() + "   Jersey Number: " + muP9.getJerseyNumber() + "   Player Position: " + muP9.getPlayerPosition() + "   Player Health Condition: " + muP9.getHealthCondition());
          System.out.println("10) " + muP10.getName() + "   Jersey Number: " + muP10.getJerseyNumber() + "   Player Position: " + muP10.getPlayerPosition() + "   Player Health Condition: " + muP10.getHealthCondition());
          System.out.println("11) " + muP11.getName() + "   Jersey Number: " + muP11.getJerseyNumber() + "   Player Position: " + muP11.getPlayerPosition() + "   Player Health Condition: " + muP11.getHealthCondition());
          System.out.println("12) " + muP12.getName() + "   Jersey Number: " + muP12.getJerseyNumber() + "   Player Position: " + muP12.getPlayerPosition() + "   Player Health Condition: " + muP12.getHealthCondition());
          System.out.println("13) " + muP13.getName() + "   Jersey Number: " + muP13.getJerseyNumber() + "   Player Position: " + muP13.getPlayerPosition() + "   Player Health Condition: " + muP13.getHealthCondition());
          System.out.println("14) " + muP14.getName() + "   Jersey Number: " + muP14.getJerseyNumber() + "   Player Position: " + muP14.getPlayerPosition() + "   Player Health Condition: " + muP14.getHealthCondition());
          System.out.println("15) " + muP15.getName() + "   Jersey Number: " + muP15.getJerseyNumber() + "   Player Position: " + muP15.getPlayerPosition() + "   Player Health Condition: " + muP15.getHealthCondition());
          System.out.println("16) " + muP16.getName() + "   Jersey Number: " + muP16.getJerseyNumber() + "   Player Position: " + muP16.getPlayerPosition() + "   Player Health Condition: " + muP16.getHealthCondition());
          System.out.println("17) " + muP17.getName() + "   Jersey Number: " + muP17.getJerseyNumber() + "   Player Position: " + muP17.getPlayerPosition() + "   Player Health Condition: " + muP17.getHealthCondition());
          System.out.println("18) " + muP18.getName() + "   Jersey Number: " + muP18.getJerseyNumber() + "   Player Position: " + muP18.getPlayerPosition() + "   Player Health Condition: " + muP18.getHealthCondition());
          System.out.println("19) " + muP19.getName() + "   Jersey Number: " + muP19.getJerseyNumber() + "   Player Position: " + muP19.getPlayerPosition() + "   Player Health Condition: " + muP19.getHealthCondition());

          System.out.println("\nResult of Last 2 Matches: ");
          muResult1.displayResult();
          muResult2.displayResult();

          System.out.println("\nFixture of Upcoming 2 Matches: ");
          muFixture1.displayFixture();
          muFixture2.displayFixture();
       }

        else {
          System.out.println("You Have Typing Mistakes or There is no such team Informations:(\n" +
                  "Please Try again:)");
       }
    }
}
