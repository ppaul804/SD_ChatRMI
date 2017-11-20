package calculadoraRMI;

import java.rmi.Naming;

/**
 * @author mmorais
 */
public class ServidorCalculadora {

	public static void main(String[] args) {
		try {
		  ServicoCalculadora obj = new ServicoCalculadoraImpl();
			Naming.rebind("Calculadora", obj);
			System.out.println("Serviço Calculadora Funcionando.");
		} catch (Exception e) {
			System.out.println("Problemas no Servidor:\n" + e.getMessage());
		}
	}
}