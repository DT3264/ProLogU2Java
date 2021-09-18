
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dani
 */
public class ProductoCompuesto extends Producto {
    
    public ArrayList<Producto> productos;
    
    public ProductoCompuesto(String nombreConjunto, String nombreIndividual, int precioConjunto, int precioIndividual, TipoProducto tipo, int cantidad) {
        super(nombreConjunto, precioConjunto, tipo);
        productos = new ArrayList<>();
        for(int i = 0; i < cantidad; i++){
            productos.add(new Producto(nombreIndividual, precioIndividual, tipo));
        }
    }
    
}
