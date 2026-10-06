public class MainProducto {
        public static void main(String[] args) {

            Producto producto1 = new Producto();
            Producto producto2 = new Producto();

            producto1.nombre = "Mouse";
            producto1.precio = 20;
            producto1.categoria = "Tecnología";

            producto2.nombre = "Alexa";
            producto2.precio = 85;
            producto2.categoria = "Tecnologia";

            System.out.println("Producto 1");
            producto1.mostrarInformacion();
            producto1.mostrarCategoria();

            System.out.println("Producto 2");
            producto2.mostrarInformacion();
            producto2.mostrarCategoria();

            producto1.precio = 35;

            System.out.println("Ps9-Modifica el primer objeto");
            producto1.mostrarInformacion();
            producto2.mostrarInformacion();
        }
    }

