package co.edu.uniquindio.parcial2.model;

public class Objeto {

    private String codigo;
    private String nombre;
    private Prestamo prestamoAsociado;

    private Estado estado;
    private int  contadorPrestamo;


    public enum Estado {
        DISPONIBLE,
        NODISPONIBLE
    }

    public Objeto(String codigo, String nombre, Prestamo prestamoAsociado, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
        this.estado = estado;
        this.contadorPrestamo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado.toString();
    }

    public int getContadorPrestamo() {
        return contadorPrestamo;
    }

    public void sumarPrestamo() {
        this.contadorPrestamo += 1;
    }
}
