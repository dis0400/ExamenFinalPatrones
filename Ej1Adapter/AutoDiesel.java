package Ej1Adapter;

public class AutoDiesel implements IAuto {
    private int capacidad;
    private int estadoCombustible;

    @Override
    public void llenarGasolina(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int estadoDelCombustible() {
        this.estadoCombustible = (int) (Math.random() * 100) + 1;
        return this.estadoCombustible;
    }

    @Override
    public void showInfo() {
        System.out.println("Capacidad Auto Diesel: "+this.capacidad+", combustible de: "+ this.estadoCombustible );
    }
}
    

