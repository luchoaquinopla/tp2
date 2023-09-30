package com.correo.ucp;

public class Correo {
    private String asunto;
    private String contenido;
    private Contacto remitente;
    
    public Correo(String asunto, String contenido,Contacto remitente ){
      this.asunto = asunto; 
      this.contenido = contenido;
      this.remitente = remitente;

    }
    public Correo(){

    }
       public String getAsunto() {
          return asunto;
      }
  
      public String getContenido() {
          return contenido;
      }
      public Contacto getRemitente() {
        return remitente;
    }
     
      public void setAsunto(String nuevoAsunto){
        this.asunto = nuevoAsunto;
      }
        public void setContenido(String nuevoContenido){
          this.contenido = nuevoContenido;
      }
        public void setRemitente(Contacto nuevoRemitente) {
        this.remitente = nuevoRemitente;
    }
 
   
    }

