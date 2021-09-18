
/**
 *
 * @author Dani
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
//        carrito.agregarProducto(new Producto("Bigode de chocolate", 16, TipoProducto.BEBIDA));
        carrito.agregarProducto(new Producto("Takis fuego", 12, TipoProducto.FRITURA));
        carrito.agregarProducto(new Producto("Takis huacamole", 12, TipoProducto.FRITURA));
        carrito.agregarProducto(new Producto("Pringles de queso 100gr", 18, TipoProducto.FRITURA));
//        carrito.agregarProducto(new Producto("Pollo fresco 500gr", 50, TipoProducto.CARNES_FRIAS));
//        carrito.agregarProducto(new Producto("Bistek 250gr", 50, TipoProducto.CARNES_FRIAS));
//        carrito.agregarProducto(new Producto("Libreta prof. 100 Hojas scribe", 18, TipoProducto.PAPELERIA));
//        carrito.agregarProducto(new Producto("Libreta francesa scribe", 29, TipoProducto.PAPELERIA));
//        
//        carrito.agregarProducto(new Producto("Pringles originales 100gr", 18, TipoProducto.FRITURA));
//        carrito.agregarProducto(new Producto("Rufles originales 68gr", 13, TipoProducto.FRITURA));
//        carrito.agregarProducto(new Producto("Doritos rojos 56gr", 13, TipoProducto.FRITURA));
//        carrito.agregarProducto(new Producto("Rufles de queso 68gr", 13, TipoProducto.FRITURA));
//        
//        carrito.agregarProducto(new ProductoCompuesto("Paquete maruchan de pollo 4pz", "Maruchan de pollo", 40, 10, TipoProducto.FRITURA, 4));
//        carrito.agregarProducto(new ProductoCompuesto("Paquete gatorade morado 4pz", "Gatorade morado", 42, 12, TipoProducto.BEBIDA, 4));
//        
//        System.out.println("Elementos en el carrito " + carrito.contarCantidadProductos());
//        System.out.println("Total en el carrito " + carrito.calcularPrecioTotal());
//        System.out.println("Total en el carrito con lambda " + carrito.calcularPrecioTotalLambda());
//        System.out.println("Elementos de tipo papelería en el carrito " + carrito.filtrarProductosPorTipoLambda(TipoProducto.PAPELERIA).size());
//        System.out.println("Los tipos de producto distintos en el carrito son " + carrito.obtenerTiposDeProductoDistintos());
//        System.out.println("Los productos distintos en el carrito son: " + carrito.obtenerProductosDistintos());
//        System.out.println("Los productos ordenados por precio son\n" + carrito.obtenerProductosOrdenadosPorPrecio());
//        System.out.println("Los productos ordenados por precio y luego nombre son\n" + carrito.obtenerProductosOrdenadosPorPrecioYNombre());
//        System.out.println("Productos de papeleria con descuento del 10%:\n" + carrito.obtenerProductosAplicandoDescuento(10, TipoProducto.PAPELERIA));
//        System.out.println("El total del carrito es:\n" + carrito.obtenerTotalDelCarrito());
//        System.out.println("Los productos en formato json son:\n" + carrito.obtenerProductosFormatoJSON());
//        System.out.println("Los productos agrupados por tipo son:\n" + carrito.obtenerProductosAgrupadosPorTipo());
//        System.out.println("El precio promedio del carrito es:\n" + carrito.obtenerPrecioPromedio());
//        System.out.println("Imprimiendo productos");
//        carrito.imprimeProductos();
//        System.out.println("Imprimiendo productos de tipo Frituras en paralelo (no necesariamente ordenados)");
//        carrito.imprimeProductosPorTipo(TipoProducto.FRITURA);
//        System.out.println("Los productos empaquetados son:\n" + carrito.obtenerProductosEmpaquetados());

    }

}
