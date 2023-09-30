package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Buzon {
public List<Correo> bandejaEntrada = new ArrayList<>();
 public List<Correo> bandejaEnviados = new ArrayList<>();
 
 public List<Correo> getBandejaEntrada() {
    return bandejaEntrada;
}

public List<Correo> getBandejaEnviados() {
    return bandejaEnviados;
}


}
