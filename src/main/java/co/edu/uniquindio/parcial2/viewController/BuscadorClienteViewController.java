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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BuscadorClienteViewController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btBuscar;

        @FXML
        private TableColumn<Objeto, String> columnCodigo;

        @FXML
        private TableColumn<Objeto, String> columnEstado;

        @FXML
        private TableColumn<Objeto, String> columnNombre;

        @FXML
        private TableView<Objeto> tbBuscar;

        @FXML
        private TextField txtBuscar;

        // Se Inicia la clase
        ObservableList<Objeto> listaObservableObjeto = FXCollections.observableArrayList();
        ModelFactory factory = ModelFactory.getInstance();
        @FXML
        void searchBuscar(ActionEvent event) {
                listaObservableObjeto.clear();
                String codigo = txtBuscar.getText();
                ArrayList<Objeto> listaObjetos = factory.getPrestamoUq().getListaObjetos();

                for (Objeto objeto: listaObjetos) {
                        if (codigo.equals(objeto.getCodigo())) {
                                listaObservableObjeto.add(objeto);
                        }
                }
        }

        @FXML
        void initialize() {
                initDataBinding();
                tbBuscar.getItems().clear();
                tbBuscar.setItems(listaObservableObjeto);
        }

        public void initDataBinding() {
                columnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
                columnCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigo()));
                columnEstado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEstado()));
        }



}