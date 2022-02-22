package us.adarsh_agrahara.SetChallenge;

public class Planet extends HeavenlyBody{
      public Planet(String name, double orbitalPeriod) {
            super(name, orbitalPeriod, BodyTypes.PLANET);
      }
      
      @Override
      public boolean addSatellite(HeavenlyBody moon) {
            if(moon.getBodyType().equals(BodyTypes.MOON)){
                  return super.addSatellite(moon);
            } else{
                  return false;
            }
            
      }
}
