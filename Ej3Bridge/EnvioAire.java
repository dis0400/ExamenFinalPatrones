package Ej3Bridge;

public class EnvioAire implements ImplementorEnvio{
    @Override
    public double aumentoPrecio() {
        return 1.10;
    }

    @Override
    public String nombreFormaEnvio() {
        return "Envio por medio aereo";
    }
}
