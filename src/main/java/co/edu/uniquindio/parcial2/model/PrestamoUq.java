package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;

public class PrestamoUq {

    private String nombre;
    
    ArrayList<Cliente> listaClientes;

    ArrayList<Empleado> listaEmpleados;

    ArrayList<Objeto> listaObjetos;

    ArrayList<Prestamo> listaPrestamos;

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
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