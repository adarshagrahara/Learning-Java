public class Printer {
      private double tonerLevel;
      private double pagesPrinted;
      private boolean duplexPrinter;
      private double originalTonerLevel;
      
      public Printer(double tonerLevel, double pagesPrinted, boolean duplexPrinter) {
            if (tonerLevel >= 0 && tonerLevel <= 100) {
                  this.tonerLevel = tonerLevel;
                  this.originalTonerLevel = tonerLevel;
            } else {
                  System.out.println("You cannot have "+tonerLevel+"% of toner, it is now set at 50% of toner");
                  this.tonerLevel = 50;
                  this.originalTonerLevel = 50;
            }
            this.pagesPrinted = pagesPrinted;
            this.duplexPrinter = duplexPrinter;
            
            pagesPrinted();
      }
      
      public void pagesPrinted() {
            if (this.pagesPrinted <= 0) {
                  System.out.println("You cannot print 0 pages");
            } else {
                  if (this.duplexPrinter) {
                        System.out.println("Printing in duplex mode");
                        if (this.tonerLevel < this.pagesPrinted * 2) {
                              howManyPages();
                        } else {
                              this.tonerLevel = this.pagesPrinted;
                              this.pagesPrinted = (this.pagesPrinted) / 2;
                              if (this.pagesPrinted% 1 != 0) {
                                    this.pagesPrinted = this.pagesPrinted + .5;
                              }
                        }
                  } else {
                        if (this.tonerLevel < this.pagesPrinted) {
                              howManyPages();
                        } else {
                              this.tonerLevel = this.pagesPrinted;
                        }
                  }
            }
      }
      
      public void howManyPages() {
            if (this.duplexPrinter) {
                  this.pagesPrinted = this.tonerLevel/2;
            } else {
                  this.pagesPrinted = this.tonerLevel;
            }
      }
      
      public double getPagesPrinted() {
            return this.pagesPrinted;
      }
      
      public double getTonerLevel() {
            return this.originalTonerLevel - this.tonerLevel;
      }
      
      public double getOriginalTonerLevel() {
            return this.originalTonerLevel;
      }
      
      public double getTonerLevelLost() {
            if(duplexPrinter){
                  return this.pagesPrinted *2;
            }
            return this.pagesPrinted;
      }
      
      public boolean getDuplexPrinter(){
            return this.duplexPrinter;
      }
      
}