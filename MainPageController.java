import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button enterButton;

    @FXML
    private Label loginLabel;

    @FXML
    private TextField passwordEntry;

    @FXML
    private TextField usernameEntry;

    @FXML
    void launchCashierView(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources\\fxml/casherview.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = new Stage();
        stage.setTitle("Cashier View");
        stage.setScene(scene);
        stage.show();
    }

}
