package us.adarsh_agrahara;

public class Password {
      private static final int KEY = 909;
      private final int encryptedPassword;
      
      public Password(int encryptedPassword) {
            this.encryptedPassword = encryptedDecrypt(encryptedPassword);
      }
      
      private int encryptedDecrypt(int password) {
            return password ^ KEY;
      }
      
      public final void storePassword(){
            System.out.println("Saving password as "+ this.encryptedPassword);
      }
      
      public boolean letMeIn(int password){
            if(encryptedDecrypt(password) == this.encryptedPassword){
                  System.out.println("Welcome");
                  return true;
            } else{
                  System.out.println("You are not allowed");
                  return false;
            }
      }
}
