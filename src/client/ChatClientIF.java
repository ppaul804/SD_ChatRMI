package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientIF extends Remote {

    void retrieveMessages(String message) throws RemoteException;//recebe as mensagens
}
