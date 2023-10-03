import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import com.correo.ucp.Contacto;
import org.junit.Test;

import com.correo.ucp.Buzon;
import com.correo.ucp.Correo;

public class BuzonTest {
    @Test
    public void testGetBandejaEntrada() {
        
        Buzon buzon = new Buzon("asdasfqasd",new ArrayList<>(), new ArrayList<>());
        assertTrue(buzon.getBandejaEntrada().isEmpty());
    }

    @Test
    public void testGetBandejaEnviados() {
     
        Buzon buzon = new Buzon("asdasfqasd",new ArrayList<>(), new ArrayList<>());
        assertTrue(buzon.getBandejaEnviados().isEmpty());
    }
    @Test
    public void testAgregarElementos() {
        Contacto remitente = new Contacto();
        // Crear una instancia de Buzon
        Buzon buzon = new Buzon("correo@example.com", new ArrayList <>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Asunto 1", "Contenido 1", remitente, new ArrayList<>());
        Correo correo2 = new Correo("Asunto 2", "Contenido 2", remitente, new ArrayList<>());

        // Agregar elementos a la bandeja de entrada
        buzon.getBandejaEntrada().add(correo1);
        buzon.getBandejaEntrada().add(correo2);

        // Agregar elementos a la bandeja de enviados
        buzon.getBandejaEnviados().add(correo1);

        // Verificar si los elementos se han agregado correctamente
        assertEquals(2, buzon.getBandejaEntrada().size()); // Debería haber 2 elementos en la bandeja de entrada
        assertEquals(1, buzon.getBandejaEnviados().size()); // Debería haber 1 elemento en la bandeja de enviados
        assertTrue(buzon.getBandejaEntrada().contains(correo1)); // La bandeja de entrada debe contener correo1
        assertTrue(buzon.getBandejaEntrada().contains(correo2)); // La bandeja de entrada debe contener correo2
        assertTrue(buzon.getBandejaEnviados().contains(correo1)); // La bandeja de enviados debe contener correo1
    }
}


