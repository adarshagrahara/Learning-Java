package us.adarsh_agrahara;

public class Main {
      
      public static void main(String[] args) {
            // TODO Auto-generated method stub
            ITelephone telephone;
            telephone = new DeskPhone(123485);
            telephone.powerOn();
            telephone.callPhone(123485);
            telephone.answer();
            
            telephone = new MobilePhone(24565);
            telephone.powerOn();
            telephone.callPhone(24565);
            telephone.answer();
      }
      
}
