package us.adarsh_agrahara.SetChallenge;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
      private final String name;
      private final double orbitalPeriod;
      private final Set<HeavenlyBody> satellite;
      private final BodyTypes bodyType;
      
      public enum BodyTypes{
            STAR,
            PLANET,
            DWARF_PLANET,
            MOON,
            COMET,
            ASTEROID
      }
      
      public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
            this.name = name;
            this.orbitalPeriod = orbitalPeriod;
            this.satellite = new HashSet<>();
            this.bodyType = bodyType;
            
      }
      
      public BodyTypes getBodyType() {
            return bodyType;
      }
      
      public String getName() {
            return name;
      }
      
      public double getOrbitalPeriod() {
            return orbitalPeriod;
      }
      
      public boolean addSatellite(HeavenlyBody moon){
            return this.satellite.add(moon);
      }
      
      public Set<HeavenlyBody> getSatellite() {
            return new HashSet<>(this.satellite);
            
      }
      
      @Override
      public final boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (o instanceof HeavenlyBody) {
                  HeavenlyBody theObj = (HeavenlyBody) o;
                  if (this.name.equals(theObj.getName())) {
                        return this.bodyType == theObj.getBodyType();
                  }
            }
            return false;
      }
      
      @Override
      public final int hashCode() {
            return this.name.hashCode() + 57+this.bodyType.hashCode();
      }
      
      @Override
      public String toString() {
            return this.name+": "+ this.getBodyType()+", "+this.orbitalPeriod;
      }
}
