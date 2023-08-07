public class Admin extends User {
  public static boolean isAdminUser(String username, String password) {
    String storedUsername = "Jimmy";
    String storedPassword = "Password";
    return storedUsername.equals(username) && storedPassword.equals(password);
  }
  private static void changeCustomerBalance() {

  }
}
