package Ej1Adapter;

public class AutoElectrico {
    private int capacidadCarga;
    private int estadoElectricidad;
    
    public void cargar(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public int estadoDeElectricidad() {
        this.estadoElectricidad = (int)(Math.random() * 10) + 1;
        return this.estadoElectricidad;
    }

    public void showInfo(){
        System.out.println("Capacidad Auto Electrico: "+this.capacidadCarga+" , combustible de: "+ this.estadoElectricidad);
    }
}
