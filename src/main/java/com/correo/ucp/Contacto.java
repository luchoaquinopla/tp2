package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

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
    
}
