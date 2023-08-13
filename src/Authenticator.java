import java.util.ArrayList;
public class Authenticator {
  public static boolean isValid(String username, String password) {
    if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
      return false;
    }
    ArrayList<Customer> customers = FileHandle.readCustomers();
    for (Customer customer : customers)
      if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
        return true;
      }
    return true;
  }
}