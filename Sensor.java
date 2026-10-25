public class Sensor {
    private String tipo;

    public Sensor(String tipo) {
        this.tipo = tipo;
    }

    public double obtenerLectura() {
        return Math.random() * 100;
    }

    public String getTipo() {
        return tipo;
    }
}