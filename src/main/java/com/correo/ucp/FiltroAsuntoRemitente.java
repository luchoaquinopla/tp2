package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroAsuntoRemitente {
 public List<Correo> filtrarPorAsuntoYRemitente(Buzon buzon, String asunto, String remitente) {
    List<Correo> bandejaEntrada = buzon.getBandejaEntrada();
    List<Correo> bandejaEnviados = buzon.getBandejaEnviados();

    List<Correo> correosFiltrados = new ArrayList<>();

    List<Correo> correosFiltradosEntrada = bandejaEntrada.stream().filter(correo -> correo.getAsunto().contains(asunto) && correo.getRemitente().contains(remitente)).collect(Collectors.toList());

    List<Correo> correosFiltradosEnviados = bandejaEnviados.stream().filter(correo -> correo.getAsunto().contains(asunto) && correo.getRemitente().contains(remitente)).collect(Collectors.toList());

    correosFiltrados.addAll(correosFiltradosEntrada);
    correosFiltrados.addAll(correosFiltradosEnviados);

    return correosFiltrados;
}
}
