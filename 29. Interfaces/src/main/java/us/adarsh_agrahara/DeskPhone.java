package us.adarsh_agrahara;

public class DeskPhone implements ITelephone {
      
      private int myNumber;
      private boolean isRinging;
      
      @Override
      public void powerOn() {
            System.out.println("No action taken, no power button");
      }
      
      @Override
      public void dial(int number) {
            System.out.println("Now ringing " + number + " on the desk phone");
      }
      
      @Override
      public void answer() {
            if (this.isRinging) {
                  System.out.println("Answering desk phone");
                  this.isRinging = false;
            }
      }
      
      @Override
      public boolean callPhone(int number) {
            if (number == myNumber) {
                  this.isRinging = true;
                  System.out.println("Ring Ring");
            } else {
                  this.isRinging = false;
            }
            return this.isRinging;
      }
      
      public DeskPhone(int myNumber) {
            this.myNumber = myNumber;
      }
      
      @Override
      public boolean isRinging() {
            return this.isRinging;
      }
}
