public class A112_MegaBytesConverter {
	
	public static void main(String[] args) {
		
		int kiloBytes = 2500;
		
		printMegaBytesAndKiloBytes(kiloBytes);
		
		
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		if (kiloBytes >= 0) {
			
			int megabytes = kiloBytes / 1024;
			
			int remainder = kiloBytes % 1024;
			
			System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
			
		}
		
		if (kiloBytes < 0) {

			System.out.println("Invalid Value");

		}
		
		
	}
	

}
