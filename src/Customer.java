public class Customer extends User {
  public Customer() {
    super();
  }
  public Customer(String username, String password){
    this.username = username;
    this.password = password;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public String getAccountNumber() {
    return this.accountNumber;
  }
  public static boolean isCustomer(String username, String password) {
    return false;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
