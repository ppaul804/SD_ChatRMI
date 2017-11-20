package exemploRMI;

import java.rmi.Naming;

/**
 * @author mmorais
 */
public class Client {

	public static void main(String[] args) {
		try {
			OlaRemoto ola = (OlaRemoto) Naming.lookup("//localhost/ServOla");
			System.out.println("Solicitando mensagem do objeto remoto.");
			System.out.println("Mensagem Remota: " + ola.getMensagem());
		} catch (Exception e) {
			System.out.println("Problemas no Cliente:\n" + e.getMessage());
		}
	}
}
