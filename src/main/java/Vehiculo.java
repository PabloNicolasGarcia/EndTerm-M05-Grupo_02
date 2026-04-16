public class Vehiculo {
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
    }
    int velocidadActual = 0;
    int velocidadMaxima = 180;
    public int getVelocidadActual() {
        return velocidadActual; // valor incorrecto a propósito
    }
    public void acelerar(int incremento) {
        this.velocidadActual += incremento;

        // Lógica de "velocidad máxima": si nos pasamos, lo clavamos en el límite
        if (this.velocidadActual > this.velocidadMaxima) {
            this.velocidadActual = this.velocidadMaxima;
        }
}
    public void frenar(int decremento) {
        velocidadActual -= decremento;
    }
}