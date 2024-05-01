package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.model.Cliente;
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
        private TableColumn<Cliente, String> columnNombre;

        @FXML
        private TableColumn<Cliente, String> columnEdad;

        @FXML
        private TableColumn<Cliente, String> columnCedula;

        @FXML
        private TableView<Cliente> tbBuscar;

        @FXML
        private TextField txtBuscar;

        // Se Inicia la clase
        ObservableList<Cliente> listaObservableCliente = FXCollections.observableArrayList();
        ModelFactory factory = ModelFactory.getInstance();
        @FXML
        void searchBuscar(ActionEvent event) {
                listaObservableCliente.clear();
                String cedula = txtBuscar.getText();
                ArrayList<Cliente> listaCliente = factory.getPrestamoUq().getListaObjetos();

                for (Cliente cliente: listaCliente) {
                        if (cedula.equals(cliente.getCedula())) {
                                listaObservableCliente.add(objeto);
                        }
                }
        }

        @FXML
        void initialize() {
                initDataBinding();
                tbBuscar.getItems().clear();
                tbBuscar.setItems(listaObservableCliente);
        }

        public void initDataBinding() {
                columnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
                columnEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
                columnCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        }



}