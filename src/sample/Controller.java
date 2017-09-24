package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {
    @FXML private Text actiontarget;

    @FXML protected void handleButtonAction(ActionEvent event) {
        actiontarget.setText("testtest");
    }
}
