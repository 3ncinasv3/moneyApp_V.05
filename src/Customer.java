public class Customer extends User {
  private double balance;
  public Customer(String username, String password){
    this.username = username;
    this.password = password;
    this.balance = 0.0;
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
  public void setBalance(double balance) {
    this.balance = balance;
  }
}
