package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Correo {
    

    private String asunto;
    private String contenido;
    private Contacto remitente;
    private List<Contacto> para = new ArrayList<>();
  
    
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
    public List<Contacto> getPara() {
      return para;
  }
  public void agregar(Contacto destinatario){
    para.add(destinatario);
    

  }
  
    }

