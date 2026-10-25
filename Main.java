
public class Main {
    public static void main(String [] args){
        EstacionMeteorologica estacion = new EstacionMeteorologica();


        Sensor sensor1 = new Sensor ("Temperatura");
        Sensor sensor2 = new Sensor ("Humedad");
        Sensor sensor3 = new Sensor ("Presion");

        estacion.agregarSensor(sensor1);
        estacion.agregarSensor(sensor2);
        estacion.agregarSensor(sensor3);

        estacion.generarReporteClimatico();
    }
}