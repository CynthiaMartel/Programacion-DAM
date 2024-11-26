package Ejer1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Persona[] personas = new Persona[2];
        for(int n=0; n < personas.length; n++){
            System.out.println("Introduzca los datos de la persona " + (n + 1) + ":");
            
            //Datos:
            System.out.print("Introduzca su dni (sólo números): ");
            int dni = s.nextInt();
            while (!Persona.validarDni(dni)){
                System.out.print("DNI inválido. Intentelo de nuevo");
                dni = s.nextInt();
                s.nextLine();
            }
            s.nextLine();
            System.out.print("Introduzca su nombre: ");
            String nombre = s.nextLine();
            System.out.print("Introduzca sus apellidos: ");
            String apellidos = s.nextLine();
            System.out.print("Introduzca su edad: ");
            int edad = s.nextInt();

            
            personas[n] = new Persona(dni, nombre, apellidos, edad);
        }
        
        //Mostrar datos 
        for (Persona persona:personas){
            persona.mostrarDatos();
        }
}

}
