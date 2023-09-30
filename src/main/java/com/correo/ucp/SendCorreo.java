package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class SendCorreo  {
        private List<Buzon> para = new ArrayList<>();
        private Buzon remitente;
        private Correo correo;

        public SendCorreo(List<Buzon> para, Buzon remitente, Correo correo){
            this.para = new ArrayList<>(para); 
             this.remitente = remitente;
            this.correo = correo;

        }
        
        public List<Buzon> getPara() {
            return para;
        }
          
          public void agregar(Buzon usuario){
            para.add(usuario);
          }

    public void enviar(SendCorreo cartero) {
        remitente.getBandejaEnviados().add(correo); 
        for (Buzon destinatario: para) {
            destinatario.getBandejaEntrada().add(correo); 
        }
    }
}
