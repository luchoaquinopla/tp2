package com.correo.ucp;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroRemitente {
            public List<Correo> filtrarPorRemitente(Buzon buzon, String remitente) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        
        // Filtrar los correos por asunto
        List<Correo> correosFiltrados = bandejaEntrada.stream().filter(correo -> correo.getRemitente().equals(remitente)).collect(Collectors.toList());

        return correosFiltrados;
    }
}
