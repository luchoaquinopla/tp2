
import com.correo.ucp.Buzon;
import java.util.ArrayList;
import java.util.List;
import com.correo.ucp.Correo;

import com.correo.ucp.FiltroAsunto;
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
}



