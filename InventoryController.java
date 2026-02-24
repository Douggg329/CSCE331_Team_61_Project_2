import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InventoryController {

    @FXML
    void returnHome(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagerView.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            stage.setTitle("Main Manager View");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
