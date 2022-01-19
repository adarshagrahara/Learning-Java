package us.adarsh_agrahara.GenericsPart2;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
      int played = 0;
      int won = 0;
      int loss = 0;
      int tied = 0;
      private String name;
      private ArrayList<T> members = new ArrayList<>();
      
      public Team(String name) {
            this.name = name;
      }
      
      public String getName() {
            return name;
      }
      
      public boolean addPlayer(T player) {
            if (members.contains(player)) {
                  System.out.println(player.getName() + " is already on the team");
                  return false;
            } else {
                  members.add(player);
                  System.out.println(player.getName() + " picked for team" + this.name);
                  return true;
            }
            
      }
      
      public int numPlayers() {
            return this.members.size();
      }
      
      public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
            String message;
            if (ourScore > theirScore) {
                  this.won++;
                  message = " beat ";
            } else if (ourScore < theirScore) {
                  this.loss++;
                  message = " lost to ";
            } else {
                  this.tied++;
                  message = " tied with ";
            }
            
            this.played++;
            if (opponent != null) {
                  System.out.println(this.getName() + message + opponent.getName());
                  opponent.matchResult(null, theirScore, ourScore);
            }
      }
      
      public int ranking() {
            return (won * 2) + tied;
      }
      
      @Override
      public int compareTo(Team<T> team) {
            if (this.ranking() > team.ranking()) {
                  return -1;
            } else if (this.ranking() < team.ranking()) {
                  return 1;
            } else {
                  return 0;
            }
            
      }
}
