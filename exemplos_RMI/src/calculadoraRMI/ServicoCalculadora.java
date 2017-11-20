package calculadoraRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoCalculadora extends Remote {

	public Integer soma(Integer oper1, Integer oper2) throws RemoteException;
	public Integer subtrai(Integer oper1, Integer oper2) throws RemoteException;
	public Integer divide(Integer oper1, Integer oper2) throws RemoteException;
	public Integer multiplica(Integer oper1, Integer oper2) throws RemoteException;

}