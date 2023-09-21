import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.correo.ucp.Correo; // Importar la clase Correo correctamente

public class CorreoTest {
    @Test
    public void nuevo_Correo_Test() {
        Correo correo1 = new Correo("Ap", "Cp");
        assertEquals("Ap", correo1.getAsunto());
        assertEquals("Cp", correo1.getContenido());
    }
}