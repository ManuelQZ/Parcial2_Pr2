package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PrestamosClienteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tbNombreDeuda;

    @FXML
    private TextField txtDesde;

    @FXML
    private TextField txtHasta;

    @FXML
    void searchBuscar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tbNombreDeuda != null : "fx:id=\"tbNombreDeuda\" was not injected: check your FXML file 'prestamosCliente.fxml'.";
        assert txtDesde != null : "fx:id=\"txtDesde\" was not injected: check your FXML file 'prestamosCliente.fxml'.";
        assert txtHasta != null : "fx:id=\"txtHasta\" was not injected: check your FXML file 'prestamosCliente.fxml'.";

    }

}

