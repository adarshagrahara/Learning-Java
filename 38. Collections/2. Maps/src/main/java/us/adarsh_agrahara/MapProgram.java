package us.adarsh_agrahara;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
      public static void main(String[] args) {
            Map<String, String> languages = new HashMap<String, String>();
            languages.put("Java", "cool language");
            languages.put("Python", "Dusty");
            languages.put("SQL", "ORACLE");
            System.out.println(languages.put("PHP", "out of date"));
            System.out.println(languages.put("Javascript", "walmart version of Java"));
            
            if(languages.containsKey("Java")) System.out.println("Java is already in the Map");
            System.out.println(languages.get("cool language"));
      
            System.out.println("+++++++++++");
            
            languages.remove("Javascript");
            if(languages.remove("Javascript","walmart")){
                  System.out.println("Javascript removed");
            } else{
                  System.out.println("Javascript not removed");
            }
      
            System.out.println(languages.replace("SQL1", "ORACLE"));
            System.out.println(languages.replace("SQL", "un-Dusty"));
            
            for(String key:languages.keySet()){
                  System.out.println(key+" : "+languages.get(key));
            }
            
      }
}
