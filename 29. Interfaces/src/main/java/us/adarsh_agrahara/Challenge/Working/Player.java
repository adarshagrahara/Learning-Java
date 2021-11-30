package us.adarsh_agrahara.Challenge.Working;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
      private String name;
      private String weapon;
      private int hitPoints;
      private int strength;
      
      public Player(String name, int hitPoints, int strength) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.strength = strength;
            this.weapon = "Sword";
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
      public String toString() {
            return "Player{" +
                        "name='" + name + '\'' +
                        ", weapon='" + weapon + '\'' +
                        ", hitPoints=" + hitPoints +
                        ", strength=" + strength +
                        '}';
      }
      
      @Override
      public List<String> write() {
            List<String> val = new ArrayList<>();
            val.add(0, this.name);
            val.add(1, Integer.toString(this.hitPoints));
            val.add(2, Integer.toString(this.strength));
            val.add(3, this.weapon);
            return val;
      }
      
      @Override
      public void read(List<String> list) {
            if (list != null && list.size() > 0) {
                  this.name = list.get(0);
                  this.hitPoints = Integer.parseInt(list.get(1));
                  this.strength = Integer.parseInt(list.get(2));
                  this.weapon = list.get(3);
            }
      }
}
