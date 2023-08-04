import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class customerController {
  @FXML
  Button logOutButton;
  @FXML
  void logOutButton(ActionEvent event) throws IOException {
    Parent secondRoot = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mainLogin.fxml")));
    Scene secondScene = new Scene(secondRoot);
    Stage stage = (Stage) logOutButton.getScene().getWindow();
    stage.setScene(secondScene);
    stage.setResizable(false);
    stage.show();
  }
}