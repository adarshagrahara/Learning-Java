
public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = getDurationString(65,45);
		String test1 = getDurationString(3945);
		
		
		
		System.out.println(test);
		System.out.println(test1);
		

	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
			
			
				
				int hours = minutes / 60;
				
				int remainingminutes = minutes % 60;
				
				return "" + hours + "h " + remainingminutes + "m " + seconds + "s";
				
			
		}
		
		
		return "Invalid Value";
	}
	
	public static String getDurationString(int seconds) {
		
		if (seconds >= 0) {
			
			int minutes = seconds / 60;
			
			int remainingseconds = seconds % 60;
			
			return getDurationString(minutes, remainingseconds);
			
			
			
			
		} 
			
		
		
		return "Invalid Value";
		
	}
	

}
