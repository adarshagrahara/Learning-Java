public class Shape {
      private int x;
      private int y;
      
      
      public Shape(int x, int y) {
            this.x = x;
            this.y = y;
            
      }
}

class Square extends Shape{
      private int length;
      
      
      public Square(int x, int y) {
            this(0,x,y);
      }
      
      public Square(int length, int x, int y) {
          super(x,y);
          this.length = length;
      }
      
}
