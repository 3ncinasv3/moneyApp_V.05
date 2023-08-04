import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class mainLogin {
  @FXML
  private Label outputLabel;
  @FXML
  private PasswordField passWordText;
  @FXML
  private TextField userNameText;
  @FXML
  private Button loginButton;
  @FXML
  private Button registerButton;
  @FXML
  void loginButton(ActionEvent event) throws IOException {
    String enteredUsername = userNameText.getText();
    String enteredPassword = passWordText.getText();

    if (Admin.isAdminUser(enteredUsername, enteredPassword)) {
      Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("adminPane.fxml")));
      Scene secondScene = new Scene(secondRoot);
      Stage stage = (Stage) loginButton.getScene().getWindow();
      stage.setScene(secondScene);
      stage.setResizable(true);
      stage.show();
    }

    if (Authenticator.isValid(enteredUsername, enteredPassword)) {
      Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("customerPane.fxml")));
      Scene secondScene = new Scene(secondRoot);
      Stage stage = (Stage) loginButton.getScene().getWindow();
      stage.setScene(secondScene);
      stage.setResizable(true);
      stage.show();
    }
  }
  @FXML
  void registerButton(ActionEvent event) throws IOException {
    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("registrationPane.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Stage stage = (Stage) registerButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(true);
    stage.show();
  }
}
