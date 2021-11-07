import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
      
      private static int oldBalance = 0;
      
      public static final Bank yourBalance = new Bank();
      public static final Bank yourAccount = new Bank();
      
      public static void main(String[] args) throws IOException, ParseException, InterruptedException, SQLException, ClassNotFoundException {
            setupYourAccount();
            transaction();
            
      }
      
      public static void setupYourAccount() throws IOException, ParseException, InterruptedException, SQLException, ClassNotFoundException {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you have an account? (yes/no)");
            String account = input.nextLine();
            for (int jj = 0; jj < 1; jj--) {
                  if (account.toLowerCase(Locale.ROOT).equals("yes")) {
                        Account.accessYourAccount();
                        break;
                  } else if (account.toLowerCase(Locale.ROOT).equals("no")) {
                        System.out.println("Would you like to create an account? (yes/no)");
                        String createAccount = input.nextLine();
                        for (int jjj = 0; jjj < 1; jjj--) {
                              if (createAccount.toLowerCase(Locale.ROOT).equals("yes")) {
                                    Account.createYourAccount();
                                    System.out.println("Would you like to access your account now? (yes/no)");
                                    String accessNewAccount = input.nextLine();
                                    for (int l = 0; l < 1; l--) {
                                          if (accessNewAccount.toLowerCase(Locale.ROOT).equals("yes")) {
                                                Account.accessYourAccount();
                                                break;
                                          } else if (accessNewAccount.toLowerCase(Locale.ROOT).equals("no")) {
                                                System.out.println("Catch you another time then");
                                                System.exit(0);
                                          }
                                          System.out.println("Please write either (yes/no)");
                                          accessNewAccount = input.nextLine();
                                          accessNewAccount = accessNewAccount.toLowerCase(Locale.ROOT);
                                    }
                                    break;
                              } else if (createAccount.toLowerCase(Locale.ROOT).equals("no")) {
                                    System.out.println("Catch you another time then");
                                    System.exit(0);
                              }
                              System.out.println("Please write either (yes/no)");
                              createAccount = input.nextLine();
                              createAccount = createAccount.toLowerCase(Locale.ROOT);
                        }
                        break;
                  }
                  System.out.println("Please write either (yes/no)");
                  account = input.nextLine();
                  account = account.toLowerCase(Locale.ROOT);
            }
            
            
      }
      
      public static void transaction() {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to make a transaction? (yes/no)");
            String transaction = input.nextLine();
            for (int ll = 0; ll < 1; ll--) {
                  if (transaction.toLowerCase(Locale.ROOT).equals("yes")) {
                        Account.accessYourAccount();
                        break;
                  } else if (transaction.toLowerCase(Locale.ROOT).equals("no")) {
                        System.out.println("Catch you another time then");
                        System.exit(0);
                  }
                  System.out.println("Please write either (yes/no)");
                  transaction = input.nextLine();
                  transaction = transaction.toLowerCase(Locale.ROOT);
            }
            
            System.out.println("Your balance is $" + yourBalance.getBalance());
            oldBalance = yourBalance.getBalance();
            System.out.println("Would you like to deposit or withdraw?");
            String choice = input.nextLine();
            choice = choice.toLowerCase(Locale.ROOT);
            for (int iii = 0; iii < 1; iii--) {
                  if (choice.equals("deposit")) {
                        depositFunds();
                        break;
                  } else if (choice.equals("withdraw")) {
                        withdrawFunds();
                        break;
                  } else {
                        System.out.println("Please write either (deposit/withdraw)");
                        choice = input.nextLine();
                        choice = choice.toLowerCase(Locale.ROOT);
                  }
            }
            for (int i = 0; i < 1; i--) {
                  
                  System.out.println("Would you like to make a transaction? (yes/no)");
                  String nextTransaction = input.nextLine();
                  for (int ll = 0; ll < 1; ll--) {
                        if (nextTransaction.toLowerCase(Locale.ROOT).equals("yes")) {
                              Account.accessYourAccount();
                              break;
                        } else if (nextTransaction.toLowerCase(Locale.ROOT).equals("no")) {
                              System.out.println("Catch you another time then");
                              System.exit(0);
                        }
                        System.out.println("Please write either (yes/no)");
                        nextTransaction = input.nextLine();
                        nextTransaction = nextTransaction.toLowerCase(Locale.ROOT);
                  }
                  
                  System.out.println("Your balance is $" + yourBalance.getBalance());
                  oldBalance = yourBalance.getBalance();
                  System.out.println("Would you like to deposit or withdraw?");
                  String nextChoice = input.nextLine();
                  nextChoice = nextChoice.toLowerCase(Locale.ROOT);
                  for (int ii = 0; ii < 1; ii--) {
                        if (nextChoice.equals("deposit")) {
                              depositFunds();
                              break;
                        } else if (nextChoice.equals("withdraw")) {
                              withdrawFunds();
                              break;
                        } else {
                              System.out.println("Please write either (deposit/withdraw)");
                              nextChoice = input.nextLine();
                              nextChoice = nextChoice.toLowerCase(Locale.ROOT);
                        }
                  }
            }
            
      }
      
      public static void depositFunds() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many dollars would you like to deposit?");
            int valueOfDeposit = input.nextInt();
            int newBalance = valueOfDeposit + oldBalance;
            yourBalance.setBalance(newBalance);
            System.out.println("Your new balance is $" + yourBalance.getBalance());
            for (int i = 0; i < 3; i++) {
                  System.out.println("------------------------------------------------");
            }
            
      }
      
      public static void withdrawFunds() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many dollars would you like to withdraw?");
            int valueOfWithdraw = input.nextInt();
            if (valueOfWithdraw >= oldBalance) {
                  for (int j = 0; j < 1; j--) {
                        System.out.println("Please choose a value that is less or equal to $" + yourBalance.getBalance());
                        valueOfWithdraw = input.nextInt();
                        if (valueOfWithdraw <= oldBalance) {
                              break;
                        }
                  }
            }
            int newBalance = oldBalance - valueOfWithdraw;
            yourBalance.setBalance(newBalance);
            System.out.println("Your new balance is $" + yourBalance.getBalance());
            for (int i = 0; i < 3; i++) {
                  System.out.println("------------------------------------------------");
            }
      }
}
