package Ejer2;

public class Articulo {
    
    //Atributos
    protected String nombre;
    protected double precio;
    protected int unidadesDisponibles;
    

    //Constructores
    public Articulo(String nombre, double precio, int unidadesDisponibles){
        this.nombre = nombre;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    //Igic como constante global
    public static final double IGIC = 0.07;
    
    //gets
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getUnidadesDisponibles(){
        return unidadesDisponibles;
    }

//Métodos para los cálculos
public boolean existenUnidadesDisponibles(){
    if(unidadesDisponibles > 0){
        System.out.println(":) Existen unidades disponibles");
        return true;
    }
else{
    System.out.println(":( No existen unidades disponibles");
    return false;
    }
}
public double precioConIGIC(){
    double precioTotal = getPrecio() + (getPrecio() * IGIC);
    return precioTotal;
}
public void imprimirDatosArticulo(){
    System.out.println("--Datos del producto--");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Precio + IGIC: " + precioConIGIC() + " euros");
    System.out.println("Precio original: " + this.precio);
    existenUnidadesDisponibles();
    System.out.println("Unidades disponibles: " + this.unidadesDisponibles);
}

}



