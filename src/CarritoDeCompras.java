
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Dani
 */
public class CarritoDeCompras {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public int calcularPrecioTotal() {
        int precio = 0;
        for (int i = 0; i < productos.size(); i++) {
            precio += productos.get(i).getPrecio();
        }
        return precio;
    }

    public int calcularPrecioTotalLambda() {
        return productos.stream().mapToInt(p -> p.getPrecio()).sum();
    }

    public int contarCantidadProductos() {
        return productos.stream().mapToInt(p -> 1).sum();
    }

    public ArrayList<Producto> filtrarProductosPorTipo(TipoProducto tipo) {
        ArrayList<Producto> filtrados = new ArrayList<Producto>();
        for (Producto producto : productos) {
            if (producto.getTipo() == tipo) {
                filtrados.add(producto);
            }
        }
        return filtrados;
    }

    public List<Producto> filtrarProductosPorTipoLambda(TipoProducto tipo) {
        Predicate<Producto> predicado = p -> p.getTipo() == tipo;
        return productos.stream()
                //                .filter(p -> p.tipo == tipo)
                .filter(predicado)
                .collect(Collectors.toList());
    }

    List<TipoProducto> obtenerTiposDeProductoDistintos() {

        Function<Producto, TipoProducto> mapper = p -> p.getTipo();
        return productos.stream()
                //                .map(p -> p.getTipo())
                .peek(p -> System.out.println("Antes del map: " + p))
                .map(mapper)
                .peek(t -> System.out.println("Después del map, antes del distinct: " + t))
                .distinct()
                .peek(t -> System.out.println("Después del distinct: " + t))
                .collect(Collectors.toList());
    }

    List<Producto> obtenerProductosDistintos() {
        return productos.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    List<Producto> obtenerProductosOrdenadosPorPrecio() {
        Comparator<Producto> comparador = Comparator.comparing(Producto::getPrecio);
        return productos
                .stream()
                .sorted(Comparator.comparing(Producto::getPrecio))
                //                .sorted(comparador)
                .collect(Collectors.toList());
    }

    List<Producto> obtenerProductosOrdenadosPorPrecioYNombre() {
        Comparator<Producto> comparador = Comparator
                .comparing(Producto::getPrecio)
                .thenComparing(Producto::getNombre);
        return productos
                .stream()
                .sorted(comparador)
                .collect(Collectors.toList());
    }

    List<Producto> obtenerProductosAplicandoDescuento(int prcDescuento, TipoProducto tipo) {
        return productos
                .stream()
                .peek(p -> p.setPrecio(p.getTipo() == tipo ? (p.getPrecio() * (100 - prcDescuento)) / 100 : p.getPrecio()))
                .collect(Collectors.toList());
    }

    public int obtenerTotalDelCarrito() {
        return productos
                .stream()
                .mapToInt(p -> p.getPrecio())
                // Comienza con 0 y acarrea el anterior + el actual
                .reduce(0, (prev, act) -> prev + act);
    }
    
    String obtenerProductosFormatoJSON() {
        return productos
                .stream()
                .map(p -> String.format("{ nombre:\"%s\", precio:%d, tipo:\"%s\"}", p.getNombre(), p.getPrecio(), p.getTipo()))
                //joining regresa un string uniendo todo lo recibido con ","
                .collect(Collectors.joining(","));
    }

    Map<TipoProducto, List<Producto>> obtenerProductosAgrupadosPorTipo() {
        return productos
                .stream()
                //GroupingBy regresa un map<Tipo, Lista<Producto>>
                // Con los productos agrupados
                .collect(Collectors.groupingBy(Producto::getTipo));
    }

    double obtenerPrecioPromedio() {
        return productos
                .stream()
                // Ageraging regresa el promedio de todos los valores
                .collect(Collectors.averagingDouble(Producto::getPrecio));
    }

    public void imprimeProductos() {
        productos
                .stream()
                .forEach(System.out::println);
    }

    public void imprimeProductosPorTipo(TipoProducto tipo) {
        productos
                .parallelStream()
                .filter(p -> p.getTipo() == tipo)
                .forEach(System.out::println);
    }

    public List<Producto> obtenerProductosEmpaquetados() {
        return productos
                .stream()
                .filter(p -> p instanceof ProductoCompuesto)
                .map(p -> ((ProductoCompuesto) p))
                .flatMap(pc -> pc.productos.stream())
                .collect(Collectors.toList());
    }
}
