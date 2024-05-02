package co.edu.uniquindio.parcial2.patrones.adapter.model;

public class MFAAuthenticationImpl implements MFAAuthentication {
    @Override
    public boolean authenticateWithOTP(String username, String otp) {
    // Lógica de autenticación con OTP
    return true; // Simplemente para el ejemplo
    }
    
        @Override
        public boolean authenticateWithBiometrics(String username, byte[] biometricData) {
            // Lógica de autenticación con biometría
            return true; // Simplemente para el ejemplo
        }
    
        @Override
        public boolean authenticateWithDevice(String username, String deviceId) {
            // Lógica de autenticación con dispositivo
            return true; // Simplemente para el ejemplo
        }
    }
