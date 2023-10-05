import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;
import com.correo.ucp.FiltroAsuntoContenido;

public class FiltroAsuntoContenidoTest {
    @Test
    public void testFiltrarPorAsuntoYContenido() {
       Buzon buzon = new Buzon();
      FiltroAsuntoContenido filtro = new FiltroAsuntoContenido();
        List<Correo> bandejaEntrada = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@gmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 4", "Contenido 4", "lucas@gmail.com", new ArrayList<>());

        bandejaEntrada.add(correo1);
        bandejaEntrada.add(correo2);
        bandejaEntrada.add(correo3);
        bandejaEntrada.add(correo4);

        buzon.setBandejaEntrada(bandejaEntrada);

        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYContenido(buzon, "Asunto 2", "Contenido 2");

        assertEquals(1, correosFiltrados.size());
        assertEquals("juan@gmail.com", correosFiltrados.get(0).getRemitente());
    }
       @Test
    public void testFiltrarPorAsuntoYContenido2() {
       Buzon buzon = new Buzon();
      FiltroAsuntoContenido filtro = new FiltroAsuntoContenido();
        List<Correo> bandejaEntrada = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "pedro@gmail.com", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "juan@gmail.com", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 3", "Contenido 3", "maria@gmail.com", new ArrayList<>());
        Correo correo4 = new Correo("Asunto 2", "Contenido 2", "lucas@gmail.com", new ArrayList<>());

        bandejaEntrada.add(correo1);
        bandejaEntrada.add(correo2);
        bandejaEntrada.add(correo3);
        bandejaEntrada.add(correo4);

        buzon.setBandejaEntrada(bandejaEntrada);

        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoYContenido(buzon, "Asunto 2", "Contenido 2");

        assertEquals(2, correosFiltrados.size());
        assertEquals("juan@gmail.com", correosFiltrados.get(0).getRemitente());
        assertEquals("lucas@gmail.com", correosFiltrados.get(1).getRemitente());
    }

}
