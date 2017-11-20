package helloWorldRMI;

import java.rmi.Naming;

public class ServidorHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			HelloWorld obj = new HelloWorldImpl();
			Naming.rebind("ServicoHello", obj);
			System.out.println("Servidor no ar.");
		} catch (Exception e) {
		}
		

	}

}
