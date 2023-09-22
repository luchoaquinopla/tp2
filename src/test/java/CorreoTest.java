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
       List<Contacto> para = new ArrayList<>();
        Contacto remitente = new Contacto("Remitente", "remitente@example.com");
        Correo correo = new Correo("Asunto de prueba", "Contenido de prueba", remitente,para);
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
    
    @Test
    public void testEnviar() {
        Contacto remitente = new Contacto("lucho", "lucho@gmail.com");
        Contacto destinatario = new Contacto("destinatario", "destinatario@gmail.com");
        List<Contacto> para = new ArrayList<>();
        Correo correo = new Correo("hola", "como estas", remitente, para);
        correo.agregar(destinatario);
        correo.enviar(correo);
        assertTrue(remitente.getBandejaEnviados().contains(correo));
         assertTrue(destinatario.getBandejaEntrada().contains(correo));

     
    }
    @Test
    public void agregarCorreoAEnviados_test(){
         List<Contacto> para = new ArrayList<>();
        Contacto persona1 = new Contacto("lucho", "lucho@gmail.com");
        Correo correo = new Correo("hola", "hola como estas", persona1,para);
        persona1.agregarCorreoAEnviados(correo);
        assertTrue(persona1.getBandejaEnviados().contains(correo));
      
    }
     @Test
    public void agregarCorreoRecibidos_test(){
         List<Contacto> para = new ArrayList<>();
        Contacto persona1 = new Contacto("lucho", "lucho@gmail.com");
        Correo correo = new Correo("hola", "hola como estas", persona1,para);
        persona1.agregarCorreoARecibidos(correo);
        assertTrue(persona1.getBandejaEntrada().contains(correo));
      
    }
}

    
    
 

