
package clases;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona person1 = new Persona();
        person1.nombre = "Juan";
        person1.apellido= "perez";
        person1.desplagarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        persona2.desplagarInformacion();
        persona2.nombre ="Karla";
        persona2.apellido ="Lara";
        persona2.desplagarInformacion();
        
    }
}
