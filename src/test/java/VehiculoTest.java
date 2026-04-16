import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoTest {

    @Test
    void crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 180);
        assertEquals(0, vehiculo.getVelocidadActual());
    }
    @Test
    @DisplayName("El vehículo no debe superar su velocidad máxima") // Etiqueta opcional para que el test se vea mejor [cite: 321]
    void noSuperarVelocidadMaxima() {
        // 1. Arrange (Preparar): Creamos un coche con límite de 120 [cite: 316]
        Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 120);

        // 2. Act (Actuar): Intentamos acelerar mucho más allá del límite [cite: 317]
        vehiculo.acelerar(150);

        // 3. Assert (Afirmar): Comprobamos que la velocidad se ha quedado en 120 [cite: 318]
        assertEquals(120, vehiculo.getVelocidadActual());
    }
}