package Ejer2;


public class Main {
    public static void main(String[] args) {
        // Crear objetos Articulo
        Articulo articulo1 = new Articulo("Nike zapatillas", 20.98,
        4);

        Articulo articulo2 = new Articulo("Adidas zapatillas", 37.97, 
        0);

        Articulo articulo3 = new Articulo("Vans zapatillas", 60.45, 
        7);

        // Llamar al método imprimirDatosArticulo() para cada objeto
        articulo1.imprimirDatosArticulo();
        articulo2.imprimirDatosArticulo();
        articulo3.imprimirDatosArticulo();
}
}