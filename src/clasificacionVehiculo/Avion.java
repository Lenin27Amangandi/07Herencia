package clasificacionVehiculo;

public class Avion extends TransportesAereos {

    public Avion() {
        System.out.println("\n Creando el avion");
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Encendiendo turvinas del avion");
    }

    @Override
    public void off() {
        System.out.println("Apagando turvinas del avion");
        super.off();

    }
}
