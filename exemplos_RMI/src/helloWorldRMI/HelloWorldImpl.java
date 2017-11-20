package helloWorldRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorldImpl extends UnicastRemoteObject implements HelloWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected HelloWorldImpl() throws RemoteException {
		super();
	}

	public String getMensagem() throws RemoteException {
		return "Happy New Year. Hello World!!!";
	}

	public String getHoraAtual() throws RemoteException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return sdf.format(Calendar.getInstance().getTime());
	}

}
