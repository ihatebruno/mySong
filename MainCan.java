public class MainCan {

    public static void main(String[] args) {
        // Crear un objeto Cancion.
        Cancion miCancion = new Cancion();

        // Llamar al método crearCancion para que el usuario ingrese los detalles de la canción.
        miCancion.crearCancion();

        // Imprimir la representación en cadena del objeto Cancion.
        System.out.println(miCancion.toString());
    }
}
