package Ej3Bridge;

public class Client {
    public static void main(String[] args) {
        EnvioTierra envioTierra = new EnvioTierra();
        EnvioAire envioAire = new EnvioAire();
        EnvioMar envioAgua = new EnvioMar();

        Paquete paquete = new Paquete(130,"Paquete",7);

        EmpresaSA empresaSA = new EmpresaSA();
        EmpresaSRL empresaSRL = new EmpresaSRL();

        empresaSA.setFormaEnvio(envioTierra);
        empresaSA.enviarPaquete(paquete);

        empresaSRL.setFormaEnvio(envioAire);
        empresaSRL.enviarPaquete(paquete);


        empresaSA.setFormaEnvio(envioMar);
        empresaSA.enviarPaquete(paquete);
    }
}
