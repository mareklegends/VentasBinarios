
package ioDatos;

/**
 *
 * @author MarekLegends
 */
public class Ventas {
    private String cliente;
    private int producto;
    private int cantidad;
    private double precioUnitario;   

    public Ventas(String cliente, int producto, int cantidad, double precioUnitario) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
   
   
}
