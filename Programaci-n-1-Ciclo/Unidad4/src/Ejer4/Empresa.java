package Ejer4;
import java.util.ArrayList;

public class Empresa {

    // Atributos
    protected String nombre;
    protected int cif;
    protected Direccion direccion;
    protected ArrayList<Departamento> departamentos;

    // Constructor
    public Empresa(String nombre, int cif, Direccion direccion, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;

        // Inicializa con un ArrayList vacío por defecto
        this.departamentos = departamentos;
    }

    //sets:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCif(int cif){
        this.cif = cif;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public void setDepartamento(ArrayList<Departamento> departamentos){
        this.departamentos = departamentos;
    }
    //gets:
    public String getNombre(){
        return nombre;
    }
    public int getCif(){
        return cif;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    public ArrayList<Departamento> getDepartamento(){
        return departamentos;
    }

    //Métodos:
    // Método para contar el total de empleados en la empresa
    public int numeroEmpleados() {
        int totalEmpleados = 0;
        for (Departamento departamento : departamentos) {
            totalEmpleados += departamento.numeroEmpleados(); // Usamos el método de instancia
        }
        System.out.print("Número de empleados de la empresa: ");
        return totalEmpleados;
    }

    public void addDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    public void delateDepartamento(Departamento departamento) {
        if (departamento.numeroEmpleados() == 0) { // Verifica solo el departamento específico
            departamentos.remove(departamento); // Elimina el departamento si está vacío
        }   
    } 
    @Override
    public String toString() {
    return "Empresa: " + nombre + "\n" +
           "  cif: " + cif + "\n" +
           "  Dirección: " + direccion + "\n" +
           "  Departamentos: \n" + departamentos + "\n";
    }
 
}


