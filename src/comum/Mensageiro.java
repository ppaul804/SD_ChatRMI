package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensageiro extends Remote {
    public void enviarMensagem(String mensagem) throws RemoteException; //método para enviar mensagens
    public String lerMensagem() throws RemoteException; //método para ler mensagens
} 
