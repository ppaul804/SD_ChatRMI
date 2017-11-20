package sequence;

import java.rmi.Naming;

/**
 * @author mmorais
 */
public class ClientSequence {

	public static void main(String[] args) {
		try {
			Sequence seq = (Sequence) Naming.lookup("//localhost/ServSeq");
			System.out.println("Solicitando número do objeto remoto.");
			System.out.println("Número Remoto: " + seq.getNumero());
		} catch (Exception e) {
			System.out.println("Problemas no Cliente:\n" + e.getMessage());
		}
	}
}
