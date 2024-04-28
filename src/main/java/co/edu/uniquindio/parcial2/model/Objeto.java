package co.edu.uniquindio.parcial2.model;

public class Objeto {

    private String codigo;
    private String nombre;
    private Prestamo prestamoAsociado;

    private Estado estado;

    public enum Estado {
        DISPONIBLE,
        NODISPONIBLE
    }

    public Objeto(String codigo, String nombre, Prestamo prestamoAsociado, Estado estado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
        this.estado = estado;
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

}
