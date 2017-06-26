
/**
 * Write a description of class Encargado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encargado extends Trabajador
{
    // instance variables - replace the example below with your own
    private String turno;
    private Comercial Comercial1;
    Persona persona1 = new Persona();

    /**
     * Constructor for objects of class Trabajador
     */
    public Encargado()
    {
        // initialise instance variables
        turno = "mañana";
        Comercial1 = new Comercial();
    }

    /**
     * Metodos de modificacion de datos de Encargado
     */
    
    public void modificar_turno(String Nuevo_dato)
    {
        // put your code here
        turno = Nuevo_dato;
    }
    
        /**
     * Metodos para crear Comercial
     */
    
    public void crear_comercial()
    {
        // put your code here
        Comercial1 = new Comercial();
    }
    
        /**
     * Metodos para crear Persona
     */
    
    public void crear_persona()
    {
        // put your code here
        persona1.modificar_DNI("123");
    }
    
    public String turno()
    {
        // put your code here
        return turno;
    }
}
