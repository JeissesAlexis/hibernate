package modelo_persistencia;
// Generated 10/10/2019 07:24:37 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca  implements java.io.Serializable {


     private int idMarca;
     private String descripccion;
     private Set productos = new HashSet(0);

    public Marca() {
    }

	
    public Marca(int idMarca, String descripccion) {
        this.idMarca = idMarca;
        this.descripccion = descripccion;
    }
    public Marca(int idMarca, String descripccion, Set productos) {
       this.idMarca = idMarca;
       this.descripccion = descripccion;
       this.productos = productos;
    }

    public Marca(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public int getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    public String getDescripccion() {
        return this.descripccion;
    }
    
    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


