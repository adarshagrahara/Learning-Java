import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database {
      public static void pushNewAccountToDatabase() throws SQLException, ClassNotFoundException {
            Main.yourBalance.setAccount(Account.account_ID, Account.fullName, Account.email, Account.phoneNumber, Account.password);
            //^ this is the fields that should be inputted to the db
            Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = connect();
            String accountsOfMany = "accounts";
            try (PreparedStatement preparedStatement = conn.prepareStatement(new StringBuilder().append("INSERT INTO ").append(accountsOfMany).append(" (AccountID, FullName, Email, PhoneNumber, Password, Balance) VALUES (?,?,?,?,?,?)").toString())) {
            
                  preparedStatement.setLong(1, Main.yourBalance.getAccountNumber());
                  preparedStatement.setString(2, Main.yourBalance.getCustomerName());
                  preparedStatement.setString(3, Main.yourBalance.getEmail());
                  preparedStatement.setLong(4, Main.yourBalance.getPhoneNumber());
                  preparedStatement.setString(5, Main.yourBalance.getPassword());
                  preparedStatement.setLong(6, Main.yourBalance.getBalance());
            
                  int row = preparedStatement.executeUpdate();
            }
      
      
      }
      
      public static Connection connect() throws SQLException {
            return DriverManager.getConnection("jdbc:postgresql://localhost:9876/The Bank", "postgres", "password");
      }
}
