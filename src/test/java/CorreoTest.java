import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.correo.ucp.Correo;
import com.correo.ucp.Contacto; 

public class CorreoTest {
    @Test
    public void agregarcontactoTest() {
   Correo correo = new Correo();
   Contacto contacto = new Contacto();

}
     @Test
    public void testCrearNuevoCorreo() {
        Contacto remitente = new Contacto("Remitente", "remitente@example.com");
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba", remitente);
        assertEquals("Asunto de prueba", correo.getAsunto());
        assertEquals("Contenido de prueba", correo.getContenido());
        assertEquals(remitente, correo.getRemitente());
        
    
    }
 
 @Test
    public void testGetAsunto() {
        Contacto remitente = new Contacto();
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba", remitente);
        assertEquals("Asunto de prueba", correo.getAsunto());
    }
    @Test
    public void testGetContenido() {
       Contacto remitente = new Contacto();
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba",remitente);
        assertEquals("Contenido de prueba", correo.getContenido());
    }
    @Test
    public void testGetRemitente() {
         Contacto remitente = new Contacto("remitente","lucho@gmail.com");
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba",remitente);
        assertEquals(remitente, correo.getRemitente());
    }
    @Test
    public void testSetAsunto() {
        Correo correo = new Correo();
        correo.setAsunto("Nuevo asunto");
        assertEquals("Nuevo asunto", correo.getAsunto());
    }

    @Test
    public void testSetContenido() {
       Correo correo = new Correo();
        correo.setContenido("Nuevo contenido");  
        assertEquals("Nuevo contenido", correo.getContenido());
    }
    @Test
    public void testSetRemitente() {
        Contacto remitente = new Contacto("Nombre Remitente", "remitente@example.com");
        Correo correo = new Correo();
        correo.setRemitente(remitente); 
        assertEquals(remitente, correo.getRemitente());
    }
}



    
    
 

