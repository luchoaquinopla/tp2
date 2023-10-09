import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;

import com.correo.ucp.FiltroAsuntoRemitente;
import com.correo.ucp.SendCorreo;

public class FiltroAsuntoRemitenteTest {
        @Test
    public void testFiltrarPorAsuntoYContenido() {
       Buzon buzon = new Buzon();
      FiltroAsuntoRemitente filtro = new FiltroAsuntoRemitente();
        List<Correo> bandejaEntrada = new ArrayList<>();
         List<Correo> bandejaEnviados = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@gmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 4", "Contenido 4", "lucas@gmail.com", new ArrayList<>());
        buzon.setBandejaEntrada(bandejaEntrada);
        bandejaEntrada.add(correo1);
        bandejaEntrada.add(correo2);
        bandejaEntrada.add(correo3);
        bandejaEntrada.add(correo4);
        buzon.setBandejaEnviados(bandejaEnviados);
        bandejaEnviados.add(correo1);
        bandejaEnviados.add(correo2);
        bandejaEnviados.add(correo3);
        bandejaEnviados.add(correo4);


      
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYRemitente(buzon, "Asunto 2", "juan@gmail.com");

        assertEquals(2, correosFiltrados.size());
        assertEquals("juan@gmail.com", correosFiltrados.get(0).getRemitente());
    }
     @Test
    public void testFiltrarPorAsuntoYContenido2() {
       Buzon buzon = new Buzon();
      FiltroAsuntoRemitente filtro = new FiltroAsuntoRemitente();
        List<Correo> bandejaEntrada = new ArrayList<>();
         List<Correo> bandejaEnviados = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@hotmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@hotmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 4", "Contenido 4", "lucas@gmail.com", new ArrayList<>());

        buzon.setBandejaEntrada(bandejaEntrada);
        bandejaEntrada.add(correo1);
        bandejaEntrada.add(correo2);
        bandejaEntrada.add(correo3);
        bandejaEntrada.add(correo4);
        buzon.setBandejaEnviados(bandejaEnviados);
        bandejaEnviados.add(correo1);
        bandejaEnviados.add(correo2);
        bandejaEnviados.add(correo3);
        bandejaEnviados.add(correo4);

        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYRemitente(buzon, "Asunto", "@hotmail.com");

        assertEquals(4, correosFiltrados.size());
        assertEquals("juan@hotmail.com", correosFiltrados.get(0).getRemitente());
           assertEquals("maria@hotmail.com", correosFiltrados.get(1).getRemitente());
    }
            @Test
    public void testEnviarYFiltrarPorAsuntoYContenido() {
        SendCorreo cartero = new SendCorreo();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());
        

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mascota vieja", "Perro negro", "correo@gmail.com", "correo1@gmail.com");
        Correo correo2 = new Correo("Asunto 2", "Gato", "correo@gmail.com", "correo1@gmail.com");
        Correo correo3 = new Correo("Mascota nueva", "Perro azul", "correo@hotmail.com", "correo1@gmail.com");
          Correo correo4 = new Correo("Saludo", "Hola como estas", "correo@gmail.com", "correo1@gmail.com");

        
        cartero.agregarbuzones(buzon);
        

      
        cartero.enviarCorreo(correo1);
        cartero.enviarCorreo(correo2);
        cartero.enviarCorreo(correo3);
        cartero.enviarCorreo(correo4);

        FiltroAsuntoRemitente filtro = new FiltroAsuntoRemitente();
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYRemitente(buzon, "Mascota","@gmail");


       
        assertEquals(1, correosFiltrados.size());
     

     
    }

}
