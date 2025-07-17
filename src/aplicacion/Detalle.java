
package aplicacion;

public class Detalle {
    private Producto producto;
    private int cantidad;
    
    public Detalle(Producto producto, int cantidad){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    public double calcularSubtotal(){
        double subtotal = cantidad * producto.getPrecioUnitario();
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
