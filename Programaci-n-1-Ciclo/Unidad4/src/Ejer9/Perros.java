package Ejer9;
import java.util.List;

public class Perros extends Mascotas {
    //atributos
    protected double peso;
    protected boolean  muerde;
    protected String tamano;
    protected String raza;
    
    //Listas de razas
    protected static final List<String> RAZAS_PEQUENOS = List.of("caniche", "yorkshire terrier", "schnauzer", "chihuahua");
    protected static final List<String> RAZAS_MEDIANOS = List.of("collie", "dálmata", "bulldog", "galgo", "sabueso");
    protected static final List<String> RAZAS_GRANDES = List.of(" pastor alemán", "doberman", "rotweiller");
    
    //Constructores
    public Perros(String nombre, int edad, String color, String tamano, String raza, double peso, boolean muerde){
        super(nombre, edad, color);
        this.tamano = tamano; 
        this.raza = raza;
        // Validar en el constructor
        if (validarTamanoyRaza(tamano, raza)) {
            this.raza = raza; // Raza válida
        } else {
            this.raza = "Desconocida"; // Raza no válida
            System.out.println("Error: La raza \"" + raza + "\" no es válida para el tamano \"" + tamano + "\".");
        }   
        this.peso = peso; 
        this.muerde = muerde;
    }
    //metodos
    public boolean validarTamanoyRaza(String tamano, String raza){
        switch (tamano) {
            case "pequeño":
                return RAZAS_PEQUENOS.contains(raza);
                
            case "mediano":
            return RAZAS_MEDIANOS.contains(raza);

            case "grande":
            return RAZAS_GRANDES.contains(raza);
        
            default:
                return false;
        }
    }
    public boolean siMuerde(){
       return this.muerde;
    }
    @Override
    public String tipoSonido(){
        return "Los perros ladran";
    }
    @Override
    public String toString(){
        String muerdeTexto = muerde ? "¡Este Síperro muerde :(" : "¡Este perro NO muerde :)!";
        return super.toString() + 
        "Tamaño: " + tamano + "\n" +
        "Raza: "+ (raza.equals("Desconocida") ? "No válida" : raza) +"\n" +
        "Peso: " + peso + "\n" +
        "¿Muerde?" + muerdeTexto + "\n";
    }
}
