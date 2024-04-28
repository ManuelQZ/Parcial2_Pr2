package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;

public class PrestamoUq {

    private String nombre;

    private ArrayList<Cliente> listaClientes;

    private ArrayList<Empleado> listaEmpleados;

    private ArrayList<Objeto> listaObjetos;

    private ArrayList<Prestamo> listaPrestamos;

    public PrestamoUq() {
        this.nombre = "Universidad del Quindio";
        this.listaClientes = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaObjetos = new ArrayList<>();
    }

    public void crearCliente(){

    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public String getNombre() {
        return nombre;
    }


}