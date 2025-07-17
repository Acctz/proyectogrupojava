
package aplicacion;

public class Factura {
    private String numeroFactura;
    private String fechaEmision;
    private Cliente cliente;
    private Detalle[] detalles = new Detalle[50];
    private int cantidadDetalles = 0;
    private double subtotal;
    private double igv;
    private double total;
    
    public void agregarDetalle(Producto producto, int cantidad){
        if (cantidadDetalles < detalles.length) {
            Detalle nuevoDetalle = new Detalle(producto, cantidad);
            detalles[cantidadDetalles]= nuevoDetalle;
            cantidadDetalles++;
        }
    }
    public void calcularTotales(){
        subtotal = 0;
        for (int i = 0; i < cantidadDetalles; i++) {
            subtotal += detalles[i].calcularSubtotal();
        }
        igv = subtotal * 0.18;
        total = subtotal + igv;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Detalle[] getDetalles() {
        return detalles;
    }

    public void setDetalles(Detalle[] detalles) {
        this.detalles = detalles;
    }

    public int getCantidadDetalles() {
        return cantidadDetalles;
    }

    public void setCantidadDetalles(int cantidadDetalles) {
        this.cantidadDetalles = cantidadDetalles;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
        
    }
   
   
