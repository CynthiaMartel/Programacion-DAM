package Ejer4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //--Empresa1--//
        Direccion direccion_Empresa1 = new Direccion("C/Plaza Escorial", 4, 35013, "Las Palmas de GC", "Las Palmas");
        ArrayList<Departamento> departamentos_empresa1 = new ArrayList<>();
        ArrayList<Empleado> empleadosProgramación_empresa1 = new ArrayList<>();
        ArrayList<Empleado> empleadosDiseñoGráfico_empresa1 = new ArrayList<>();
        ArrayList<Empleado> empleadosMarketing_empresa1 = new ArrayList<>();
        ArrayList<Empleado> empleadosDireccionyGestion_empresa1 = new ArrayList<>();
        //Empleados
        empleadosProgramación_empresa1.add(new Empleado(
            "Daniel", 
            45362254,
            31, 
            1900, 
            "Programador senior")
        );
        empleadosProgramación_empresa1.add(new Empleado(
            "Cynthia",
            45362243,
            29,
            1450,
            "Programadora Junnior")
            );
        empleadosDiseñoGráfico_empresa1.add(new Empleado(
        "Paula",
        45678923,
        25,
        1350,
        "Experta en diseño gráfico"
        )
        );
        empleadosMarketing_empresa1.add(new Empleado(
            "Juliana", 
            4567365, 
            35, 
            1350, 
            "Experta en marketing")
        );
        empleadosDireccionyGestion_empresa1.add(new Empleado(
            "Fatima del Mar", 
            3456542, 
            37, 
            1990, 
            "Directora de la empresa")
        );
        empleadosDireccionyGestion_empresa1.add(new Empleado(
            "Ramón Pérez", 
            45345677, 
            38, 
            1990, 
            "Co-director de la empresa")
        );
        //Departamentos
        departamentos_empresa1.add(new Departamento(
            "Programación", 
            001, 
            "Planta A",
            empleadosProgramación_empresa1))
            ;
        departamentos_empresa1.add(new Departamento(
            "Marketing",
            002,
            "Planta B",
            empleadosProgramación_empresa1)
            );
        departamentos_empresa1.add(new Departamento(
            "Diseño gráfico", 
            003,
            "Planta B",
            empleadosDiseñoGráfico_empresa1));
        departamentos_empresa1.add(new Departamento(
            "Dirección y Gestión", 
            004,
            "Planta A",
            empleadosDiseñoGráfico_empresa1));
    
        
        Empresa empresa1 = new Empresa("Dancyn", 342567488, direccion_Empresa1, departamentos_empresa1);

        System.out.println(empresa1.nombre );
        System.out.println(empresa1.direccion );
        System.out.println(empresa1.departamentos);
        System.out.println(empresa1.numeroEmpleados());

    }
}