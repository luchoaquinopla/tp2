import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Correo;
import com.correo.ucp.Contacto; 

public class CorreoTest {
    @Test
    public void agregar_contacto_Test() {
   Correo correo = new Correo();
   Contacto contacto = new Contacto();
   correo.agregar(contacto);
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
    public void testCrearNuevoContacto() {
       Contacto remitente = new Contacto("lucho", "lucho@gmail.com");
        assertEquals("lucho", remitente.getNombre());
        assertEquals("lucho@gmail.com", remitente.getCorreo());
       
    
    }
    @Test
    public void agregar_contactos_lista(){
        Correo correo = new Correo();
        Contacto persona1 = new Contacto();
        Contacto persona2 = new Contacto();
        correo.agregar(persona1);
     correo.agregar(persona2);
    assertTrue(correo.getPara().contains(persona1));
    assertTrue(correo.getPara().contains(persona2));

    }
}
