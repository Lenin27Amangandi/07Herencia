package herencia;

import java.util.Scanner;

import Utilitario.ALColor;
import Utilitario.Utilitario;

public class Padre {

    private String nombre;
    private String apellido;

    public Padre() {
    }

    public void saludar() {
        System.out.print("Mi nombre de padre es " + getNombre()+" "+"mi apellido de padre es " + getApellido());
        // System.out.print(" mi apellido de padre es " + getApellido());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre == null) {
            nombre = "....";
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.isEmpty() || apellido == null) {
            apellido = "....";
        }
        this.apellido = apellido;
    }

    public void ingresarSusNombres() {
        String name, surname;
        System.out.print(ALColor.Yellow_2 + "\nIngrese su nombre: " + ALColor.Reset);
        name = Utilitario.sc.nextLine();
        System.out.print(ALColor.Cyan_5 + "Ingrese su apellido: " + ALColor.Reset);
        surname = Utilitario.sc.nextLine();
        setNombre(name);
        setApellido(surname);
    }

}
