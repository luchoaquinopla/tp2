import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;
import com.correo.ucp.FiltroContenido;

public class FiltroContenidoTest {
    @Test
    public void testFiltrarPorContenido() {
        Buzon buzon = new Buzon();
        List<Correo> bandejaEntrada = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", "buzon", new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", "buzon", new ArrayList<>());
        Correo correo3 = new Correo("Asunto 1", "Contenido 3", "buzon", new ArrayList<>());

        buzon.setBandejaEntrada(bandejaEntrada); 
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);

        FiltroContenido filtro = new FiltroContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, "Contenido");

    
        assertEquals(3, correosFiltrados.size()); 
        assertEquals("Contenido 1", correosFiltrados.get(0).getContenido());
        assertEquals("Contenido 2", correosFiltrados.get(1).getContenido());
        assertEquals("Contenido 3", correosFiltrados.get(2).getContenido());
    }
}
