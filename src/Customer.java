public class Customer extends User {
  private double balance;
  private String username;
  private String password;
  private String accountNumber;
  public Customer(String username, String password){
    this.username = username;
    this.password = password;
    this.balance = 0.0;
    this.accountNumber = AccountNumberGenerator.generateAccountNumber();
  }
  public Customer(String username, String password, double balance, String accountNumber) {
    this.username = username;
    this.password = password;
    this.balance = balance;
    this.accountNumber = accountNumber;
  }
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public double getBalance() {
    return balance;
  }
  public String getAccountNumber() { return accountNumber; }
  public void setBalance(double balance) {
    this.balance = balance;
  }
  public void setUsername(String username) { this.username = username; }
  public void setPassword(String password) { this.password = password; }


}
