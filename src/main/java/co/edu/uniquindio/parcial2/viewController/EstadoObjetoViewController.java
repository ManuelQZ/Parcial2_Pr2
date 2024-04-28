package co.edu.uniquindio.parcial2.viewController;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EstadoObjetoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> columNombre;

    @FXML
    private TableColumn<?, ?> columCodigo;

    @FXML
    private TableView<?> tableEstadoObjeto;

    @FXML
    private TableColumn<?, ?> columEstado;

    @FXML
    void filtrarObjeto(ActionEvent event) {

    }

    @FXML
    void objetoDisponible(ActionEvent event) {

    }

    @FXML
    void objetoNoDisponible(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert columNombre != null : "fx:id=\"columNombre\" was not injected: check your FXML file 'estadoObjetos.fxml'.";
        assert columCodigo != null : "fx:id=\"columCodigo\" was not injected: check your FXML file 'estadoObjetos.fxml'.";
        assert tableEstadoObjeto != null : "fx:id=\"tableEstadoObjeto\" was not injected: check your FXML file 'estadoObjetos.fxml'.";
        assert columEstado != null : "fx:id=\"columEstado\" was not injected: check your FXML file 'estadoObjetos.fxml'.";

    }
}
