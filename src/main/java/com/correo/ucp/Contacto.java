package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Contacto {
    private String nombre;
    private String correo;
    public List<Correo> bandejaEntrada = new ArrayList<>();
 public List<Correo> bandejaEnviados = new ArrayList<>();
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
public List<Correo> getBandejaEntrada() {
    return bandejaEntrada;
}

public List<Correo> getBandejaEnviados() {
    return bandejaEnviados;
}
public void agregarCorreoARecibidos(Correo correo) {
    bandejaEntrada.add(correo);
}

public void agregarCorreoAEnviados(Correo correo) {
    bandejaEnviados.add(correo);
}
    
}
