package com.correo.ucp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsunto {
    public List<Correo> filtrarPorAsunto(Buzon buzon, String asunto) {
        List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
        List<Correo> bandejaEnviados = buzon.getBandejaEnviados();

        
        List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        
        List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getAsunto().contains(asunto)).collect(Collectors.toList());

        List<Correo> correosFiltrados = new ArrayList<>();
        correosFiltrados.addAll(correosFiltradosEntrada);
        correosFiltrados.addAll(correosFiltradosEnviados);

        return correosFiltrados;
    }
}
