package co.edu.uniquindio.parcial2.patrones.observer;

public class App {

    public static void App (String[] args) {
        // Crear instancia de la estación meteorológica
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        // Crear observadores
        Observador pantalla = new Pantalla();
        Observador dispositivoMovil = new DispositivoMovil();
        Observador estacionCentral = new EstacionCentral();

        // Registrar observadores
        estacion.agregarObservador(pantalla);
        estacion.agregarObservador(dispositivoMovil);
        estacion.agregarObservador(estacionCentral);

        // Simular actualizaciones del clima
        estacion.setTemperatura(25.5);
        estacion.setHumedad(60);
        estacion.setPresion(1013.25);
    }
}
