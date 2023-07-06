package proyectoend;

public class Producto {
    private String producto;
    private int idProducto;
    private int cantidad;
    private String Proveedor;

    public Producto(String producto, int idProducto, int cantidad, String Proveedor) {
        this.producto = producto;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.Proveedor = Proveedor; 
    }

    public Producto() {
        
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }
}
