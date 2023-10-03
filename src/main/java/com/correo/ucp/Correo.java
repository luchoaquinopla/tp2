package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {
    private String asunto;
    private String contenido;
    private Buzon remitente;
    private List<Buzon> para = new ArrayList<>();
    
    public Correo(String asunto, String contenido,Buzon remitente, Buzon paraUnico ){
      this.asunto = asunto; 
      this.contenido = contenido;
      this.remitente = remitente;
      this.para.add(paraUnico);

    }
    public Correo(String asunto, String contenido,Buzon remitente, List<Buzon>paraVarios){
      this.asunto = asunto; 
      this.contenido = contenido;
      this.remitente = remitente;
      this.para = paraVarios;

    }
    public Correo(){

    }
       public String getAsunto() {
          return asunto;
      }
  
      public String getContenido() {
          return contenido;
      }
      public Buzon getRemitente() {
        return remitente;
    }
     
      public void setAsunto(String nuevoAsunto){
        this.asunto = nuevoAsunto;
      }
        public void setContenido(String nuevoContenido){
          this.contenido = nuevoContenido;
      }
        public void setRemitente(Buzon nuevoRemitente) {
        this.remitente = nuevoRemitente;
    }
    public List<Buzon> getPara() {
      return para;
  }
   
    }

