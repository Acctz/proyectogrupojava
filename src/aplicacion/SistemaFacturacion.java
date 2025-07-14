
package aplicacion;


public class SistemaFacturacion {
    private Cliente[] clientes;
    private Producto[] productos;
    private int cantidadProductos;
    private Factura[] facturas;
    private int cantidadFacturas;
    
    public void registrarCliente(){
    }
    public void registrarProducto(String codigo, String nombre, double precioUnitario){
    }
    public int buscarCliente( String documento){
        int posicion = -1;
        return posicion;
    }
    public int buscarProducto( String codigo){
          int posicion = -1;
        return posicion;
    }
    public void registrarFactura(Factura factura){
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public int getCantidadFacturas() {
        return cantidadFacturas;
    }

    public void setCantidadFacturas(int cantidadFacturas) {
        this.cantidadFacturas = cantidadFacturas;
    }
    
}
