package Ej3Bridge;

public class EmpresaSA extends EAbstraction{
    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("La EmpresaSA esta enviando "+paquete.getNombrePaquete()+
        ", precio de "+
        (int)(mImplementorEnvio.aumentoPrecio()*paquete.getPrecio())+" Bs por "+mImplementorEnvio.nombreFormaEnvio());
    }
}
