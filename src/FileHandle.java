import java.io.*;
import java.util.ArrayList;
public class FileHandle {
  public static void appendUserToFile(Customer customer) {
    String fileName = "user_data.txt";

    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
      writer.println(customer.getUsername() + "," + customer.getPassword());
    } catch (Exception e) {
      System.out.println("Try again");
    }
  }
  public static ArrayList<Customer> readCustomers() {
    ArrayList<Customer> customers = new ArrayList<>();
    String fileName = "user_data.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] data = line.split(",");
        String username = data[0].trim();
        String password = data[1].trim();
        customers.add(new Customer(username, password));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return customers;
  }
}