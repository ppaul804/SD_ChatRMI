package exemploRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OlaRemoto extends Remote {

	public String getMensagem() throws RemoteException;

}