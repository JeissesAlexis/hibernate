package modelo_persistencia;
// Generated 10/10/2019 07:24:37 PM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int idProducto;
     private Marca marca;
     private Presentacion presentacion;
     private Proveedor proveedor;
     private Zona zona;
     private int codigo;
     private String descripcionProducto;
     private double precio;
     private int stok;
     private int iva;
     private double peso;

    public Producto() {
    }

    public Producto(int idProducto, Marca marca, Presentacion presentacion, Proveedor proveedor, Zona zona, int codigo, String descripcionProducto, double precio, int stok, int iva, double peso) {
       this.idProducto = idProducto;
       this.marca = marca;
       this.presentacion = presentacion;
       this.proveedor = proveedor;
       this.zona = zona;
       this.codigo = codigo;
       this.descripcionProducto = descripcionProducto;
       this.precio = precio;
       this.stok = stok;
       this.iva = iva;
       this.peso = peso;
    }

    public Producto(Marca mar_res, Presentacion pre_res, Proveedor pro_res, Zona zon_res, int parseInt, String text, double parseDouble, int parseInt0, int parseInt1, double parseDouble0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Presentacion getPresentacion() {
        return this.presentacion;
    }
    
    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Zona getZona() {
        return this.zona;
    }
    
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }
    
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStok() {
        return this.stok;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getIva() {
        return this.iva;
    }
    
    public void setIva(int iva) {
        this.iva = iva;
    }
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }




}


