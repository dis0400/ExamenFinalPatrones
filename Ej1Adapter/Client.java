package Ej1Adapter;

public class Client {
    public static void main(String[] args) {
        IAuto auto1 = new AutoGasolina();
        auto1.llenarGasolina(60);
        auto1.estadoDelCombustible();
        auto1.showInfo();

        IAuto auto2 = new AutoDiesel();
        auto2.llenarGasolina(50);
        auto2.estadoDelCombustible();
        auto2.showInfo();


        IAuto auto3 = new AutoGasolinaEspecial();
        auto3.llenarGasolina(90);
        auto3.estadoDelCombustible();
        auto3.showInfo();

        AutoElectrico autoElectrico = new AutoElectrico();
        Adapter auto4 = new Adapter(autoElectrico);
        auto4.llenarGasolina(90);
    }
}
