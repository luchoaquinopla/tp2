
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
    
    
    public Correo getEmail() {
        return email;
    }

    public void setPara(List<Buzon> para) {
        this.buzones = para;
    }

    public void enviarEmail(Correo email) {
        // Obtener el remitente del correo
        String remitenteEmail = email.getRemitente();

        // Buscar el remitente en los buzones
        Optional<Buzon> buzonRemitente = buzones.stream().filter(buzon -> buzon.getCorreoInterno().equals(remitenteEmail)).findFirst();

        // Si se encuentra el buzon del remitente, agregar el correo a la bandeja de salida del remitente
        buzonRemitente.ifPresent(remitente -> remitente.getBandejaEnviados().add(email));

        // Obtener los destinatarios del correo como direcciones de correo electrónico
        List<String> destinatarios = email.getPara();

        // Para cada destinatario, encontrar el Buzon correspondiente y agregar el correo a su bandeja de entrada
        for (String destinatarioEmail : destinatarios) {
            Optional<Buzon> buzonDestinatario = buzones.stream().filter(buzon -> buzon.getCorreoInterno().equals(destinatarioEmail)).findFirst();
            
            // Si se encuentra el buzon del destinatario, agregar el correo a su bandeja de entrada
            buzonDestinatario.ifPresent(destinatario -> destinatario.getBandejaEntrada().add(email));
        }
    }
}

        
