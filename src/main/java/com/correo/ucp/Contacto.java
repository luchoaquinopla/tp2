package com.correo.ucp;

public class Contacto {
    private String nombre;
    private String correo;

    public Contacto(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;

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
