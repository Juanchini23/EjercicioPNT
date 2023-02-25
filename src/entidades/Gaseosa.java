package entidades;

public class Gaseosa extends Producto{

    private Double litros;

    public Gaseosa(){}

    public Gaseosa(Long id, String nombre, Double precio, Double litros) {
        super(id, nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: "+ super.getNombre() + " /// Litros: " + this.litros + " /// Precio: " + super.getPrecio();
    }
}
