package co.edu.uniquindio.parcial2.patrones.adapter.model;

import co.edu.uniquindio.parcial2.patrones.adapter.services.LibraryAuthentication;

public class BasicLibraryAuthentication implements LibraryAuthentication {
@Override
    public boolean authenticate(String username, String password) {
    // Lógica de autenticación básica
    return true; // Simplemente para el ejemplo
    }
}
