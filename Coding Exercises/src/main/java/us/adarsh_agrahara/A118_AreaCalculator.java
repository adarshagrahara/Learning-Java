public class A118_AreaCalculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 5d;
		
		System.out.println(area(radius));
		
		System.out.println(area(5d, -4d));
		
		
		
 

	}
	
	public static double area(double radius) {
		
		if (radius > -1) {
			
			double radiusTotal = radius * radius * Math.PI;
			
			return radiusTotal;
			
		}
		
		
		return -1.0d;
		
	}
	
	public static double area(double x, double y) {
		
		if (x > -1 && y > -1) {
			
			double area = x * y;
			
			return area;
			
		}
		
		return -1d;
		
	}

}
