/**
 *  
 * Modela un producto. Todo producto tiene un nombre y un  precio unidad 
 * 
 * @author Aimar Casado
 * 
 */
public class Producto
{
    private String nombre;
    private double precio;  // precio unidad del producto

    /**
     * Constructor  
     */
    public Producto(String nombre, double precio)    
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * accesor para el nombre del producto
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * accesor para el precio unidad del producto
     */
    public double getPrecio() 
    {
        return precio;
    }
    
    /**
     * obtiene un nuevo producto copia idéntica del actual
     */
    public Producto obtenerCopia() 
    {
         return new Producto(nombre, precio);
    }

    /**
     * Representación textual de un producto
     * (ver enunciado)
     */
    public String toString() 
    {
        String cadenaFormateada;
        
        cadenaFormateada = String.format("%30s | %8.2f€ unidad", nombre, precio);
        
        return cadenaFormateada;
    }

}
