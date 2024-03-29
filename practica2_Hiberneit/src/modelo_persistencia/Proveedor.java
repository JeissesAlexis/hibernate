package modelo_persistencia;
// Generated 10/10/2019 07:24:37 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private int idProducto;
     private String descripcion;
     private Set productos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(int idProducto, String descripcion) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
    }
    public Proveedor(int idProducto, String descripcion, Set productos) {
       this.idProducto = idProducto;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


