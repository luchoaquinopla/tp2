import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.correo.ucp.Contacto;

public class ContactoTest {
    @Test
    public void crearNuevoContacto(){
        Contacto contacto = new Contacto("lucho", "lucho@gmail.com");
         assertEquals("lucho", contacto.getNombre());
        assertEquals("lucho@gmail.com", contacto.getCorreo());

    }
    @Test
    public void getNombretest(){
    Contacto contacto = new Contacto("lucho", "lucho@gmail.com");
     assertEquals("lucho", contacto.getNombre());
    }
      @Test
    public void getCorreotest(){
    Contacto contacto = new Contacto("lucho", "lucho@gmail.com");
     assertEquals("lucho@gmail.com", contacto.getCorreo());
    }
     @Test
    public void setNombretest(){
    Contacto contacto = new Contacto();
    contacto.setNombre("pepe");
    assertEquals("pepe", contacto.getNombre());
 }
     @Test
    public void setCorreotest(){
    Contacto contacto = new Contacto();
    contacto.setCorreo("pepe@gmail.com");
    assertEquals("pepe@gmail.com", contacto.getCorreo());
 }
}
