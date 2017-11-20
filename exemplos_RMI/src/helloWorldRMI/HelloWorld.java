package helloWorldRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloWorld extends Remote {
  public String getMensagem() throws RemoteException;
  public String getHoraAtual() throws RemoteException;
}
