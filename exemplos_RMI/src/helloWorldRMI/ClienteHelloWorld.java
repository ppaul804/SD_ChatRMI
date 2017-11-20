package helloWorldRMI;

import java.rmi.Naming;

public class ClienteHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld objetoRemoto;
		try {
			objetoRemoto = (HelloWorld) Naming.lookup("//localhost/ServicoHello");
			System.out.println("Mensagem do objeto remoto: " + objetoRemoto.getMensagem());
			System.out.println("Data Atual do Servidor: " + objetoRemoto.getHoraAtual());
		} catch (Exception e) {
			System.out.println("Erro acessando objeto remoto");
		}
	}

}
