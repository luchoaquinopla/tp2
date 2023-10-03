import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;
import com.correo.ucp.FiltroAsunto;

public class FiltroAsuntoTest {
    @Test
    public void testFiltrarPorAsunto() {
        Buzon buzon = new Buzon();
        List<Correo> bandejaEntrada = new ArrayList<>();
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", buzon, new Buzon());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", buzon, new Buzon());
        Correo correo3 = new Correo("Asunto 1", "Contenido 3", buzon, new Buzon());

        buzon.setBandejaEntrada(bandejaEntrada); 
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);
        buzon.getBandejaEntrada().add(correo3);

        FiltroAsunto filtro = new FiltroAsunto();
        List<Correo> correosFiltrados = filtro.filtrarPorAsunto(buzon, "Asunto 1");

    
        assertEquals(2, correosFiltrados.size()); 
        assertEquals("Asunto 1", correosFiltrados.get(0).getAsunto());
        assertEquals("Asunto 1", correosFiltrados.get(1).getAsunto());
    }
}


