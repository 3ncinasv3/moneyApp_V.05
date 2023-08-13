import java.io.*;
import java.util.ArrayList;
public class FileHandle {
  private static final String fileName = "user_data.txt";
  public static void appendUserToFile(Customer customer) {

    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
      writer.println(customer.getUsername() + "," + customer.getPassword() + "," + customer.getBalance() + "," + customer.getAccountNumber());
    } catch (Exception e) {
      System.out.println("Try again");
    }
  }
  public static ArrayList<Customer> readCustomers() {
    ArrayList<Customer> customers = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if(line.trim().isEmpty()) {
          continue;
        }
        String[] data = line.split(",");
        String username = data[0].trim();
        String password = data[1].trim();
        double balance = Double.parseDouble(data[2]);
        String accountNumber = data[3].trim();
        customers.add(new Customer(username, password, balance, accountNumber));
      }
    } catch (IOException e) {
      System.out.println("Error with IO");
    }
    return customers;
  }
  public static void writeCustomersToFile(ArrayList<Customer> customers) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
      for (Customer customer : customers) {
        writer.println(customer.getUsername() + "," + customer.getPassword() + "," + customer.getBalance() + "," + customer.getAccountNumber());
      }
    } catch (Exception e) {
      System.out.println("Error writing to file.");
    }
  }
}

