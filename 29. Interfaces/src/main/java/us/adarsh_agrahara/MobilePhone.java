package us.adarsh_agrahara;

public class MobilePhone implements ITelephone {
      
      
      private int myNumber;
      private boolean isRinging;
      private boolean isOn = false;
      
      public MobilePhone(int myNumber) {
            this.myNumber = myNumber;
      }
      
      @Override
      
      public void powerOn() {
            this.isOn = true;
            System.out.println("Mobile phone is powered up.");
      }
      
      @Override
      public void dial(int number) {
            if(this.isOn){
                  System.out.println("Now ringing " + number + " on the desk phone");
            } else{
                  System.out.println("Phone is off");
            }
      }
      
      @Override
      public void answer() {
            if (this.isRinging) {
                  System.out.println("Answering mobile phone");
                  this.isRinging = false;
            }
      }
      
      @Override
      public boolean callPhone(int number) {
            if (number == myNumber && isOn) {
                  this.isRinging = true;
                  System.out.println("Melody Ring");
            } else {
                  this.isRinging = false;
                  System.out.println("Mobile phone not on");
            }
            return this.isRinging;
      }
      
      
      @Override
      public boolean isRinging() {
            return this.isRinging;
      }
}

