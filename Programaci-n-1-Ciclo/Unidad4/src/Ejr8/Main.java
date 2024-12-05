package Ejr8;

public class Main {
    public static void main(String[] args) {
        Profesor Maria = new Profesor(
            "María del Monte", 
            "Las Palmas", 
            "Departamento de Biología", 
            "Jefa de departamento");
    
    Profesor Juan = new Profesor(
        "Juan Carlos",
        "La Laguna",
        "Departamento de Matemáticas",
        "Profesor asociado"
    );

    Estudiante Cynthia = new Estudiante(
        "Cynthia Martel", 
        "El Chorrillo", 
        "Programación y tecnología de plantas", 
        1);
    Estudiante Isaiah = new Estudiante (
        "Isaiah Jesús",
        "Casa Blanca 1",
        "Programación y dirección de empresas",
        2
    );
    System.out.println(Maria.toString());
    System.out.println(Juan.toString());
    System.out.println(Cynthia.toString());
    System.out.println(Isaiah.toString());
    }
}
