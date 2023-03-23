package Ej3Bridge;

public class Paquete {
    private int precio;
    private String nombre;
    private int peso;

    
    public Paquete(int precio, String nombre, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setNombrePaquete(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPrecio() {
        return precio;
    }
    public String getNombrePaquete() {
        return nombre;
    }
    public int getPeso() {
        return peso;
    }
}
