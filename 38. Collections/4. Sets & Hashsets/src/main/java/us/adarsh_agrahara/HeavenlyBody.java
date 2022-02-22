package us.adarsh_agrahara;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
      private final String name;
      private final double orbitalPeriod;
      private final Set<HeavenlyBody> satellite;
      
      public HeavenlyBody(String name, double orbitalPeriod) {
            this.name = name;
            this.orbitalPeriod = orbitalPeriod;
            this.satellite = new HashSet<>();
            
      }
      
      public String getName() {
            return name;
      }
      
      public double getOrbitalPeriod() {
            return orbitalPeriod;
      }
      
      public boolean addMoon(HeavenlyBody moon){
            return this.satellite.add(moon);
      }
      
      public Set<HeavenlyBody> getSatellite() {
            return new HashSet<>(this.satellite);
            
      }
      
      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return Double.compare(((HeavenlyBody) o).orbitalPeriod, orbitalPeriod) == 0 && Objects.equals(name, ((HeavenlyBody) o).name) && Objects.equals(satellite, ((HeavenlyBody) o).satellite);
      }
      
      @Override
      public int hashCode() {
            return this.name.hashCode() + 57;
      }
}
