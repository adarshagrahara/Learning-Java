package us.adarsh_agrahara.SetChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp;
		
		temp = new HeavenlyBody("Mercury",88);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Venus",225);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("Earth",365);
		solarSystem.put(temp.getName(),temp);
		planets.add(temp);
		
		
		HeavenlyBody tempMoon;
		tempMoon = new HeavenlyBody("Moon",27);
		solarSystem.put(tempMoon.getName(),tempMoon);
		temp.addSatellite(tempMoon);
		
		
		System.out.println("Planets");
		for(HeavenlyBody planet:planets){
			System.out.println("\t"+planet.getName());
		}
		
		HeavenlyBody body = solarSystem.get("Earth");
		System.out.println("Moons of "+body.getName());
		for(HeavenlyBody earthMoon: body.getSatellite()){
			System.out.println("\t"+earthMoon.getName());
		}
		
		Set<HeavenlyBody> moon = new HashSet<>();
		for(HeavenlyBody planet: planets){
			moon.addAll(planet.getSatellite());
		}
		
		System.out.println("All Moons");
		for(HeavenlyBody moons : moon){
			System.out.println(moons.getName());
		}
		
		HeavenlyBody pluto = new HeavenlyBody("Pluto",824);
		planets.add(pluto);
		
		for(HeavenlyBody planet : planets){
			System.out.println(planet.getName()+" "+planet.getOrbitalPeriod());
		}
		
		Object o = new Object();
		o.equals(o);
		"pluto".equals("");
	
	}

}
