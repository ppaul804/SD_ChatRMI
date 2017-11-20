package sequence;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Sequence extends Remote {

	public Long getNumero() throws RemoteException;

}