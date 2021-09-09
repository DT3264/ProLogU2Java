import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dani
 */
public class CarritoDeCompras {
    ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public int calcularPrecioTotal(){
        int precio = 0;
        for(int i=0; i<productos.size(); i++){
            precio += productos.get(i).getPrecio();
        }
        return precio;
    }
    
    public int calcularPrecioTotalLambda(){
        return productos.stream().mapToInt(p -> p.getPrecio()).sum();
    }
    
    public int contarCantidadProductos(){
        return productos.stream().mapToInt(p -> 1).sum();
    }
    public ArrayList<Producto> filtrarProductosPorTipo(TipoProducto tipo){
        ArrayList<Producto> filtrados = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if( producto.getTipo() == tipo){
                filtrados.add(producto);
            }               
        }
        return filtrados;        
    } 
     public List<Producto> filtrarProductosPorTipoLambda(TipoProducto tipo){
        return productos.stream()
                .filter(p -> p.tipo == tipo)
                .collect(Collectors.toList());
    } 
     
     List<TipoProducto> obtenerTiposDeProductoDistintos(){
        return productos.stream()
                .map(p -> p.getTipo())
                .distinct()
                .collect(Collectors.toList());
    }
     
    List<Producto> obtenerProductosDistintos(){
        return productos.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
