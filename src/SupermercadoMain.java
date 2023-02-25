import entidades.FrutaVerdura;
import entidades.Gaseosa;
import entidades.Producto;
import entidades.Shampoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SupermercadoMain {
    public static void main(String[] args){

        List<Producto> productos = setProductos();
        for(Producto p : productos){
            System.out.println(p.toString());
        }
        System.out.println("=============================");
        Collections.sort(productos);
        System.out.println("Producto mas caro: " + productos.get(productos.size()-1).getNombre());
        System.out.println("Producto mas barato: " + productos.get(0).getNombre());
    }

    private static List<Producto> setProductos (){
        List<Producto> lista = new ArrayList<>();
        Producto p1 = new Gaseosa(1L, "Coca-Cola Zero", 20.0, 1.5);
        Producto p2 = new Gaseosa(2L, "Coca-Cola", 18.0, 1.5);
        Producto p3 = new Shampoo(3L, "Shampoo Sedal", 19.0, 500);
        Producto p4= new FrutaVerdura(4L, "Frutillas", 64.0, "kilo");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        return lista;
    }
}
