package us.adarsh_agrahara.GenericsPart2;

public class Main {
      public static void main(String[] args) {
            FootballPLayer joe = new FootballPLayer("joe");
            BaseballPlayer pat = new BaseballPlayer("pat");
            SoccerPlayer beckham = new SoccerPlayer("beckham");
      
            Team crows = new Team("crows");
            crows.addPlayer(joe);
            crows.addPlayer(pat);
            crows.addPlayer(beckham);
      
            System.out.println(crows.numPlayers());
      }
     
}
