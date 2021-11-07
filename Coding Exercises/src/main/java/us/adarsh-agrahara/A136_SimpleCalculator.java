public class A136_SimpleCalculator {
      
      private double firstNumber;
      private double secondNumber;
      
      public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
      }
      
      public double getFirstNumber() {
            return this.firstNumber;
      }
      
      public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
      }
      
      public double getSecondNumber() {
            return this.secondNumber;
      }
      
      public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
      }
      
      public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
      }
      
      public double getMultiplicationResult() {
            return this.secondNumber * this.firstNumber;
      }
      
      public double getDivisionResult() {
            if (this.secondNumber == 0) {
                  return 0;
            } else {
                  return this.firstNumber / this.secondNumber;
            }
            
            
      }
}