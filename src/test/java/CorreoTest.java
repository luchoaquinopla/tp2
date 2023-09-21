import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.correo.ucp.Correo; // Importar la clase Correo correctamente

public class CorreoTest {
    @Test
    public void nuevo_Correo_Test() {
        Correo correo1 = new Correo("Ap", "Cp");
        assertEquals("Ap", correo1.getAsunto());
        assertEquals("Cp", correo1.getContenido());
    }
    @Test
    public void testAsuntoVacio() {
       
        String asunto = "";
        String contenido = "Cp";

       
        Correo correo = new Correo(asunto, contenido);

        
        assertNotNull(correo.getAsunto());
        assertTrue(correo.getAsunto().isEmpty());
    }
}