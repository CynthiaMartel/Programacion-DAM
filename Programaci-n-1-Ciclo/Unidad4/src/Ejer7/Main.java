package Ejer7;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Rectangulo rectangulo = new Rectangulo(0,0);
        System.out.println("Introduzca base del rectangulo: ");
        double rectanguloBase = s.nextDouble();
        rectangulo.setBase(rectanguloBase);
        System.out.println("Introduzca la altura del rectángulo: ");
        double rectanguloAltura = s.nextDouble();
        rectangulo.setAltura(rectanguloAltura);
        
        Cuadrado cuadrado = new Cuadrado(23.8);
        Triangulo triangulo = new Triangulo(20.8,24.3);

        
        System.out.println("El cuadrado tiene un area de: " + cuadrado.calcularArea() + " metros");
        System.out.println("El rectaágulo tiene un area de: " + rectangulo.calcularArea() + " metros");
        System.out.println("El triángulo tiene un area de: " + triangulo.calcularArea() + " metros") ;
    }
}