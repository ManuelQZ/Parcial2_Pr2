

public class EstacionMeteorologica {
    private double temperatura;
    private double humedad;
    private double presion;
    private ArrayList<Observador> observadores;

    public EstacionMeteorologica() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(temperatura, humedad, presion);
        }
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
        notificarObservadores();
    }

    public void setPresion(double presion) {
        this.presion = presion;
        notificarObservadores();
    }
}