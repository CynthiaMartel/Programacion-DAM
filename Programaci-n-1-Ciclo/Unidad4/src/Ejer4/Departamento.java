package Ejer4;

import java.util.ArrayList;

public class Departamento {
    
    //atributos
    protected String nombre;
    protected int codigo;
    protected String localizacion;
    protected ArrayList<Empleado> empleados;

    //constructores
    Departamento(String nombre, int codigo, String localizacion, ArrayList<Empleado> empleados){
        this.nombre = nombre;
        this.codigo = codigo;
        this.localizacion = localizacion;

        this.empleados = empleados;
    }

    //sets:
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }
    public void setEmpleados(ArrayList<Empleado> empleados){
        this.empleados=empleados;
    }

    //gets:
    public String getNombre(){
        return this.nombre;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getLocalizacion(){
        return this.localizacion;
    }
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }

    //metodos
    public int numeroEmpleados(){
        return empleados.size();
    }
    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void deleteEmpleado(Empleado empleado){
            empleados.remove(empleado);
        }
    
    @Override
    public String toString() {
        return "Departamento:\n" +
                "  Nombre: " + nombre + "\n" +
                "  Código: " + codigo + "\n" +
                "  Localización: " + localizacion + "\n" +
                "  Empleados: " + empleados+ "\n";
    }
        
}

