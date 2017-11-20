package calculadoraRMI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/*
 * Created on 09/12/2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */

/**
 * @author mmorais
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ClienteCalculadora {

	public static void main(String[] args) {
		boolean sair = false;
		Integer operando1;
		Integer operando2;
		String operador = null;

		ServicoCalculadora calculadora=null;
		try {
			calculadora = (ServicoCalculadora) Naming.lookup("//localhost/Calculadora");
		} catch (MalformedURLException e) {
			System.out.println("Erro na formação do nome do serviço. Motivo:\n" + e.getMessage());
		} catch (RemoteException e) {
			System.out.println("Erro processando requisição remota. Motivo:\n" + e.getMessage());
		} catch (NotBoundException e) {
			System.out.println("Serviço inexistente no servidor. Motivo:\n" + e.getMessage());
		}
		if(calculadora == null){
			System.err.println("O programa será finalizado.");
			System.exit(1);
		}
		
		System.out.println("Os operandos válidos são inteiros.");
		System.out.println("Os operadores válidos: + - x /");
		System.out.println("Digite fim para sair.");
		while(!sair) {
			String texto;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			operando1 = null;
			operando2 = null;
			operador  = "";
			
			try {
				System.out.println();
				//Pegando primeiro operando
				System.out.print("Informe o primeiro operando: ");
				texto = entrada.readLine();
				if( texto.equalsIgnoreCase("fim")) {
					System.out.println("Tchau!!!");
					System.exit(0);
				} else {
					operando1 = new Integer(texto);
				}
				//Pegando operador
				System.out.print("Informe o operador: ");
				texto = entrada.readLine();
				if( texto.equalsIgnoreCase("fim")) {
					System.out.println("Tchau!!!");
					System.exit(0);
				} else {
					operador = texto;
				}
				//Pegando segundo operando
				System.out.print("Informe o segundo operando: ");
				texto = entrada.readLine();
				if( texto.equalsIgnoreCase("fim")) {
					System.out.println("Tchau!!!");
					System.exit(0);
				} else {
					operando2 = new Integer(texto);
				}
			} catch( NumberFormatException e) {
				System.out.println("Os operandos devem ser números inteiros.");
			} catch (IOException e) {
				System.out.println("Falha lendo o teclado.");
			}
			
			//Calculando
			try {
				if( operador.equals("+")) {
				  System.out.println("Resultado: " + calculadora.soma(operando1,operando2) );
				} else if( operador.equals("-")) {
					System.out.println("Resultado: " + calculadora.subtrai(operando1,operando2) );
				} else if( operador.equalsIgnoreCase("x")) {
					System.out.println("Resultado: " + calculadora.multiplica(operando1,operando2) );
				} else if( operador.equals("/")) {
					System.out.println("Resultado: " + calculadora.divide(operando1,operando2) );
				} else {	
					System.out.println("O operador deve ser +, -, x ou /.");
				}
			} catch (RemoteException e) {
				System.out.println("Erro processando requisição remota. Motivo:\n" + e.getMessage());
			}
		}
	}
}
