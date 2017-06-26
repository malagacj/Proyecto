
/**
 * Write a description of class Trabajador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajador extends Personas
{
    // instance variables - replace the example below with your own
    private int numero_de_trabajador;

    /**
     * Constructor for objects of class Trabajador
     */
    public Trabajador()
    {
        // initialise instance variables
        numero_de_trabajador = 123456789;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public void modificar_numero_de_trabajador(int Nuevo_dato)
    {
        // put your code here
        numero_de_trabajador = Nuevo_dato;
    }
    
    
    
    
    public int numero_de_trabajador()
    {
        // put your code here
        return numero_de_trabajador;
    }
}
