package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Buzon {
    private String correo;
    public List<Correo> bandejaEntrada = new ArrayList<>();
    public List<Correo> bandejaEnviados = new ArrayList<>();
    public Buzon(){

    }
    public Buzon(String correo, List<Correo> bandejaEntrada, List<Correo> bandejaEnviados){
        this.correo = correo;
        this.bandejaEntrada = bandejaEntrada; 
        this.bandejaEnviados = bandejaEnviados;

    }

 
 public List<Correo> getBandejaEntrada() {
    return bandejaEntrada;
}

public List<Correo> getBandejaEnviados() {
    return bandejaEnviados;
}


}
