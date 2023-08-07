import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class customerController {
  public Label customerLabel;
  private Customer loggedInCustomer;
  @FXML
  public TextField balance;
  @FXML
  public TextField username;
  @FXML
  Button logOutButton;
  @FXML
  void logOutButton(ActionEvent event) throws IOException {
    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLogin.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Session.getInstance().cleanUserSession();
    Stage stage = (Stage) logOutButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(false);
    stage.show();
  }
  public void setLoggedInCustomer(Customer customer) {
    loggedInCustomer = customer;
    updateUI();
  }
  private void updateUI() {
    balance.setText(String.valueOf(loggedInCustomer.getBalance()));
    username.setText(loggedInCustomer.getUsername());
    customerLabel.setText("Welcome!, " + loggedInCustomer.getUsername());
  }
}