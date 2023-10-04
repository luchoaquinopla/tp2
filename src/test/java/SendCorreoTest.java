import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
        cartero.agregarbuzones(buzon2);   // Add buzon to the cartero's list of buzones
        cartero.enviarEmail(correo1);
        cartero.enviarEmail(correo2);
        cartero.enviarEmail(correo3);
    

        assertEquals(3, buzon.getBandejaEnviados().size());
        assertEquals(2, buzon2.getBandejaEntrada().size());
        assertEquals(1, buzon.getBandejaEntrada().size());
    }
}