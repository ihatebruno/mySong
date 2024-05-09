public class Cancion {
    String titulo; // Título de la canción.
    String autor; // Autor de la canción.

    public Cancion() {
    }

    // Constructor que inicializa el título y el autor de la canción.
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método toString para representar el objeto Cancion como una cadena de texto.
    @Override
    public String toString() {
        return "Cancion " + "titulo=" + titulo + ", autor=" + autor;
    }

    // Método para crear una canción solicitando al usuario el título y el autor.
    public void crearCancion(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo de la cancion");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        autor = leer.nextLine();
    }
}
