package entidades;

public class FrutaVerdura extends Producto{

    private String uDeVenta;

    public FrutaVerdura() {}

    public FrutaVerdura(Long id, String nombre, Double precio, String uDeVenta) {
        super(id, nombre, precio);
        this.uDeVenta = uDeVenta;
    }

    public String getuDeVenta() {
        return uDeVenta;
    }

    public void setuDeVenta(String uDeVenta) {
        this.uDeVenta = uDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: "+ super.getNombre() + " /// Precio: $" + super.getPrecio() + " /// Unidad de venta: " + this.uDeVenta ;
    }
}
