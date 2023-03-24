package Ej3Bridge;

public class EmpresaSRL extends EAbstraction{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("EmpresaSRL> enviando "+paquete.getNombrePaquete()+
        " con precio de "+
        (int)(mImplementorEnvio.aumentoPrecio()*paquete.getPrecio())+" Bs por "+mImplementorEnvio.nombreFormaEnvio());
    }
}
