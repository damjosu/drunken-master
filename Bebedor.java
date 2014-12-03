
/**
 * Clase con la que puedes crear a un objeto bebedor, con un nivel especifico de alcohol en sangre, 
 * con su nombre, saber su tolerancia al alcohol, hacerle preguntas y darle bebidas.
 */
public class Bebedor
{
    //Nivel de alcohol en sangre.
    private int nivelSangre;
    //Limite de alcohol.
    private int limite;
    //Nombre del bebedor.
    private String nombre;
    //Si ha sobrepasado el limite de alcohol o no.
    private Boolean sobrepasaLimite;
    //Pregunta que haces al bebedor
    private String pregunta;
    
    /**
     * Crea un bebedor con su nombre y limite máximo de alcohol permitido.
     */
    public Bebedor(String nombre, int limite)
    {
        this.nombre = nombre;
        this.limite = limite;
        sobrepasaLimite = false;
        pregunta = null;
    }
}