import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;

import com.correo.ucp.FiltroAsuntoContenido;
import com.correo.ucp.SendCorreo;

public class FiltroAsuntoContenidoTest {
    @Test
    public void testFiltrarPorAsuntoYContenido() {
       Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
      FiltroAsuntoContenido filtro = new FiltroAsuntoContenido();
     
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@gmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 4", "Contenido 4", "lucas@gmail.com", new ArrayList<>());
      
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);
        buzon.getBandejaEntrada().add(correo4);

       
       
        buzon.getBandejaEnviados().add(correo1);
        buzon.getBandejaEnviados().add(correo2);
        buzon.getBandejaEnviados().add(correo3);
        buzon.getBandejaEnviados().add(correo4);
        

        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYContenido(buzon, "Asunto 2", "Contenido 2");

        assertEquals(2, correosFiltrados.size());
        assertEquals("juan@gmail.com", correosFiltrados.get(0).getRemitente());
      
    }
       @Test
    public void testFiltrarPorAsuntoYContenido2() {
          Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
      FiltroAsuntoContenido filtro = new FiltroAsuntoContenido();
      
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@gmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 2", "Contenido 2", "lucas@gmail.com", new ArrayList<>());
        
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);
        buzon.getBandejaEntrada().add(correo4);

       
       
        buzon.getBandejaEnviados().add(correo1);
        buzon.getBandejaEnviados().add(correo2);
        buzon.getBandejaEnviados().add(correo3);
        buzon.getBandejaEnviados().add(correo4);
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYContenido(buzon, "Asunto", "Contenido");

        assertEquals(8, correosFiltrados.size());
      
    }
         @Test
    public void testEnviarYFiltrarPorAsuntoYContenido() {
        SendCorreo cartero = new SendCorreo();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
     
        

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mascota vieja", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Mascota nueva", "Perro azul", "correo@gmail.com", "correo1@gmail.com");
        Correo correo4 = new Correo("Saludo", "Hola como estas", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);
        

      
        cartero.enviarCorreo(correo1);
        cartero.enviarCorreo(correo2);
        cartero.enviarCorreo(correo3);
        cartero.enviarCorreo(correo4);

        FiltroAsuntoContenido filtro = new FiltroAsuntoContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYContenido(buzon, "Mascota","Perro");
     


       
        assertEquals(2, correosFiltrados.size());
       
     

     
    }
    

}
