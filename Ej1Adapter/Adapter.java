package Ej1Adapter;

public class Adapter implements IAuto {
    private AutoElectrico autoElectrico;

    public Adapter(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void llenarGasolina(int capacidad) {
    
        System.out.println("Este auto no utiliza gasolina");
    }

    @Override
    public int estadoDelCombustible() {

        int porcentaje = this.autoElectrico.estadoDeElectricidad() * 10;
        System.out.println("El estado del combustible es: " + porcentaje + "%");
        return porcentaje;
    }

    @Override
    public void showInfo() {
    }
}