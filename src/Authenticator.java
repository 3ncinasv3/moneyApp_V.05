import java.util.ArrayList;
public class Authenticator {
    public static boolean isValid(String username, String password) {
      ArrayList<Customer> customers = FileHandle.readCustomers();

      boolean isValid = false;

      for (Customer customer : customers)
        if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
          isValid = true;
          break;
        }
      return isValid;
        }
    }
