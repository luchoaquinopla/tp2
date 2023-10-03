import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.correo.ucp.Correo;
import com.correo.ucp.Buzon;
import com.correo.ucp.Contacto; 

public class CorreoTest {
    @Test
    public void agregarcontactoTest() {
   Correo correo = new Correo();
   Contacto contacto = new Contacto();

}
   @Test
public void testCrearNuevoCorreo() {
  
    
    Correo correo = new Correo("Asunto de prueba", "Contenido de prueba", "remitente", "destinatario");
    assertEquals("Asunto de prueba", correo.getAsunto());
    assertEquals("Contenido de prueba", correo.getContenido());
    assertEquals("remitente", correo.getRemitente());
    assertEquals("destinatario", correo.getPara().get(0)); 
}

 
 @Test
    public void testGetAsunto() {
      Buzon remitente = new Buzon();
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba", "remitente", new ArrayList<>());
        assertEquals("Asunto de prueba", correo.getAsunto());
    }
    @Test
    public void testGetContenido() {
     
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba","remitente", new ArrayList<>());
        assertEquals("Contenido de prueba", correo.getContenido());
    }
    @Test
    public void testGetRemitente() {
         
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba","remitente",new ArrayList<>());
        assertEquals("remitente", correo.getRemitente());
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
       
        Correo correo = new Correo();
        correo.setRemitente("remitente"); 
        assertEquals("remitente", correo.getRemitente());
    }
}



    
    
 

