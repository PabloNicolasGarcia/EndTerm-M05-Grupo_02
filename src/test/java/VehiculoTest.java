import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

public class VehiculoTest {

    @Test
    void crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
    @Test
    void acelerarAumentaLaVelocidadActual() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        vehiculo.acelerar(20);
        assertEquals(20, vehiculo.getVelocidadActual());
    }
    @Test
    void frenarReduceLaVelocidadActual() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        vehiculo.acelerar(50);
        vehiculo.frenar(20);
        assertEquals(30, vehiculo.getVelocidadActual());
    }
    @Test
    void frenarNoDebeDejarVelocidadNegativa() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        vehiculo.acelerar(10);
        vehiculo.frenarLimite(50);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
}
