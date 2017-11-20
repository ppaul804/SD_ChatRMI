package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import client.ChatClientIF;

public class ChatServer extends UnicastRemoteObject implements ChatServerIF {

    private static final long seriatVersionUID = 1L;
    private ArrayList<ChatClientIF> chatClients;

    protected ChatServer() throws RemoteException {
        chatClients = new ArrayList<ChatClientIF>();
    }

    public synchronized void registerChatClient(ChatClientIF chatClient) throws RemoteException {
        this.chatClients.add(chatClient);
    }

    public synchronized void broadcastMessage(String message) throws RemoteException {
        int i = 0;
        while (i < chatClients.size()) {
            chatClients.get(i++).retrieveMessages(message);
        }
    }
}
