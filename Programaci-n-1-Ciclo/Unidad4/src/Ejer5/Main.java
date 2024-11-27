package Ejer5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca su DNI: ");
        int DNI = s.nextInt();
        s.nextLine(); // Limpiar el buffer del Scanner
        System.out.println("Introduzca su nombre completo: ");
        String titular = s.nextLine();
        
        

        // Crear la instancia de CuentaCorriente
        CuentaCorriente cuenta = new CuentaCorriente(DNI, titular);
        
        //Acciones del usuario
        int opciones;
        do{
            System.out.println("\n__Menú__");
            System.out.println("1. Si desea ingresar dinero pulse [1]");
            System.out.println("2. Si desea retirar dinero pulse [2]");
            System.out.println("3. Si desea ver info de cuenta pulse [3]");
            System.out.println("4. Si desea salir pulse [4]");
            System.out.println("Elija una opción de las anteriores: ");
            opciones = s.nextInt();

            switch (opciones){
                case 1:
                System.out.print("Cantidad a ingresas: ");
                double dineroIngresado = s.nextDouble();
                cuenta.ingresarDinero(dineroIngresado);
                break;

                case 2:
                System.out.print("Cantidad a retirar: ");
                double dineroRetirado = s.nextDouble();
                cuenta.sacarDinero(dineroRetirado);
                break;

                case 3:
                cuenta.mostrarInfo();
                break;

                case 4:
                System.out.print("__Cerrando programa__");
                break;
            }
        } while (opciones != 4);
            
    }
      
}

