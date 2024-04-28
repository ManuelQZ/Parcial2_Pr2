package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.model.Objeto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class EstadoObjetoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Objeto, String> columCodigo;

    @FXML
    private TableColumn<Objeto, String> columEstado;

    @FXML
    private TableColumn<Objeto, String> columNombre;

    @FXML
    private ToggleGroup estado;

    @FXML
    private TableView<Objeto> tableEstadoObjeto;

    // Se Inicia la clase
    ObservableList<Objeto> listaObservableObjeto = FXCollections.observableArrayList();
    ModelFactory factory = ModelFactory.getInstance();

    void addObjetos(String estado) {
        listaObservableObjeto.clear();
        ArrayList<Objeto> listaObjetos = factory.getPrestamoUq().getListaObjetos();

        for (Objeto objeto: listaObjetos) {
            if (estado.equals(objeto.getEstado())) {
                listaObservableObjeto.add(objeto);
            }
        }
    }
    @FXML
    void objetoDisponible(ActionEvent event) {
        addObjetos("DISPONIBLE");
    }

    @FXML
    void objetoNoDisponible(ActionEvent event) {
        addObjetos("NODISPONIBLE");

    }

    @FXML
    void initialize() {
        initDataBinding();
        tableEstadoObjeto.getItems().clear();
        tableEstadoObjeto.setItems(listaObservableObjeto);
    }

    public void initDataBinding() {
        columNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        columCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigo()));
        columEstado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado()));
    }

}
