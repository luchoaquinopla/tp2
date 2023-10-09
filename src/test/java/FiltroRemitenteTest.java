import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;
import com.correo.ucp.FiltroContenido;
import com.correo.ucp.FiltroRemitente; // Cambia el nombre de la clase de prueba
import com.correo.ucp.SendCorreo;

public class FiltroRemitenteTest { // Cambia el nombre de la clase de prueba
    @Test
    public void testFiltrarPorRemitente() { // Cambia el nombre del método de prueba
        Buzon buzon = new Buzon();
        List<Correo> bandejaEntrada = new ArrayList<>();
        List<Correo> bandejaEnviados = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "pedro@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 1", "Contenido 3", "pedro@hotmail.com", new ArrayList<>());

        buzon.setBandejaEntrada(bandejaEntrada); 
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);
        buzon.setBandejaEnviados(bandejaEnviados); 
        buzon.getBandejaEnviados().add(correo1);
        buzon.getBandejaEnviados().add(correo2);
        buzon.getBandejaEnviados().add(correo3);

        FiltroRemitente filtro = new FiltroRemitente();
        List<Correo> correosFiltrados = filtro.filtrarPorRemitente(buzon, "@gmail.com");

        assertEquals(4, correosFiltrados.size()); 
        assertEquals("pedro@gmail.com", correosFiltrados.get(0).getRemitente()); 
        assertEquals("pedro@gmail.com", correosFiltrados.get(1).getRemitente());
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
