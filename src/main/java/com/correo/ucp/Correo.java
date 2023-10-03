package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {
    private String asunto;
    private String contenido;
    private String remitente;
    private List<String > para = new ArrayList<>();
    
    public Correo(String asunto, String contenido,String remitente, String  paraUnico ){
      this.asunto = asunto; 
      this.contenido = contenido;
      this.remitente = remitente;
      this.para.add(paraUnico);

    }
    public Correo(String asunto, String contenido,String  remitente, List<String >paraVarios){
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
      public String  getRemitente() {
        return remitente;
    }
     
      public void setAsunto(String nuevoAsunto){
        this.asunto = nuevoAsunto;
      }
        public void setContenido(String nuevoContenido){
          this.contenido = nuevoContenido;
      }
        public void setRemitente(String  nuevoRemitente) {
        this.remitente = nuevoRemitente;
    }
    public List<String > getPara() {
      return para;
  }
   
    }

