package clasificacionVehiculo;

public abstract class Transporte {

    private String nombre;

    public void acelerar() {
        System.out.println("Estamos acelerando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
