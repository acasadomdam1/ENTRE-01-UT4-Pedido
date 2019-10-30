

/**
 *  Representa a un cliente que hace un pedido 
 *  
 *  @author Aimar Casado
 *  
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() 
    {
        return direccion;
    }

    /**
     * accesor para la ciudad
     */
    public String getCiudad() 
    {
        return ciudad;
    }

    /**
     * accesor para la provincia
     */
    public String getProvincia() 
    {
        return provincia;
    }

    /**
     * representación textual del cliente
     */
    public String toString() 
    {
        String cadenaFormateada;
        
        cadenaFormateada = String.format("%10s: %-10s \n", "NOMBRE", nombre);
        cadenaFormateada += String.format("%10s: %-10s \n", "DIRECCION", direccion);
        cadenaFormateada += String.format("%10s: %-10s \n", "CIUDAD", ciudad);
        cadenaFormateada += String.format("%10s: %-10s \n", "PROVINCIA", provincia);
        
        return cadenaFormateada;
    }
    
    /**
     * 
     */
    public void print() 
    {
        System.out.println(this.toString());
    }

}
