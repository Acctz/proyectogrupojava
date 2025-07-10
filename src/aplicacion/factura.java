
package aplicacion;

public class factura {
<<<<<<< HEAD

    public double[] getPreciosUnitarios() {
        return preciosUnitarios;
    }

    public void setPreciosUnitarios(double[] preciosUnitarios) {
        this.preciosUnitarios = preciosUnitarios;
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

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getClienteDocumento() {
        return clienteDocumento;
    }

    public void setClienteDocumento(String clienteDocumento) {
        this.clienteDocumento = clienteDocumento;
    }

    public int getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(int cantidadItems) {
        this.cantidadItems = cantidadItems;
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

    public String[] getCodigosProductos() {
        return codigosProductos;
    }

    public void setCodigosProductos(String[] codigosProductos) {
        this.codigosProductos = codigosProductos;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(int[] cantidades) {
        this.cantidades = cantidades;
    }
    
    private String numeroFactura;
    private String fechaEmision ;
    private String clienteNombre;
    private String clienteDocumento;
    private int cantidadItems;
    private double subtotal;
    private double igv;
    private double total;
    private String[] codigosProductos;
    private int[] cantidades;
    private double[] preciosUnitarios;
    

    
 public void agregarItem(String codigo, int cantidad, double precio){
    
        agrega un producto a la factura
    }

   public void calcularSubtotal(){
        subtotal = (cantidad[i] * precio[i]);
    }
   public void calcularIGV(){
       aplica IGV como 18% del subtotal
    }   
   public void calcularTotal(){
       total = (subtotal + igv);
     }
   public void mostrarFactura(){
           
      muestra todos los datos de la factura(cliente, ítems, totales)
    
    }
    
=======
    int[]a = new int[2];
>>>>>>> cfb7be777d2bc1e63994a1ba6ad5d89072c42c04
}
