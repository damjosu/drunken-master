
/**
 * Clase con la que podras crear copas con distintas bebidas y niveles de alcohol.
 */
public class Cubata
{
    //Tipo de bebida.
    private String bebida;
    //Cantidad de alcohol de la bebida.
    private float cantidad;

    /**
     * Crea una bebida de un tipo específico y con un nivel de alcohol específico.
     */
    public Cubata(String bebida, float cantidad)
    {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }
   
    /**
     * Te devuelve la cantidad de alcohol de la bebida.
     */
    public float saberCantidad()
    {
        return cantidad;
    }
    
}