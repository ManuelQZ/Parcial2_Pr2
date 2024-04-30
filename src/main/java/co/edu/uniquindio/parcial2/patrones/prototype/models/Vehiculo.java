class Vehiculo implements Cloneable {
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Método para clonar el vehículo
    @Override
    public Vehiculo clone() throws CloneNotSupportedException {
        return (Vehiculo) super.clone();
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Color: " + color);
    }
}