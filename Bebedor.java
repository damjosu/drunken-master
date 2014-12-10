
/**
 * Clase con la que puedes crear a un objeto bebedor, con un nivel especifico de alcohol en sangre, 
 * con su nombre, saber su tolerancia al alcohol, hacerle preguntas y darle bebidas.
 */
public class Bebedor
{
    //Nivel de alcohol en sangre.
    private float nivelSangre;
    //Limite de alcohol.
    private float limite;
    //Nombre del bebedor.
    private String nombre;
    //Si ha sobrepasado el limite de alcohol o no.
    private Boolean sobrepasaLimite;
    //Pregunta que haces al bebedor
    private String pregunta;
    //Hora a la que se toma una copa
    private int hora;
    //Minutos a los que se toma una copa
    private int minutos;
    //Tiempo
    private String tiempo;
   
    
    /**
     * Crea un bebedor con su nombre y limite máximo de alcohol permitido.
     */
    public Bebedor(String nombre, float limite)
    {
        this.nombre = nombre;
        this.limite = limite;
        sobrepasaLimite = false;
        pregunta = null;
        hora = 0;
        minutos = 0;
    }
    
    /**
     * Da una bebida de un tipo específico al bebedor, en caso de que no pueda beber más te lo dirá.
     */
    public void darBebida(Cubata bebida, int hora, int minutos)
    {
        float nivelBebida = bebida.saberCantidad();
        if ((nivelSangre) < limite)
        {            
            nivelSangre = nivelSangre + nivelBebida;  
            this.hora = hora;
            this.minutos = minutos;
            actualizarTiempo();
        }
        else
        {
            System.out.println("No puedo beber mas");
            sobrepasaLimite = true;            
        } 
    }
    
    /**
     * Devuelve el nivel de alcohol en sangre del bebedor.
     */
    public float medirNivel()
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
    
    /**
     * Te dice si el tiempo introducido es correcto o no.
     */
    private boolean actualizarTiempo()
    {
        boolean valido = false;
        if (hora < 24 && minutos < 60 && hora >= 0 && minutos >= 0)
        {
            this.hora = hora;
            this.minutos = minutos;
            valido = true;
        }
        
        else
        {
            System.out.println("la hora introducida no es correcta");
        }
        return valido;
    }
    
    /**
     * Te devuelve la hora actual.
     */
    public void getTiempo()    
    {
        if (actualizarTiempo())
        {
            tiempo = hora + ":" + minutos;
            System.out.println(tiempo);
        }
        else
        
            if (medirNivel() > 0) 
            {
                System.out.println("Hora introducida incorrecta");
            }
            
            else
            {
                System.out.println("Aun no ha bebido nada");
            }
        
    }
    
    /**
     * Avanza una hora reduciendo el nivel en sangre hasta que est� sobrio.
     */
    public void avanzarUnaHora()
    {
        nivelSangre = (nivelSangre - 0.5f);
        if (nivelSangre < 0)
        {
            System.out.println("Ya est� sobrio");
        }
        
        if ((hora + 1) ==  24)
        {
            hora = 0;
        }
        else
        {
            hora = (hora + 1);
        }
                
    }
        
}