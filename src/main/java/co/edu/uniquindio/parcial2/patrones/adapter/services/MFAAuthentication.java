package co.edu.uniquindio.parcial2.patrones.adapter.services;

public interface MFAAuthentication {
    boolean authenticateWithOTP(String username, String otp);
    boolean authenticateWithBiometrics(String username, byte[] biometricData);
    boolean authenticateWithDevice(String username, String deviceId);
    }
