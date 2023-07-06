package proyectoend;

public class Inventario{
    private Producto producto;
    
    public Inventario(Producto producto){
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
