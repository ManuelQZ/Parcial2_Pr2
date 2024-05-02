package co.edu.uniquindio.parcial2.patrones.adapter;

import co.edu.uniquindio.parcial2.patrones.adapter.model.AuthenticationAdapter;
import co.edu.uniquindio.parcial2.patrones.adapter.model.MFAAuthenticationImpl;
import co.edu.uniquindio.parcial2.patrones.adapter.services.LibraryAuthentication;
import co.edu.uniquindio.parcial2.patrones.adapter.services.MFAAuthentication;

public class App {

    public static void main(String[] args) {
        // Crear una instancia del sistema de autenticación MFA
        MFAAuthentication mfaAuthentication = new MFAAuthenticationImpl();

        // Crear una instancia del adaptador y pasarle la instancia del sistema de autenticación MFA
        LibraryAuthentication adapter = new AuthenticationAdapter(mfaAuthentication);

        // Probar la autenticación básica usando el adaptador
        boolean basicAuthenticationResult = adapter.authenticate("usuario", "contraseña");

        if (basicAuthenticationResult) {
            System.out.println("Autenticación básica exitosa");
        } else {
            System.out.println("Autenticación básica fallida");
        }
    }
}
