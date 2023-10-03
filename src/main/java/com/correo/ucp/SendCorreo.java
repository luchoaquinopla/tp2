
 package com.correo.ucp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SendCorreo {

    private List<Buzon> buzones = new ArrayList<>();
    private Correo email;
 
    public SendCorreo(){
    }

    public SendCorreo(List<Buzon> buzones, Correo email) {
        this.buzones = new ArrayList<>(buzones);
        this.email = email;
    }

    public void agregarbuzones(Buzon usuario){
        buzones.add(usuario);
    }

    public List<Buzon> getPara() {
        return buzones;
    }
    public void getCorreo(){

    }
    
    public Correo getEmail() {
        return email;
    }

    public void setPara(List<Buzon> para) {
        this.buzones = para;
    }

    public void enviarEmail(Correo email) {
        Buzon remitente = email.getRemitente();
        
        Optional<Buzon> buzonDestinatario = buzones.stream().filter(buzon -> buzon.getCorreoInterno().equals(remitente.getCorreoInterno())).findFirst();
    
        // If recipient buzon is found, add the email to its bandejaSalida
        buzonDestinatario.ifPresent(destinatario -> destinatario.getBandejaEnviados().add(email));
        email.getPara().forEach(b -> b.getBandejaEntrada().add(email)); // Agrega el correo a la bandeja de entrada de los demás buzones
    }
}

        
