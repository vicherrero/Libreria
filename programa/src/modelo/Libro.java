package modelo;
public class Libro {

    public Autor autor = null;
    private String titulo;
    private int año;
    private int paginas;
    private float precio;

    public Libro(String nombre, String apellido, Boolean premio, String titulo, int año, int paginas, float precio) {
        autor = new Autor(nombre,apellido,premio);
        this.titulo = titulo;
        this.año = año;
        this.paginas = paginas;
        this.precio = precio;
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
