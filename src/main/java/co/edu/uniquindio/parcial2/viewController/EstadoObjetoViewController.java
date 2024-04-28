package co.edu.uniquindio.parcial2.viewController;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.model.Objeto;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EstadoObjetoViewController {

    ObservableList<Objeto> listaObservableObjeto;
    ModelFactory factory = ModelFactory.getInstance();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Objeto, String> columNombre;

    @FXML
    private TableColumn<Objeto, String> columCodigo;

    @FXML
    private TableView<Objeto> tableEstadoObjeto;

    @FXML
    private TableColumn<?, String> columEstado;

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


    }

    void dataBuilding() {
        listaObservableObjeto.addAll(factory.getPrestamoUq().getListaObjetos());
    }
}
