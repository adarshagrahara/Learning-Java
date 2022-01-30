package us.adarsh_agrahara;

public class ExtendedPassword extends Password{
      private int decryptedPassword;
      
      public ExtendedPassword(int password) {
            super(password);
            this.decryptedPassword = password;
      }
      
}
