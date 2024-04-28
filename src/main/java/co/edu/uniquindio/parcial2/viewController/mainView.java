package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class mainView {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;

    @FXML
    void initialize() {
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'main.fxml'.";

    }

}