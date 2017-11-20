
package cliente;

import comum.Mensageiro;
import comum.MensageiroImpl;
import java.rmi.Naming;

public class MensageiroCliente {

    public static void main(String[] args) {
        try{
            Mensageiro mensageiro = (Mensageiro) Naming.lookup(MensageiroImpl.getURI());
            System.out.println(mensageiro.lerMensagem());
            if (args.length == 1) {
                mensageiro.enviarMensagem(args[0]);
            } else {
                mensageiro.enviarMensagem("Mensagem do cliente enviada ao servidor");
            }
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        
    }
    
}
