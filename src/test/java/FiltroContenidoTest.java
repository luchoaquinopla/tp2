import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;
import com.correo.ucp.FiltroContenido;
import com.correo.ucp.FiltroRemitente;
import com.correo.ucp.SendCorreo;

public class FiltroContenidoTest {
    @Test
    public void testFiltrarPorContenido() {
        Buzon buzon = new Buzon("juan@hotmail.com", new ArrayList<>(),new ArrayList<>());

        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "buzon", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "buzon", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 1", "Contenido 3", "buzon", new ArrayList<>());

      
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);
       
        buzon.getBandejaEnviados().add(correo1);
        buzon.getBandejaEnviados().add(correo2);
        buzon.getBandejaEnviados().add(correo3);
        FiltroContenido filtro = new FiltroContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, "Contenido");

    
        assertEquals(6, correosFiltrados.size()); 
        assertEquals("Contenido 1", correosFiltrados.get(0).getContenido());
        assertEquals("Contenido 2", correosFiltrados.get(1).getContenido());
        assertEquals("Contenido 3", correosFiltrados.get(2).getContenido());
    }
   
    @Test
    public void testEnviarYFiltrarPorContenido() {
        SendCorreo cartero = new SendCorreo();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Asunto 3", "Perro azul", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);

      
        cartero.enviarCorreo(correo1);
        cartero.enviarCorreo(correo2);
        cartero.enviarCorreo(correo3);

        FiltroContenido filtro = new FiltroContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, "Perro");

       
        assertEquals(2, correosFiltrados.size());

     
    }
}
