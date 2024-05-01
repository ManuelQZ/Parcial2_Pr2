package co.edu.uniquindio.parcial2.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.model.Prestamo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ConsultarPrestamoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btBuscar;

    @FXML
    private TableColumn<Prestamo, String> columnFechaInicial;
    @FXML
    private TableColumn<Prestamo, String> columnFechaFinal;
    @FXML
    private TableColumn<Prestamo, String> columnNombre;

    @FXML
    private TableView<Prestamo> tbNombreDeuda;

    @FXML
    private TextField txtDesde;

    @FXML
    private TextField txtHasta;
    ObservableList<Prestamo> listaObservablePrestamo = FXCollections.observableArrayList();
    ModelFactory factory = ModelFactory.getInstance();
    @FXML
    void searchBuscar(ActionEvent event) {
        listaObservablePrestamo.clear();
        boolean continuar = false;
        int[] fecha = new int[2];

        try {
            fecha[0] = Integer.parseInt(txtDesde.getText());
            fecha[1] = Integer.parseInt(txtHasta.getText());
            continuar = true;

        } catch (Exception e) {
            // Crear una alerta de advertencia
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setHeaderText(e.getMessage());
            alerta.setContentText("Ingrese valores validos");
            alerta.showAndWait();

            txtDesde.clear();
            txtHasta.clear();
        }
        ArrayList<Prestamo> listaPrestamo = factory.getPrestamoUq().getListaPrestamos();
        if (continuar) {
            for (Prestamo prestamo: listaPrestamo) {
                int deudaAlmacenada =  Integer.parseInt(prestamo.getDeuda());
                if (deudaAlmacenada >= fecha[0] && deudaAlmacenada <= fecha[1]) {
                    listaObservablePrestamo.add(prestamo);
                }
            }
        }
    }

    @FXML
    void initialize() {
        initDataBinding();
        tbNombreDeuda.getItems().clear();
        tbNombreDeuda.setItems(listaObservablePrestamo);
    }

    public void initDataBinding() {
        columnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClienteAsociado().getNombre()));
        columnFechaInicial.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaPrestamo()));
        columnFechaFinal.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFechaEntrega()));
    }
}
