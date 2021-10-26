public class House {
      public static void main(String[] args) {
            Furniture furniture = new Furniture(
                        new Painting(7, 10),
                        new Curtains(10, 25, 1),
                        new Photos(5, 3, 5));
            Necessities necessities = new Necessities(
                        new Bed(4, 8, 1, "Queen"),
                        new Desk(10, 4, 5),
                        new Lamp(2.3, 7, 2.7, true),
                        new Chair("leather", 6, 3, 4, 4));
            PhysicalObjects physicalObjects = new PhysicalObjects(furniture, necessities);
            Room room = new Room(physicalObjects); // creates the room instance
            room.getPhysicalObjects().getFurniture().getCurtains().getCost();
            room.getPhysicalObjects().getNecessities().getLamp().turnOnLamp();
            
      }
}

class Room {
      private PhysicalObjects physicalObjects;
      
      public Room(PhysicalObjects physicalObjects) {
            this.physicalObjects = physicalObjects;
      }
      
      public PhysicalObjects getPhysicalObjects() {
            return physicalObjects;
      }
}

class PhysicalObjects {
      private Furniture furniture;
      private Necessities necessities;
      
      public PhysicalObjects(Furniture furniture, Necessities necessities) {
            this.furniture = furniture;
            this.necessities = necessities;
      }
      
      public Furniture getFurniture() {
            return furniture;
      }
      
      public Necessities getNecessities() {
            return necessities;
      }
}

class Furniture {
      private Painting paintings;
      private Curtains curtains;
      private Photos photos;
      
      public Furniture(Painting paintings, Curtains curtains, Photos photos) {
            this.paintings = paintings;
            this.curtains = curtains;
            this.photos = photos;
      }
      
      public Painting getPaintings() {
            return paintings;
      }
      
      public Curtains getCurtains() {
            return curtains;
      }
      
      public Photos getPhotos() {
            return photos;
      }
}

class Painting {
      private int width;
      private int height;
      
      public Painting(int width, int height) {
            this.width = width;
            this.height = height;
      }
      
      public int getWidth() {
            return width;
      }
      
      public int getHeight() {
            return height;
      }
}

class Photos {
      private int width;
      private int height;
      private int amount;
      
      public Photos(int width, int height, int amount) {
            this.width = width;
            this.height = height;
            this.amount = amount;
      }
      
      public int getWidth() {
            return width;
      }
      
      public int getHeight() {
            return height;
      }
      
      public int getAmount() {
            return amount;
      }
}

class Curtains {
      private int length;
      private double cost;
      private int thickness;
      
      public Curtains(int length, double cost, int thickness) {
            this.length = length;
            this.cost = cost;
            this.thickness = thickness;
      }
      
      public int getLength() {
            return length;
      }
      
      public double getCost() {
            return cost;
      }
      
      public int getThickness() {
            return thickness;
      }
}

class Necessities {
      private Bed bed;
      private Desk desk;
      private Lamp lamp;
      private Chair chair;
      
      public Necessities(Bed bed, Desk desk, Lamp lamp, Chair chair) {
            this.bed = bed;
            this.desk = desk;
            this.lamp = lamp;
            this.chair = chair;
      }
      
      public Bed getBed() {
            return bed;
      }
      
      public Desk getDesk() {
            return desk;
      }
      
      public Lamp getLamp() {
            return lamp;
      }
      
      public Chair getChair() {
            return chair;
      }
}

class Bed {
      private int width;
      private int length;
      private int height;
      private String size;
      
      public Bed(int width, int length, int height, String size) {
            this.width = width;
            this.length = length;
            this.height = height;
            this.size = size;
      }
      
      public int getWidth() {
            return width;
      }
      
      public int getLength() {
            return length;
      }
      
      public int getHeight() {
            return height;
      }
      
      public String getSize() {
            return size;
      }
}

class Desk {
      private int width;
      private int length;
      private int height;
      
      public Desk(int width, int length, int height) {
            this.width = width;
            this.length = length;
            this.height = height;
      }
      
      public int getWidth() {
            return width;
      }
      
      public int getLength() {
            return length;
      }
      
      public int getHeight() {
            return height;
      }
}

class Lamp {
      private double voltage;
      private int height;
      private double amps;
      private boolean OffOrOn;
      
      public Lamp(double voltage, int height, double amps, boolean offOrOn) {
            this.voltage = voltage;
            this.height = height;
            this.amps = amps;
            OffOrOn = offOrOn;
      }
      
      public double getVoltage() {
            return voltage;
      }
      
      public int getHeight() {
            return height;
      }
      
      public double getAmps() {
            return amps;
      }
      
      public boolean isOffOrOn() {
            return OffOrOn;
      }
      
      public void turnOnLamp(){
            if(OffOrOn){
                  System.out.println("Lamp is on");
            } else{
                  System.out.println("Lamp is off");
            }
      }
}

class Chair {
      private String material;
      private int height;
      private int width;
      private int length;
      private int depth;
      
      public Chair(String material, int height, int width, int length, int depth) {
            this.material = material;
            this.height = height;
            this.width = width;
            this.length = length;
            this.depth = depth;
      }
      
      public String getMaterial() {
            return material;
      }
      
      public int getHeight() {
            return height;
      }
      
      public int getWidth() {
            return width;
      }
      
      public int getLength() {
            return length;
      }
      
      public int getDepth() {
            return depth;
      }
}

