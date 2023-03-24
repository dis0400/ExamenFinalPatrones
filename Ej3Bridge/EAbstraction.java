package Ej3Bridge;

public abstract class EAbstraction {
    protected ImplementorEnvio mImplementorEnvio;

    public EAbstraction() {
        this.mImplementorEnvio = new EnvioTierra();
    }

    public void setFormaEnvio(ImplementorEnvio metodoImpPago) {
        this.mImplementorEnvio = metodoImpPago;
    }

    public abstract void enviarPaquete(Paquete paquete);

}