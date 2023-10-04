package com.correo.ucp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContenido {
         public List<Correo> filtrarPorContenido(Buzon buzon, String contenido) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        
        // Filtrar los correos por asunto
        List<Correo> correosFiltrados = bandejaEntrada.stream().filter(correo -> correo.getContenido().contains(contenido)).collect(Collectors.toList());

        return correosFiltrados;
    }
}
