package co.edu.uniquindio.parcial2.patrones.command;

public class App {
    public static void App(String[] args) {
        // Crear instancia del receptor
        Receptor receptor = new Receptor();

        // Crear comandos concretos
        Command entregaLocalCommand = new EntregaLocalCommand(receptor);
        Command entregaNacionalCommand = new EntregaNacionalCommand(receptor);
        Command entregaInternacionalCommand = new EntregaInternacionalCommand(receptor);

        // Crear instancia del invocador
        Invocador invocador = new Invocador();

        // Ejecutar comandos
        invocador.ejecutarComando(entregaLocalCommand);
        invocador.ejecutarComando(entregaNacionalCommand);
        invocador.ejecutarComando(entregaInternacionalCommand);
    }
}
