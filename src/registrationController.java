import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
public class registrationController {
  @FXML
  public TextField firstNameField;
  @FXML
  public TextField lastNameField;
  @FXML
  private Button logOutButton;
  @FXML
  private Button regButton;
  @FXML
  private PasswordField passWordField;
  @FXML
  private TextField userNameField;
  @FXML
  void logOutButton() throws IOException {
    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLogin.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Stage stage = (Stage) logOutButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(false);
    stage.show();
  }
  @FXML
  void setRegButton() throws IOException {
    String username = userNameField.getText();
    String password = passWordField.getText();
    Customer newCustomer = new Customer(username, password);
    FileHandle.appendUserToFile(newCustomer);

    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLogin.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Stage stage = (Stage) regButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(false);
    stage.show();
  }
}


