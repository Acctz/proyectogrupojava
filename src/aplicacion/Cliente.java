
package aplicacion;

public class Cliente {
    private String nombre;
    private String documento;
    private String direccion;
    private String telefono;
    
    public Cliente(){
    }
    
    public Cliente( String documento, String nombre, String direccion, String telefono){
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    
    
    
}
