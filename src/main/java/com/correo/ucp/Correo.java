package com.correo.ucp;

public class Correo {
    

    private String asunto;
    private String contenido;
  
    
    public Correo(String asunto, String contenido ){
      this.asunto = asunto; 
      this.contenido = contenido;
    
    }
       public String getAsunto() {
          return asunto;
      }
  
      public String getContenido() {
          return contenido;
      }
  
  
    }

