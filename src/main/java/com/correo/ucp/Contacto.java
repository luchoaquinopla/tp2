package com.correo.ucp;

public class Contacto {
    private String nombre;
    private String correo;

    public Contacto(String name, String correo) {
        this.nombre = name; 
        this.correo = correo;
        // Validar el correo electrónico antes de asignarlo
        if (validarEmail(correo)) {
            this.correo = correo;
        } else {
            // Si el correo no es válido, lanzar una excepción o asignar un valor por defecto
            // En este ejemplo, lanzamos una excepción IllegalArgumentException
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
    }
    
    // Método para validar el correo electrónico
    public boolean validarEmail(String correo) {
        // Verificar si contiene "@"
        if (correo.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
    public Contacto(){
        
    }

public String getNombre(){
    return nombre;
}
public String getCorreo(){
    return correo;
}
public void setNombre(String nuevoNombre) {
    this.nombre = nuevoNombre;
}

public void setCorreo(String nuevoCorreo) {
    this.correo = nuevoCorreo;
}

    
}
