package clasificacionVehiculo;

public class Helicoptero extends TransportesAereos {

    public Helicoptero() {
        System.out.println("\n Creando el helicoptero");
    }

    @Override
    public void on() {
        super.on();
        System.out.println("Encendiendo turvinas del helicoptero");
    }

    @Override
    public void off() {
        System.out.println("Apagando turvinas del helicoptero");
        super.off();

    }

}
