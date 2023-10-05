package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class FiltroAsuntoRemitente {
        public List<Correo> filtrarPorAsuntoRemitente(Buzon buzon, String asunto, String remitente) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> correosFiltrados = new ArrayList<>();

        for (Correo correo : bandejaEntrada) {
            if (correo.getAsunto().contains(asunto) && correo.getRemitente().contains(remitente)) {
                correosFiltrados.add(correo);
            }
        }

        return correosFiltrados;
    }
}
