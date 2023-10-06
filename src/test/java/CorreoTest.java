import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Correo;



public class CorreoTest {

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
    @Test
    public void testParaVarios(){
        List<String> para = new ArrayList<>();
        String destinatario = "pepe@gmail.com";
        String destinatario1 = "pipo@gmail.com";
        String destinatario2 = "pupu@gmail.com";
        para.add(destinatario);
        para.add(destinatario1);
        para.add(destinatario2);
        Correo correo = new Correo("Asunto", "Contenido", "remitente@example.com", para);
        assertEquals(3, para.size());
        assertEquals("pepe@gmail.com",correo.getPara().get(0));
         assertEquals("pipo@gmail.com",correo.getPara().get(1));
          assertEquals("pupu@gmail.com",correo.getPara().get(2));
       
    }
}



    
    
 

