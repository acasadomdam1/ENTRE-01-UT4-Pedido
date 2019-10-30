
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   
 *  @author Aimar Casado
 *   
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;
     

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto,int cantidad)    
    {
         this.producto = producto;
         this.cantidad = cantidad;
    }

     /**
     * accesor para el producto
     */
    public Producto getProducto() 
    {
         return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() 
    {
        return cantidad;
    }
    
    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido obtenerCopia() 
    {
        return new LineaPedido(new Producto(producto.getNombre(), producto.getPrecio()), cantidad);
    }
    
    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() 
    {
        String cadenaFormateada;
        
        cadenaFormateada = producto.toString();
        cadenaFormateada += String.format(" | %4d unidades", cantidad);
        
        return cadenaFormateada;
    }
}
