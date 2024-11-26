package Ejer3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("C/Plaza Escorial", 4, 35013, "Las Palmas de GC", "Las Palmas");
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(
            "Daniel", 
            45362254,
            31, 
            1900, 
            "programador")
        );
        
        Empresa empresa1 = new Empresa("Dancyn", 342567488, direccion1, departamentos);

        System.out.print(empresa1.nombre + empresa1.direccion);

    }
}