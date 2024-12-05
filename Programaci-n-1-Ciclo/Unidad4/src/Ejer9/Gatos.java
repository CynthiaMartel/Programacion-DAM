package Ejer9;

import java.util.List;


public class Gatos extends Mascotas {

    //atributos
    protected String pelaje;
    protected String raza;
    
    //Listas de razas
    protected static final List<String> RAZAS_SIN_PELO = List.of("esfinge", "elfo", "donskoy");
    protected static final List<String> RAZAS_PELO_LARGO = List.of("angora", "himalayo", "balines", "somali");
    protected static final List<String> RAZAS_PELO_CORTO = List.of("azul ruso", "britanico", "manx", "devon rex"    );
    //Constructores
    public Gatos(String nombre, int edad, String color, String pelaje, String raza){
        super(nombre, edad, color);
        this.pelaje = pelaje;
        this.raza = raza;
        // Validar pelaje y raza
        if (validarPelajeyRaza(pelaje, raza)) {
            this.raza = raza; // Raza válida
        } else {
            this.raza = "Desconocida"; // Raza no válida
            System.out.println("Error: La raza \"" + raza + "\" no es válida para el pelaje \"" + pelaje + "\".");
        }   
    }
    
    public boolean validarPelajeyRaza(String pelaje, String raza){
        switch(pelaje){
            case "sin pelo":
                return RAZAS_SIN_PELO.contains(raza);
            
            case "pelo largo":
                return RAZAS_PELO_LARGO.contains(raza);

            case "pelo corto":
                return RAZAS_PELO_CORTO.contains(raza);
            
            default:
                return false;
        }
    }

    //setters
    public void setPelaje(){
        this.pelaje = pelaje;
    }
    public void setRaza(){

    }
    //getters
    public String getPelaje(){
        return this.pelaje;
    }
    @Override
    public String tipoSonido(){
        return "Los gatos maullan y ronronean";
    }
    @Override
    public String toString(){
        return super.toString() + 
        "Pelaje: " + pelaje + "\n" +
        "Raza: "+ (raza.equals("Desconocida") ? "No válida" : raza) +"\n";
    }
    
}
