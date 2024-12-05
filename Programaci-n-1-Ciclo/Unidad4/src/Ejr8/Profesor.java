package Ejr8;

public class Profesor extends Persona {
    
    //atributos
    protected String departamentos;
    protected String categoria;
    
    //Herencia
    public Profesor(){
        super("nombre", "direccion");  // en este caso, hay que pasarle a super, los constructores parametrizados que ya están en persona
    }

    //Constructores
    public Profesor(String nombre, String direccion, String departamentos, String categoria){
        super(nombre, direccion); //le pasamos con super, la herencia de la clase Persona que ya están predeterminados en nuestro código
        this.departamentos = departamentos;
        this.categoria = categoria;
    }
    
    //getters
    public String getDepartamentos(){
        return this.departamentos;
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    //setters
    public void setDepartamentos(String departamentos){
        this.departamentos = departamentos;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    @Override
    public String toString(){
        return super.toString() + 
                "----Profesor ----" +  "\n" +
                "Departamento: " + departamentos + "\n" +
                "Categoria: " + categoria + "\n";
        
    }

}
