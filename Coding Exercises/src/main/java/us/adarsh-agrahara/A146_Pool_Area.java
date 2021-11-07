public class A146_Pool_Area {
      public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("rectangle.width= " + rectangle.getWidth());
            System.out.println("rectangle.length= " + rectangle.getLength());
            System.out.println("rectangle.area= " + rectangle.getArea());
            Cuboid cuboid = new Cuboid(5,10,5);
            System.out.println("cuboid.width= " + cuboid.getWidth());
            System.out.println("cuboid.length= " + cuboid.getLength());
            System.out.println("cuboid.area= " + cuboid.getArea());
            System.out.println("cuboid.height= " + cuboid.getHeight());
            System.out.println("cuboid.volume= " + cuboid.getVolume());
            System.out.println(cuboid.test());
      }
}

class Rectangle {
      private double width;
      private double length;
      
      public Rectangle(double width, double length) {
            if (width < 0) {
                  this.width = 0;
            } else {
                  this.width = width;
            }
            if (length < 0) {
                  this.length = 0;
            } else {
                  this.length = length;
            }
      }
      
      public double getWidth() {
            return width;
      }
      
      public double getLength() {
            return length;
      }
      
      public double getArea(){
            return this.width*this.length;
      }
      
      public String test(){
            return "uh";
      }
}

class Cuboid extends Rectangle{
      private double height;
      
      public Cuboid(double width, double length, double height) {
            super(width, length);
            if (height < 0){
                  this.height = 0;
            } else {
                  this.height = height;
            }
      }
      
      public double getHeight() {
            return height;
      }
      
      public double getVolume(){
            return (getHeight() * super.getArea());
      }
      
      
      public String test(int hu){
            System.out.println(super.test());
            return "uh1";
      }
}