
package aplicacion;


public class SistemaFacturacion {
    private Cliente[] clientes = new Cliente[50];
    private int cantidadClientes = 0;
    private Producto[] productos = new Producto[50];
    private int cantidadProductos = 0;
    private Factura[] facturas = new Factura[50];
    private int cantidadFacturas = 0;
    
    public void registrarCliente(String documento, String nombre, String direccion, String telefono){
        if (cantidadClientes < clientes.length) {
            clientes[cantidadClientes] = new Cliente(documento, nombre, direccion, telefono);
            cantidadClientes ++;
        }
    }
    public void registrarProducto(String codigo, String nombre, double precioUnitario){
         if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = new Producto(codigo, nombre, precioUnitario);
            cantidadProductos++;
         }
    }
    public int buscarCliente(String documento){
         int posicion = -1;
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].getDocumento().equals(documento)) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int buscarProducto(String codigo){
          int posicion = -1;
          for (int i = 0; i < cantidadProductos; i++) {
              if (productos[i].getCodigo().equals(codigo)) {
                  posicion = i;
              }
        }
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
    
    public int getCantidadClientes(){
        return cantidadClientes;
    }
    
    public void setCantidadClientes(int cantidadClientes){
        this.cantidadClientes = cantidadClientes;
    }
    
}
