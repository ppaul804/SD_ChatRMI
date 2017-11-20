package calculadoraRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicoCalculadoraImpl extends UnicastRemoteObject implements ServicoCalculadora {


	private static final long serialVersionUID = 3653149254096940610L;

	protected ServicoCalculadoraImpl() throws RemoteException {
		super();
		System.out.println("Instancia de servi�o criada.");
	}

	public Integer soma(Integer oper1, Integer oper2) throws RemoteException {
		System.out.println("Processando soma de " + oper1 + " e " + oper2);
		return new Integer(oper1.intValue()+oper2.intValue());
	}
	
	public Integer subtrai(Integer oper1, Integer oper2) throws RemoteException {
		System.out.println("Processando subtra��o de " + oper1 + " e " + oper2);
		return new Integer(oper1.intValue()-oper2.intValue());
	}
	
	public Integer divide(Integer oper1, Integer oper2) throws RemoteException {
		System.out.println("Processando divis�o de " + oper1 + " por " + oper2);
		return new Integer(oper1.intValue()/oper2.intValue());
	}
	
	public Integer multiplica(Integer oper1, Integer oper2) throws RemoteException {
		System.out.println("Processando multiplica��o de " + oper1 + " por " + oper2);
		return new Integer(oper1.intValue()*oper2.intValue());
	}
	
	
}