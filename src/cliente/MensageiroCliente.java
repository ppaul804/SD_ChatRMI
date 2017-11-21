
package cliente;

import comum.Mensageiro;
import comum.MensageiroImpl;
import java.rmi.Naming;
import java.util.Scanner;

public class MensageiroCliente {
    
    public static void main(String[] args) {
        try{
            Mensageiro mensageiro = (Mensageiro) Naming.lookup(MensageiroImpl.getURI());
            Scanner scanner = new Scanner(System.in);
            String mensagem;
            while (true) {//enquanto para sempre                
                mensagem = scanner.nextLine();//recebe o digitado
                mensageiro.enviarMensagem(mensagem);//manda pro servidor
            }
            
            
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        
    }
    
}
