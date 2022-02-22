package us.adarsh_agrahara;

import java.util.HashMap;
import java.util.Map;

public class Location {
      private final int loactionID;
      private final String description;
      private final Map<String, Integer> exits;
      
      public Location(int loactionID, String description) {
            this.loactionID = loactionID;
            this.description = description;
            this.exits = new HashMap<>();
            this.exits.put("Q",0);
      }
      
      public void addExit(String direction, int location){
            exits.put(direction, location);
      }
      
      public int getLoactionID() {
            return loactionID;
      }
      
      public String getDescription() {
            return description;
      }
      
      public Map<String, Integer> getExits() {
             return new HashMap<>(exits);
      }
}
