package us.adarsh_agrahara;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Theatre theatre = new Theatre("Olyimpian",8,9);
//		theatre.getSeats();
		if(theatre.reserveSeat("H09")){
			System.out.println("Please pay");
		} else{
			System.out.println("Seat is taken");
		}
		
		if(theatre.reserveSeat("H09")){
			System.out.println("Please pay");
		} else{
			System.out.println("Seat is taken");
		}
	
	
	}

}
