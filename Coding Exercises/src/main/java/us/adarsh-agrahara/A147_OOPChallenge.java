public class A147_OOPChallenge {
      public static void main(String[] args) {
            Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
            hamburger.addHamburgerAddition1("Tomato", 0.27);
            hamburger.addHamburgerAddition2("Lettuce", 0.75);
            hamburger.addHamburgerAddition3("Cheese", 1.13);
            System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
      
            HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
            healthyBurger.addHamburgerAddition1("Egg", 5.43);
            healthyBurger.addHealthyAddition1("Lentils", 3.41);
            System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
      
            DeluxeBurger db = new DeluxeBurger();
            db.addHamburgerAddition3("Should not do this", 50.53);
            System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
      }
}

class Hamburger{
      private String name;
      private String meat;
      private String breadRollType;
      private double price;
      private String addition1Name;
      private String addition2Name;
      private String addition3Name;
      private String addition4Name;
      private double addition1Price;
      private double addition2Price;
      private double addition3Price;
      private double addition4Price;
      
      public void addHamburgerAddition1(String additionName, double additionPrice){
            this.addition1Name = additionName;
            this.addition1Price = additionPrice;
      }
      public void addHamburgerAddition2(String additionName, double additionPrice){
            this.addition2Name = additionName;
            this.addition2Price = additionPrice;
      }
      public void addHamburgerAddition3(String additionName, double additionPrice){
            this.addition3Name = additionName;
            this.addition3Price = additionPrice;
      }
      public void addHamburgerAddition4(String additionName, double additionPrice){
            this.addition4Name = additionName;
            this.addition4Price = additionPrice;
      }
      
      public double itemizeHamburger(){
            return price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
      }
      
      
      public Hamburger(String name, String meat, double price, String breadRollType) {
            this.name = name;
            this.meat = meat;
            this.breadRollType = breadRollType;
            this.price = price;
      }
      
      public String getName() {
            return name;
      }
      
      public String getMeat() {
            return meat;
      }
      
      public String getBreadRollType() {
            return breadRollType;
      }
      
      public double getPrice() {
            return price;
      }
}

class DeluxeBurger extends Hamburger{
      public DeluxeBurger(String meat, double price) {
            super("Deluxe", meat, price, "Brioche");
      }
      
      @Override
      public void addHamburgerAddition1(String noString, double noDouble){
            System.out.println("No items can be added to the Deluxe Burger");
      }
      
      @Override
      public void addHamburgerAddition2(String noString, double noDouble){
            System.out.println("No items can be added to the Deluxe Burger");
      }
      
      @Override
      public void addHamburgerAddition3(String noString, double noDouble){
            System.out.println("No items can be added to the Deluxe Burger");
      }
      
      @Override
      public void addHamburgerAddition4(String noString, double noDouble){
            System.out.println("No items can be added to the Deluxe Burger");
      }
      
      @Override
      public double itemizeHamburger(){
            return 19.10;
      }
}

class HealthyBurger extends Hamburger{
      private String healthyExtra1Name;
      private String healthyExtra2Name;
      private double healthyExtra1Price;
      private double healthyExtra2Price;
      
      // I JUST NEED TO ADD THE HEALTHYADDITIONS METHODS BECAUSE THE HAMBURGER METHODS WITH AUTOMATICALLY ADD BECAUSE IT IS THE SUPERTYPE
      public HealthyBurger(String meat, double price) {
            super("Healthy", meat, price, "Rye");
      }
      
      
      
      
      
}