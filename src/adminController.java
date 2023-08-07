import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
public class adminController {
  @FXML
  public TextField usernameField;
  @FXML
  public TextField accountNumberField;
  @FXML
  public TextField balanceField;
  @FXML
  public Button updateBalanceButton;
  @FXML
  private Button logOutButton;
  @FXML
  void logOutButton(ActionEvent event) throws IOException {
    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLogin.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Stage stage = (Stage) logOutButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(false);
    stage.show();
  }
  @FXML
  void updateBalance(ActionEvent event) throws IOException {
    String username = usernameField.getText();
    String accountNumber = accountNumberField.getText();
    double newBalance = Double.parseDouble(balanceField.getText());
    Session.updateCustomerBalance(username, accountNumber, newBalance);
    System.out.println("Balance updated");
  }
}