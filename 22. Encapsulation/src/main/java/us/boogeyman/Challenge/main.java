public class main {
      public static void main(String[] args) {
            Printer printer = new Printer(499,10,true); // only touch these variables
            if(printer.getDuplexPrinter()){
                  System.out.println(printer.getPagesPrinted()+" page(s) have been printed double sided");
            } else{
                  System.out.println(printer.getPagesPrinted()+" page(s) have been printed");
            }
            System.out.println("You started out with "+printer.getOriginalTonerLevel()+"% of toner and used "+printer.getTonerLevelLost()+"% of toner and now you have "+printer.getTonerLevel()+"% of toner left");
            
            
      }
}
