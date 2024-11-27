package Ejer1;

public class Persona {

    //Atributos
     protected int dni;
     protected String nombre;
     protected String apellidos;
     protected int edad;
    
     //Constructores
     public Persona(int dni, String nombre, String apellidos, int edad){
         this.dni = dni;
         this.nombre = nombre;
         this.apellidos = apellidos;
         this.edad = edad;
     }
     public int getDni(){
         return this.dni;
     }
     public String getNombre(){
         return this.nombre;
     }
     public String getApellidos(){
         return this.apellidos;
     }
     public int getEdad(){
         return this.edad;
     }
    
    static char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
     'N', 'J','Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     public static char asignarLetraDni(int dni){
         
         int letraUsuario = dni % 23;
         return LETRAS_DNI[letraUsuario];
    }

    public static boolean validarDni(int dni){
        if (Integer.toString(dni).length() == 8){
            return true;
        }
        else{
            return false;
        }
    }

    public void mostrarDatos(){
        System.out.println("--Datos personales--");
        System.out.println("DNI: " + this.dni + "-"+ asignarLetraDni(dni));
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        
    }
 }
 
