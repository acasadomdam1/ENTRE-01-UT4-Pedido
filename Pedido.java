


/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 * 
 * @author Aimar Casado
 * 
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente, LineaPedido linea1, LineaPedido linea2)    
    {
         this.fecha = fecha;
         this.cliente = cliente;
         this.linea1 = linea1;
         this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() 
    {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() 
    {
         return cliente;
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() 
    {
         double importeSinIva;
         
         importeSinIva = linea1.getProducto().getPrecio() * linea1.getCantidad();
         importeSinIva += linea2.getProducto().getPrecio() * linea2.getCantidad();
         
         return importeSinIva;
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() 
    {
         double iva;
         
         iva = getImporteAntesIva() * IVA;
         
         return iva;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal()
    {
         double importeConIva;
         
         importeConIva = getImporteAntesIva() + getIva();
         
         return importeConIva;
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() 
    {
        String cadenaFormateada;
        
        cadenaFormateada = String.format("FECHA PEDIDO: %s \n", fecha.toString());
        cadenaFormateada += String.format("DATOS DEL CLIENTE \n%s \n", cliente.toString());
        cadenaFormateada += String.format("**** Artículos en el pedido **** \n\n%s\n%s\n\n", linea1.toString(), linea2.toString());
        cadenaFormateada += String.format("**** A pagar **** \n\n");
        cadenaFormateada += String.format("%20s: %8.2f€", "IMPORTE SIN IVA", getImporteAntesIva()) + "\n";
        cadenaFormateada += String.format("%20s: %8.2f€", "IVA", getIva()) + "\n";
        cadenaFormateada += String.format("%20s: %8.2f€", "IMPORTE TOTAL", getImporteTotal()) + "\n";
        
        return cadenaFormateada;
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) 
    {
         return fecha.antesQue(otro.getFecha());
    }
    
    /**
     * devuelve una referencia al pedido actual
     */
    public Pedido getPedidoActual() 
    {
        return this;
    }

}
