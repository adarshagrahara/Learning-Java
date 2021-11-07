import static java.lang.Math.*;

public class A139_Point {}

class main1{
      
      public static void main(String[] args) {
            Point first = new Point(6,5);
            Point second = new Point(3,1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2,2));
            Point point = new Point();
            System.out.println("distance()= " + point.distance());
            
      
      }

}

class Point{
      
      private int x;
      private int y;
      
      public Point(){
            // This is a no-argument constructor with an empty body, but is not a default constructor.
      }
      
      public Point(int x, int y) {
            setX(x);
            setY(y);
      }
      
      
      public int getX() {
            return x;
      }
      
      public void setX(int x) {
            this.x = x;
      }
      
      public int getY() {
            return y;
      }
      
      public void setY(int y) {
            this.y = y;
      }
      
      public double distance(){
            return sqrt((-this.y) * (-this.y) + (-this.x) * (-this.x));
      }
      
      public double distance(Point first){
            return sqrt(pow(first.getX() - getX(), 2) + pow(first.getY() - getY(), 2));
      }
      
      public double distance(int x, int y){
            return Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));
      }
}

