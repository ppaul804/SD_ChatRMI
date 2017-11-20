package comum;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro {
    private static String SERVIDOR = "localhost";
    private static Integer PORTA = 1099;
    private static String SERVICO = "ServicoMensagens";
    
    private String msgRecebida = "Sem mensagem";
    
    public static String getURI(){
        String uri = String.format("rmi://%s:%d/$s", SERVIDOR, PORTA, SERVICO);
        return uri;
    }

    public MensageiroImpl() throws RemoteException {
        super();
    }
    
    public void enviarMensagem(String mensagem) throws RemoteException {
        System.out.println(mensagem);
        msgRecebida = mensagem;
    }
    
    public String lerMensagem() throws RemoteException {
        return msgRecebida;
    }        
    
}
