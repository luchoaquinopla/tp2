package com.correo.ucp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FiltroAsuntoContenido {
 public List<Correo> filtrarPorAsuntoYContenido(Buzon buzon, String asunto, String contenido) {
    List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
    List<Correo> bandejaEnviados = buzon.getBandejaEnviados();

    List<Correo> correosFiltrados = new ArrayList<>();

    List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getContenido().contains(contenido) && correo.getAsunto().contains(asunto)).collect(Collectors.toList());

    List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getContenido().contains(contenido) && correo.getAsunto().contains(asunto)).collect(Collectors.toList());

    correosFiltrados.addAll(correosFiltradosEntrada);
    correosFiltrados.addAll(correosFiltradosEnviados);

    return correosFiltrados;
}
}

