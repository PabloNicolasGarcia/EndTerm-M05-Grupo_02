import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {

    @Test
    void crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}