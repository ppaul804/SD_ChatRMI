package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import client.ChatClientIF;

public interface ChatServerIF extends Remote {

    void registerChatClient(ChatClientIF chatClient) throws RemoteException;

    void broadcastMessage(String message) throws RemoteException;

}
