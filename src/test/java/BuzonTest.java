import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;

public class BuzonTest {
    @Test
    public void testGetBandejaEntrada() {
        
        Buzon buzon = new Buzon("asdasfqasd",new ArrayList<>(), new ArrayList<>());
        assertTrue(buzon.getBandejaEntrada().isEmpty());
    }

    @Test
    public void testGetBandejaEnviados() {
     
        Buzon buzon = new Buzon("asdasfqasd",new ArrayList<>(), new ArrayList<>());
        assertTrue(buzon.getBandejaEnviados().isEmpty());
    }
    @Test
    public void testAgregarElementos() {
      
    
        Buzon buzon = new Buzon("correo@example.com", new ArrayList <>(), new ArrayList<>());

        
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "remitente", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "remitente", new ArrayList<>());

        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);

        
        buzon.getBandejaEnviados().add(correo1);

      
        assertEquals(2, buzon.getBandejaEntrada().size()); 
        assertEquals(1, buzon.getBandejaEnviados().size()); 
        assertTrue(buzon.getBandejaEntrada().contains(correo1)); 
        assertTrue(buzon.getBandejaEntrada().contains(correo2)); 
        assertTrue(buzon.getBandejaEnviados().contains(correo1)); 
    }
    @Test 
    public void testSetCorreoInterno(){
        Buzon buzon = new Buzon();

       
        buzon.setCorreoInterno("nuevoCorreo@example.com");

      
        assertEquals("nuevoCorreo@example.com", buzon.getCorreoInterno());
    }
}


