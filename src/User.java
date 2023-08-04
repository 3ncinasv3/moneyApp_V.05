public class User {
  protected String accountNumber;
  protected String firstname;
  protected String lastname;

  protected String username;
  protected String password;
  @Override
  public String toString() {
    return lastname + " " + firstname + " " + username + " " + password;
  }

}
