package Ej3Bridge;

public class EnvioTierra implements ImplementorEnvio{
    @Override
    public double aumentoPrecio() {
        return 2.05;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio mediante Tierra";
    }   
}
