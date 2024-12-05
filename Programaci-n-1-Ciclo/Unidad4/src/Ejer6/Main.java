package Ejer6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mecanico> mecanicosEmpresa1 = new ArrayList<>();
            mecanicosEmpresa1.add(new Mecanico(
            "Juan Martel Alvarado", 
            657876456, 
            "Mantenimiento de motores")
            );
            mecanicosEmpresa1.add(new Mecanico(
                "Marcela Suárez Pérez", 
                657456345, 
                "Mantenimiento eléctrico")
            );
            mecanicosEmpresa1.add(new Mecanico(
                "Carla Suárez Martín", 
                6755780, 
                "Mantenimiento eléctrico")
            );
        ArrayList<Maquinista> maquinistasEmpresa1 = new ArrayList<>();
            maquinistasEmpresa1.add(new Maquinista(
                "Juan Ravelo", 
                457638, 
                1450.00, 
                "Maquinista experto"));
            maquinistasEmpresa1.add(new Maquinista(
                "Alberto Ravelo", 
                46567, 
                1450.00, 
                "Maquinista junnior"));
        ArrayList<JefeEstacion> jefeEstacionEmpresa1 = new ArrayList<>();        
            jefeEstacionEmpresa1.add(new JefeEstacion(
                "Manolo Zamora Tacoronte", 
                4567634, 
                "10/09/2003")
            );
            jefeEstacionEmpresa1.add(new JefeEstacion(
            "María del Mar Aguirre Salamanca", 
            4567634, 
            "25/05/2004")
            );
        
        ArrayList<Vagon> vagonesEmpresa1 = new ArrayList<>();
            vagonesEmpresa1.add(new Vagon(
                110, 
                800.9,
                560.76, 
                "Carga delicada"));
            vagonesEmpresa1.add(new Vagon(
                103, 
                800.9,
                450.76, 
                "Carga de maquinaria de construcción"));
            vagonesEmpresa1.add(new Vagon(
                104, 
                800.9,
                203.76, 
    
                "Carga de maquinaria de electrónica"));
    // Crear listas específicas de vagones para cada tren
    ArrayList<Vagon> vagonesTren1 = new ArrayList<>();
        vagonesTren1.add(vagonesEmpresa1.get(0));
        vagonesTren1.add(vagonesEmpresa1.get(1)); // Se puede añadir varios vagones

    ArrayList<Vagon> vagonesTren2 = new ArrayList<>();
        vagonesTren2.add(vagonesEmpresa1.get(2)); // Solo un vagón en este caso

    ArrayList<Locomotora> locomotorasEmpresa1 = new ArrayList<>();    
        locomotorasEmpresa1.add(new Locomotora(
            4763809, 
            768,
            2009, 
            mecanicosEmpresa1.get(0) ));
        locomotorasEmpresa1.add(new Locomotora(
            78940, 768,
            2007, 
            mecanicosEmpresa1.get(1) ));
        locomotorasEmpresa1.add(new Locomotora(
            4763809, 
            768,
            2016, 
            mecanicosEmpresa1.get(2) ));
        
    ArrayList<Tren> trenesEmpresa1 = new ArrayList<>();
    trenesEmpresa1.add(new Tren(locomotorasEmpresa1.get(0), vagonesTren1, maquinistasEmpresa1.get(0)));
    trenesEmpresa1.add(new Tren(locomotorasEmpresa1.get(1), vagonesTren2, maquinistasEmpresa1.get(1)));

    EmpresaFerroviaria empresa1 = new EmpresaFerroviaria("FerroExpress", 790654);
    // Agregar los datos a la empresa
    empresa1.setMecanicos(mecanicosEmpresa1);
    empresa1.setJefeEstacion(jefeEstacionEmpresa1);
    empresa1.setVagones(vagonesEmpresa1);
    empresa1.setLocomotoras(locomotorasEmpresa1);
    empresa1.setTrenes(trenesEmpresa1);
   
    // Mostrar información de la empresa
    System.out.println(empresa1.toString());
    }
}
