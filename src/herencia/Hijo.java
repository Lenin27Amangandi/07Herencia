package herencia;

import Utilitario.ALColor;
import Utilitario.Utilitario;

public class Hijo extends Padre {

    private Padre padre;

    public Hijo(Padre padre) {
        padre.ingresarSusNombres();
        this.padre = padre;
        padre.saludar();
        System.out.println();
        ingresarSusNombres();
        saludar();
    }

    @Override
    public void saludar() {
        System.out.println("Mi nombre es " + getNombre() + " y el nombre de mi padre es " + padre.getNombre());
        System.out.println("Mi apellido es " + getApellido() + " y el apellido de mi padre es " + padre.getApellido());
    }

    @Override
    public void ingresarSusNombres() {
        String name, surname;
        System.out.println();
        System.out.print(ALColor.Pink_3 + "Estudiante Ingrese su nombre : " + ALColor.Reset);
        name = Utilitario.sc.nextLine();
        System.out.print(ALColor.verdeMenta + "Estudiante Ingrese su apellido: " + ALColor.Reset);
        surname = Utilitario.sc.nextLine();
        setNombre(name);
        setApellido(surname);
    }
}
