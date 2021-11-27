public class Bank {
      
      private long accountNumber;
      private int balance;
      private String customerName;
      private String email;
      private long phoneNumber;
      private String password;
      private boolean test;
      
      
      
      public void setAccount(long accountNumber, String customerName, String email, long phoneNumber, String password) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
      }
      
      public void setBalance(int balance) {
            this.balance = balance;
      }
      
      //------------------------------------------------
      
      public long getAccountNumber() {
            return this.accountNumber;
      }
      
      public int getBalance() {
            return this.balance;
      }
      
      public String getCustomerName() {
            return this.customerName;
      }
      
      public String getEmail() {
            return this.email;
      }
      
      public long getPhoneNumber() {
            return this.phoneNumber;
      }
      
      public String getPassword() {
            return this.password;
      }
      
      
      //-----------------------------------
      
      
}
