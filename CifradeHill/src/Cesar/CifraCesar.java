package Cesar;

	import java.util.Scanner;

public class CifraCesar {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Solicita a mensagem codificada e a chave de deslocamento ao usuário
	        System.out.print("Digite a mensagem codificada: ");
	        String encodedMessage = input.nextLine();
	        System.out.print("Digite a chave de deslocamento: ");
	        int shift = input.nextInt();

	        // Decodifica a mensagem usando a chave de deslocamento
	        String decodedMessage = "";
	        for (int i = 0; i < encodedMessage.length(); i++) {
	            char currentChar = encodedMessage.charAt(i);
	            if (Character.isLetter(currentChar)) {
	                char decodedChar = (char) (((currentChar - shift - 65 + 26) % 26) + 65);
	                decodedMessage += decodedChar;
	            } else {
	                decodedMessage += currentChar;
	            }
	        }

	        // Imprime a mensagem decodificada
	        System.out.println("Mensagem decodificada: " + decodedMessage);

	        input.close();
	    }
}
