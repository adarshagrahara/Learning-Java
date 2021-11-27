import java.sql.SQLException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;

import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("LoopStatementThatDoesntLoop")
public class Account {
      
      public static long account_ID = 0;
      public static String fullName = null;
      public static String email = null;
      public static long phoneNumber = 0;
      public static String password = null;
      
      public static void accessYourAccount() {
            System.out.println("accessed your account");
      }
      
      public static void createYourAccount() throws IOException, ParseException, InterruptedException, SQLException, ClassNotFoundException {
            for (int lll = 0; lll < 1; lll--) {
                  Scanner input = new Scanner(System.in);
                  Scanner sc = new Scanner(System.in);
                  System.out.println("What is your FULL NAME? (Last First)");
                  fullName = input.nextLine();
                  fullName = fullName.toUpperCase(Locale.ROOT);
                  System.out.println("What is your EMAIL?");
                  email = input.nextLine();
                  email = email.toUpperCase(Locale.ROOT);
                  System.out.println("What is your PHONE NUMBER?");
                  String stringPhoneNumber = input.nextLine();
                  int len = stringPhoneNumber.length();
                  boolean ifDigitsOnly = onlyDigits(stringPhoneNumber, len);
                  if (!ifDigitsOnly) {
                        System.out.println("Please enter a real phone number.");
                        for (int i = 0; i < 3; i++) {
                              System.out.println("------------------------------------------------");
                        }
                        continue;
                  }
                  System.out.println("Create your password (case sensitive)");
                  password = input.nextLine();
                  System.out.println("Repeat your password (case sensitive)");
                  String repeatPassword = input.nextLine();
                  if (password.equals(repeatPassword)) {
                        account_ID = accountIDGenerator();
                        System.out.println("Your account number is " + account_ID);
                        System.out.println("Keep your account number safe.");
                        Main.yourBalance.setBalance(0);
                        Database.pushNewAccountToDatabase();
                        break;
                  } else {
                        System.out.println("Passwords do not match");
                        for (int i = 0; i < 3; i++) {
                              System.out.println("------------------------------------------------");
                        }
                        continue;
                  }
            }
            for (int i = 0; i < 3; i++) {
                  System.out.println("------------------------------------------------");
            }
            
      }
      
      public static long accountIDGenerator() {
            
            Random rand = new Random();
            long min = 100000000000000000L;
            long max = 999999999999999999L;
            
            
            return (long) Math.floor(Math.random() * (max - min + 1) + min);
            
      }
      
      public static boolean onlyDigits(String str, int n) {
            
            for (int i = 0; i < n; i++) {
      
                  return Character.isDigit(str.charAt(i));
            }
            return false;
      }
      
}
