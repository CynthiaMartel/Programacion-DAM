package Ejer9;

public class Main {
    public static void main(String[] args) {
        Perros perro1 = new Perros(
            "Nublo", 
            1, 
            "Negro y Marrón", 
            "pequeño", 
            "pastor alemán", 
            15.90, 
            false);
        
        System.out.println(perro1.toString());

        Gatos gato1 = new Gatos(
            "Neko", 
            2, 
            "Blanco y naranja", 
            "pelo largo", 
            "raton");
        System.out.println(gato1.toString());
    }
}
