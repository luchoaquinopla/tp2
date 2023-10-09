
import com.correo.ucp.Buzon;
import java.util.ArrayList;
import java.util.List;
import com.correo.ucp.Correo;

import com.correo.ucp.FiltroAsunto;
import com.correo.ucp.FiltroContenido;
import com.correo.ucp.SendCorreo;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FiltroAsuntoTest {
    @Test
    public void testFiltrarPorAsunto() {
        
        List<Correo> bandejaEntrada = new ArrayList<>();
        List<Correo> bandejaEnviados = new ArrayList<>();
        Buzon buzon = new Buzon();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "buzon", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "buzon", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 1", "Contenido 3", "buzon",new ArrayList<>());

        buzon.setBandejaEntrada(bandejaEntrada); 
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);
        buzon.setBandejaEnviados(bandejaEnviados); 
        buzon.getBandejaEnviados().add(correo1);
        buzon.getBandejaEnviados().add(correo2);
        buzon.getBandejaEnviados().add(correo3);

        FiltroAsunto filtro = new FiltroAsunto();
        List<Correo> correosFiltrados = filtro.filtrarPorAsunto(buzon, "Asunto 1"); // Cambia el asunto de búsqueda
        
        assertEquals(4, correosFiltrados.size()); // Verifica que la lista esté vacía
    }
        @Test
    public void testEnviarYFiltrarPorAsunto() {
        SendCorreo cartero = new SendCorreo();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
         Buzon buzon2 = new Buzon("correo1@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mascota vieja", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Mascota nueva", "Perro azul", "correo@gmail.com", "correo1@gmail.com");
          Correo correo4 = new Correo("Saludo", "Perro azul", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);
         cartero.agregarbuzones(buzon2);

      
        cartero.enviarCorreo(correo1);
        cartero.enviarCorreo(correo2);
        cartero.enviarCorreo(correo3);
        cartero.enviarCorreo(correo4);

        FiltroAsunto filtro = new FiltroAsunto();
        List<Correo> correosFiltrados = filtro.filtrarPorAsunto(buzon, "Mascota");
        List<Correo> correosFiltrados1 = filtro.filtrarPorAsunto(buzon2, "Asunto 2");

       
        assertEquals(2, correosFiltrados.size());
         assertEquals(1, correosFiltrados1.size());

     
    }
}



