public class A138_WallArea {

}
class main {
      
     
      
      public static void main(String[] args) {
            Wall wall = new Wall(-3,-5);
            
            System.out.println(wall.getArea());
            
      }

      
      

}

class Wall{
      
      private double width;
      private double height;
      
      public Wall() {
            // This is a no-argument constructor with an empty body, but is not a default constructor.
      }
      
      public Wall(double width, double height) {
            setWidth(width);
            setHeight(height);
      }
      
      
      public double getHeight() {
            return height;
      }
      
      public void setHeight(double height) {
            if (height < 0) {
                  this.height = 0;
            } else {
                  this.height = height;
            }
      
      }
      
      public double getWidth() {
            return width;
      }
      
      public void setWidth(double width) {
            if (width < 0) {
                  this.width = 0;
                  System.out.println(this.width);
            } else {
                  this.width = width;
            }
      }
      public double getArea(){
            return this.height * this.width;
      }
}

