import java.util.ArrayList;
import java.util.List;


public class EstacionMeteorologica {
     private List<Sensor> sensores;

     public EstacionMeteorologica(){
         sensores = new ArrayList<>();
     }

     public void agregarSensor(Sensor sensor){
         sensores.add(sensor);
     }
     public void generarReporteClimatico(){
         System.out.println("====Reporte Climatico====");
         for (Sensor sensor : sensores){
             double lectura = sensor.obtenerLectura();

             System.out.println(sensor.getTipo() + ": " + lectura);
         }
     }
}
