package us.adarsh_agrahara;

public interface ITelephone {
      void powerOn();
      
      void dial(int number);
      
      void answer();
      
      boolean callPhone(int number);
      
      boolean isRinging();
}
