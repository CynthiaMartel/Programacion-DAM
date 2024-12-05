package Ejer6;

public class JefeEstacion {
    //atributos:
    protected String nombre;
    protected int dni;
    protected String fechaNombramiento;

    //Constructoresç
    public JefeEstacion(String nombre, int dni, String fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
    
    //setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setFechaNombramiento(String fechaNombramiento){
        this.fechaNombramiento = fechaNombramiento;
    }

    //getters:
    public String getNombre(){
        return this.nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public String getFechaNombramiento(String fechaNombramiento){
        return this.fechaNombramiento;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "DNI: " + dni + "\n" +
                "Fecha de Nombramiento: " + fechaNombramiento + "\n";
    }
}
