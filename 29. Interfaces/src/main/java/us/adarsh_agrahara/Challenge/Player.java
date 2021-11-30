package us.adarsh_agrahara.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable{
      private String name;
      private String weapon;
      private int hitPoints;
      private int strength;
      
      public Player(String name, int hitPoints, int strength) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.strength = strength;
            this.weapon = "sword";
      }
      
      public String getName() {
            return name;
      }
      
      public String getWeapon() {
            return weapon;
      }
      
      public int getHitPoints() {
            return hitPoints;
      }
      
      public int getStrength() {
            return strength;
      }
      
      public void setName(String name) {
            this.name = name;
      }
      
      public void setWeapon(String weapon) {
            this.weapon = weapon;
      }
      
      public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
      }
      
      public void setStrength(int strength) {
            this.strength = strength;
      }
      
      @Override
      public List<String> write() {
            List<String> a = new ArrayList<String>();
            a.add("name='"+this.name+"'");
            a.add("hitPoints="+this.hitPoints);
            a.add("strength="+this.strength);
            a.add("Sword='"+this.name+"'");
            return a;
      }
      
      @Override
      public void read(List<String> a) {
            a.add("name='"+this.name+"'");
            a.add("hitPoints="+this.hitPoints);
            a.add("strength="+this.strength);
            a.add("Sword='"+this.name+"'");
      
      }
}
