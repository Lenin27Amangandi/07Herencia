package herencia;

import Utilitario.ALColor;
import Utilitario.Utilitario;

public class Hijo extends Padre {

    private Padre padre;

    public Hijo(Padre padre) {
        padre.ingresarSusNombres();
        this.padre = padre;
        padre.saludar();
        // saludar();
    }

    @Override
    public void saludar() {
        System.out.println("\nMi nombre es " + getNombre() + " y el nombre de mi padre es " + padre.getNombre());
        System.out.println("Mi apellido es " + getApellido() + " y el apellido de mi padre es " + padre.getApellido());
    }

    @Override
    public void ingresarSusNombres() {
        String name, surname;
        System.out.print(ALColor.Pink_3 + "\nEstudiante Ingrese su nombre : " + ALColor.Reset);
        name = Utilitario.sc.nextLine();
        System.out.print(ALColor.verdeMenta + "Estudiante Ingrese su apellido: " + ALColor.Reset);
        surname = Utilitario.sc.nextLine();
        setNombre(name);
        setApellido(surname);
    }
}
