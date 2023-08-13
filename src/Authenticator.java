import java.util.ArrayList;
public class Authenticator {
  public static boolean isValidUser(String username, String password) {
    if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
      return false;
    }
    Customer customer = getCustomerByUsername(username);
    assert customer != null;
    return true;
  }
  public static boolean isValidNewUser(String username, String password) {
    return username != null && password != null && !username.isEmpty() && !password.isEmpty();
  }
  public static Customer getCustomerByUsername(String username) {
    ArrayList<Customer> customers = FileHandle.readCustomers();
    try {
      for (Customer customer : customers)
        if (customer.getUsername().equals(username))
          return customer;
    } catch (NullPointerException e) {
        System.out.println("No User");
    }
    return null;
  }
}