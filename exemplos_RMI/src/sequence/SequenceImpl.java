package sequence;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SequenceImpl extends UnicastRemoteObject implements Sequence {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long sequencia = 0;
	
	protected SequenceImpl() throws RemoteException {
		super();
	}

	public Long getNumero() throws RemoteException {
		System.out.println("Efetuado pedido de sequencia número:"+(sequencia+1)+".");
		return new Long(sequencia++);
	}
	
	
}