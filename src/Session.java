import java.util.ArrayList;
public class Session {
  private static Session instance;
  private final Customer customer;
  private Session(Customer customer) {
    this.customer = customer;
  }
  private static Customer customerSession(String username, String password) {
    ArrayList<Customer> customers = FileHandle.readCustomers();
    for (Customer value : customers) {
      if (value.getUsername().equals(username) && value.getPassword().equals(password)) {
        return value;
      }
    }
    return null;
  }
  public static Session getInstance(String username, String password) {
    if (instance == null) {
      instance = new Session(customerSession(username, password));
    }
    return instance;
  }
  public Customer getCustomer() {
    return this.customer;
  }
  public void cleanUserSession() {
    instance = null;
  }
  public static Session getInstance() {
    return instance;
  }
  public static void updateCustomerBalance(String username, String accountNumber, double newBalance) {
    ArrayList<Customer> customers = FileHandle.readCustomers();
    for (Customer customer : customers) {
      if (customer.getUsername().equals(username) && customer.getAccountNumber().equals(accountNumber)) {
        customer.setBalance(newBalance);
        FileHandle.writeCustomersToFile(customers); // Write updated customer data to file
        break;
        }
      }
  }
  public static void transferCustomerBalance(String username, String accountNumber, double transferBalance, String user, String userAcc) {
    ArrayList<Customer> customers = FileHandle.readCustomers();
    for (Customer customer : customers) {
      if (customer.getUsername().equals(username) && customer.getAccountNumber().equals(accountNumber)) {
        double newBalance = customer.getBalance() + transferBalance;
        customer.setBalance(newBalance);
        FileHandle.writeCustomersToFile(customers);
      }
      else if (customer.getUsername().equals(user) && customer.getAccountNumber().equals(userAcc)){
        double bal = customer.getBalance() - transferBalance;
        customer.setBalance(bal);
        FileHandle.writeCustomersToFile(customers);
      }
    }
  }
}
