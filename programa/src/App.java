import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import modelo.Libro;
import modelo.Autor;
import modelo.Almacen;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tecla;
        int ritmoLectura = 1;
        int filas;
        int i,j,k;
        Almacen almacen= null;
        do{
            System.out.println("|--------------------------------|");
            System.out.println("|MIS LIBROS                      |");
            System.out.println("|--------------------------------|");
            System.out.println("    1) Nuevo almacén de libros");
            System.out.println("    2) Establecer ritmo de lectura (páginas por minuto)");
            System.out.println("    3) Añadir un nuevo libro al almacén");
            System.out.println("    4) Mostrar información actual de libros");
            System.out.println("    5) Salir (se borrará toda la información)");
            System.out.println("|--------------------------------|");
            System.out.println("\nSeleccione una opción (1-5):");

            tecla = scanner.nextInt();

            switch (tecla) {
                case 1:
                    filas = Esdia.readInt("Introduce el tamaño del nuevo almacen de libros:\n");
                    System.out.printf("El nuevo almacen es capaz de almacenar hasta %d libros\n\n",filas);
                    almacen = new Almacen(filas);
                    Thread.sleep(2000);
                    break;
                case 2:
                    ritmoLectura = Esdia.readInt("Introduce un nuevo ritmo de lectura:\n");
                    System.out.printf("El nuevo ritmo de lectura es de: %d paginas por minuto\n\n",ritmoLectura);
                    Thread.sleep(2000);
                    break;
                case 3:
                    if (almacen.libros.length - almacen.getContadordeLibros() == 0) {
                        System.out.println("Almacen lleno");
                        break;
                    }
                    String titulo = Esdia.readString("Intrudoce el titulo del libro: ");
                    int año = Esdia.readInt("Introduce el año en el que el libro fue publicado: ");
                    String nombre = Esdia.readString("Como se llama el autor: ");
                    String apellido = Esdia.readString("Como se apellida el autor: ");
                    int premio = Esdia.readInt("Gano el premio planeta?? (si es sí introduce 1, si no introduce 0): ");
                    boolean premioB = (premio == 1);
                    int pagina = Esdia.readInt("Cuantas paginas tiene el libro: ");
                    float coste = Esdia.readFloat("Cuanto vale el libro: ");
                    Libro book=new Libro(nombre, apellido, premioB, titulo, año, pagina, coste);
                    almacen.anadirLibro(book);
                    break;
                case 4:
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| LIBROS EN EL ALMACÉN |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| Título |  Año Publicación  | Autor  |  Premio planeta  |  Páginas | Tiempo lectura minutos | Precio|");
                    for(i=0;i<almacen.getContadordeLibros();i++){
                        if(almacen.libros[i].autor.isPremio()== true){
                        System.out.printf("%s     %d   %s %s     SI     %d      %d      %f\n", almacen.libros[i].getTitulo(),almacen.libros[i].getAño(),almacen.libros[i].autor.getNombre(),almacen.libros[i].autor.getApellido(),almacen.libros[i].getPaginas(),ritmoLectura,almacen.libros[i].getPrecio());
                        } 
                       else{
                         System.out.printf("%s     %d   %s %s     NO     %d      %d      %f\n", almacen.libros[i].getTitulo(),almacen.libros[i].getAño(),almacen.libros[i].autor.getNombre(),almacen.libros[i].autor.getApellido(),almacen.libros[i].getPaginas(),ritmoLectura,almacen.libros[i].getPrecio());
                        }
                    }
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.printf("| TIEMPO DE LECTURA TOTAL                                                                  $%d   |",ritmoLectura);
                    System.out.printf("| PRECIO TOTAl |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    break;
                case 5:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("NUMERO INCORRECTO, TIENE QUE ESTAR COMPRENDIDO ENTRE 1 Y 5, VUELVE A INGRESAR\n\n");
                    break;
            }
    }while(tecla != 5);    
 }
}
