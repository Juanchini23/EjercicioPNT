package entidades;

public class Shampoo extends Producto{

    private Integer contenido;

    public Shampoo(){}

    public Shampoo(Long id, String nombre, Double precio, Integer contenido) {
        super(id, nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+ super.getNombre() + " /// Contenido: " + this.contenido + " /// Precio: " + super.getPrecio();
    }
}
