import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;

import com.correo.ucp.Correo;
import com.correo.ucp.SendCorreo;

public class SendCorreoTest {
   
   
    @Test
    public void testCrearBuzon1() {
        SendCorreo cartero = new  SendCorreo();
        Buzon buzon = new Buzon("correo@example.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("correo1@example.com", new ArrayList<>(), new ArrayList<>());
    
        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "correo@example.com","correo1@example.com");
        Correo correo2 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo1@example.com");
        Correo correo3 = new Correo("Asunto 1", "Contenido 1", "correo@example.com", "correo@example.com");
    
        cartero.agregarbuzones(buzon);
        cartero.agregarbuzones(buzon2);   
        cartero.enviarCorreo(correo1);
        cartero.enviarCorreo(correo2);
        cartero.enviarCorreo(correo3);
    

        assertEquals(3, buzon.getBandejaEnviados().size());
        assertEquals(2, buzon2.getBandejaEntrada().size());
        
        
    }
     @Test
    public void testConstructorSendCorreo() {
      
        Buzon buzon1 = new Buzon("usuario1@gmail.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("usuario2@gmail.com", new ArrayList<>(), new ArrayList<>());
        Correo correo = new Correo("Asunto", "Contenido", "remitente@gmail.com", "destinatario@gmail.com");
        
      
        SendCorreo sendCorreo = new SendCorreo(List.of(buzon1, buzon2), correo);
        
        
        assertNotNull(sendCorreo.getPara());
        assertEquals(2, sendCorreo.getPara().size());
        
       
        assertNotNull(sendCorreo.getEmail());
        assertEquals("Asunto", sendCorreo.getEmail().getAsunto());
        assertEquals("Contenido", sendCorreo.getEmail().getContenido());
        assertEquals("remitente@gmail.com", sendCorreo.getEmail().getRemitente());
        assertEquals("destinatario@gmail.com", sendCorreo.getEmail().getPara().get(0));
    }
    @Test 
    public void testSetpara(){
        Buzon buzon1 = new Buzon("usuario1@example.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("usuario2@example.com", new ArrayList<>(), new ArrayList<>());
        Correo correo = new Correo("Asunto", "Contenido", "remitente@example.com", "destinatario@example.com");
       SendCorreo sendCorreo = new SendCorreo(List.of(buzon1, buzon2), correo);
       Buzon buzon3 = new Buzon("usuario3@example.com", new ArrayList<>(), new ArrayList<>());
       Buzon buzon4 = new Buzon("usuario4@example.com", new ArrayList<>(), new ArrayList<>());
       List<Buzon> nuevaListaBuzones = List.of(buzon3, buzon4);

    
       sendCorreo.setPara(nuevaListaBuzones);

      
       assertNotNull(sendCorreo.getPara());
       assertEquals(2, sendCorreo.getPara().size()); 
       assertEquals(buzon3, sendCorreo.getPara().get(0));
       assertEquals(buzon4, sendCorreo.getPara().get(1));
    }
  
}