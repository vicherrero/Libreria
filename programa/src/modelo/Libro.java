package modelo;
public class Libro {

    private String autor;
    private String titulo;
    private int año;
    private int paginas;
    private float precio;

    public Libro(String autor, String titulo, int año, int paginas, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.paginas = paginas;
        this.precio = precio;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
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
