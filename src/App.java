import clasificacionVehiculo.*;
import herencia.*;

public class App {
    public static void main(String[] args) throws Exception {

        Padre p = new Padre();
        // p.ingresarSusNombres();
        // p.setNombre("Angel");
        // p.setApellido("Amangandi");
        // System.out.println("\nDesde aqui va el otro constructor");
        
        Hijo h = new Hijo(p);
        // h.ingresarSusNombres();
        // h.setNombre("Xander");
        // h.setApellido("Half");
        // h.saludar();

        // Avion avion = new Avion();
        // avion.on();
        // avion.off();
        // Helicoptero helip = new Helicoptero();
        // helip.on();
        // helip.off();

    }
}
