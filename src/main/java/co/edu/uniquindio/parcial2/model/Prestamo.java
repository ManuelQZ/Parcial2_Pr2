package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {

    private String numeroPrestamo;
    private int deuda;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private String descripcion;

    private Cliente clienteAsociado;

    private Empleado empleadoAsociado;
    private ArrayList<Objeto> listaObjetosAsociados;

    public Prestamo(String numeroPrestamo, int deuda, Date fechaPrestamo, Date fechaEntrega, String descripcion, Cliente clienteAsociado, Empleado empleadoAsociado) {
        this.numeroPrestamo = numeroPrestamo;
        this.deuda = deuda;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.empleadoAsociado = empleadoAsociado;
        this.listaObjetosAsociados = new ArrayList<>();
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public String getDeuda() {
        return "" + deuda;
    }
}
