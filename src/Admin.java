public class Admin extends User {

  public void setUsername(String username) {
    this.username = username;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }
  public String getPassword() {
    return this.password;
  }
  public static boolean isAdminUser(String username, String password) {
    String storedUsername = "Jimmy";
    String storedPassword = "Password";
    return storedUsername.equals(username) && storedPassword.equals(password);
  }
}
