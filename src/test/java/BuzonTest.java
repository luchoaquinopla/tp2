import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.correo.ucp.Buzon;

public class BuzonTest {
    @Test
    public void testGetBandejaEntrada() {
     
        Buzon buzon = new Buzon();
        assertTrue(buzon.getBandejaEntrada().isEmpty());
    }

    @Test
    public void testGetBandejaEnviados() {
     
        Buzon buzon = new Buzon();
        assertTrue(buzon.getBandejaEnviados().isEmpty());
    }
}

