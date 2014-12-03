
/**
 * Clase con la que podras crear copas con distintas bebidas y niveles de alcohol.
 */
public class Cubata
{
    //Tipo de bebida.
    private String bebida;
    //Cantidad de alcohol de la bebida.
    private int cantidad;

    /**
     * Crea una bebida de un tipo específico y con un nivel de alcohol específico.
     */
    public Cubata(String bebida, int cantidad)
    {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }
   
    /**
     * Te devuelve la cantidad de alcohol de la bebida.
     */
    public int saberCantidad()
    {
        return cantidad;
    }
    
}