package modelo;

public class Almacen {
    
    public Libro[] libros = null;
    private int contadordeLibros = 0;

    public Almacen(int filas) {
        libros = new Libro[filas];
    }
    

    public void anadirLibro(Libro l){
        libros[contadordeLibros] = l;
        contadordeLibros++;
    }


    public int getContadordeLibros() {
        return contadordeLibros;
    }


    public void setContadordeLibros(int contadordeLibros) {
        this.contadordeLibros = contadordeLibros;
    }
    

}
