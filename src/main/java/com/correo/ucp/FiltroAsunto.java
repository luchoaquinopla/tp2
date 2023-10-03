package com.correo.ucp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsunto {
      public List<Correo> filtrarPorAsunto(Buzon buzon, String asunto) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        
        // Filtrar los correos por asunto
        List<Correo> correosFiltrados = bandejaEntrada.stream().filter(correo -> correo.getAsunto().equals(asunto)).collect(Collectors.toList());

        return correosFiltrados;
    }
}
