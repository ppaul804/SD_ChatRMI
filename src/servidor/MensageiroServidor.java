
package servidor;

import comum.Mensageiro;
import comum.MensageiroImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MensageiroServidor {

    public MensageiroServidor() throws RemoteException, MalformedURLException {
        try{
            Mensageiro mensageiro = (Mensageiro) new MensageiroImpl();
            Naming.rebind(MensageiroImpl.getURI(), (Remote) mensageiro);
            
        } catch (Exception e){
            System.out.println("Erro: "+e);
        }
    }
 
    public static void main(String[] args){
        try {
            new MensageiroServidor();
            System.out.println("Servidor rodando...");
        } catch (Exception e) {
            System.out.println("Erro: "+e);        
        }
    }
    
    
}
