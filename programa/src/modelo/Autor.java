package modelo;

public class Autor {

    private String nombre;
    private String apellido;
    private boolean premio;


    
    public Autor(String nombre, String apellido, boolean premio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.premio = premio;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public boolean isPremio() {
        return premio;
    }
    public void setPremio(boolean premio) {
        this.premio = premio;
    }


}
