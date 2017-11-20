package exemploRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OlaImpl extends UnicastRemoteObject implements OlaRemoto {


	/**
	 * 
	 */
	private static final long serialVersionUID = -135419730659410740L;

	protected OlaImpl() throws RemoteException {
		super();
	}

	public String getMensagem() throws RemoteException {
		System.out.println("Metod getMessage solicitado por usuario remoto.");
		return "Hello World!!!";
	}
	
	
}
