package Ejer3;

public class Main {
    public static void main(String[] args) {
        int numeroDNI1 = 45362243;
        char letraDNI = DNI.asignarLetraDni(numeroDNI1);
        DNI DNI1 = new DNI(numeroDNI1, letraDNI);

        System.out.println("El DNI1 es: " + DNI1.getNumero() + "-" + DNI1.getLetra());

        System.out.println(); //Salto de línea para que la validación no se muestre pegado al print anterior
        DNI1.validacionDNI();
    }
}
