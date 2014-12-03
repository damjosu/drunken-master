
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
    
    /**
     * Da una bebida de un tipo específico al bebedor, en caso de que no pueda beber más te lo dirá.
     */
    public void darBebida(Cubata bebida)
    {
        int nivelBebida = bebida.saberCantidad();
        if ((nivelSangre + nivelBebida) < limite)
        {            
            nivelSangre = nivelSangre + nivelBebida;            
        }
        else
        {
            System.out.println("No puedo beber más");
            sobrepasaLimite = true;            
        } 
    }
    
    /**
     * Devuelve el nivel de alcohol en sangre del bebedor.
     */
    public int medirNivel()
    {
        return nivelSangre;
    }
    
    /**
     * Permite hacer una pregunta al bebedor, a la cual respondera con un Si o No dependiendo de la paridad del numero de letras de 
     * la pregunta en caso de que no sobrepase el limite de alcohol, y en caso contrario repetira la pregunta que se le hizo pero gritando.
     */
    public void preguntar(String pregunta)
    {
        if ((sobrepasaLimite == true) || (pregunta.contains(nombre)))        
        {
            System.out.println(pregunta.toUpperCase());
        }
        else
        {
            int numeroLetras = pregunta.length();
            int paridad = (numeroLetras % 2);
            
            if (paridad == 0)
            {
                System.out.println("Si");                
            }            
            else
            {
                System.out.println("No");  
            }
            
        }
    }
    
}