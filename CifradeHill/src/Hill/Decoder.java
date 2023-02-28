package Hill;

	import java.util.Scanner;

	public class Decoder {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Solicita a matriz de codificação ao usuário
	        System.out.println("Digite a matriz de codificação (separada por espaços):");
	        double[][] encodingMatrix = new double[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                encodingMatrix[i][j] = input.nextDouble();
	            }
	        }

	        // Calcula a matriz inversa da matriz de codificação
	        double det = encodingMatrix[0][0] * encodingMatrix[1][1] - encodingMatrix[0][1] * encodingMatrix[1][0];
	        double[][] inverseMatrix = new double[2][2];
	        inverseMatrix[0][0] = encodingMatrix[1][1] / det;
	        inverseMatrix[0][1] = -encodingMatrix[0][1] / det;
	        inverseMatrix[1][0] = -encodingMatrix[1][0] / det;
	        inverseMatrix[1][1] = encodingMatrix[0][0] / det;

	        // Solicita a mensagem codificada ao usuário
	        System.out.println("Digite a mensagem codificada (separada por espaços):");
	        double[][] encodedMessage = new double[2][1];
	        for (int i = 0; i < 2; i++) {
	            encodedMessage[i][0] = input.nextDouble();
	        }

	        // Decodifica a mensagem usando a matriz inversa
	        double[][] decodedMessage = multiplyMatrices(inverseMatrix, encodedMessage);

	        // Imprime a mensagem decodificada
	        System.out.println("Mensagem decodificada:");
	        for (int i = 0; i < 2; i++) {
	            System.out.print((char) Math.round(decodedMessage[i][0]));
	        }

	        input.close();
	    }

	    // Função para multiplicar duas matrizes
	    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
	        int aRows = a.length;
	        int aCols = a[0].length;
	        int bCols = b[0].length;
	        double[][] result = new double[aRows][bCols];
	        for (int i = 0; i < aRows; i++) {
	            for (int j = 0; j < bCols; j++) {
	                for (int k = 0; k < aCols; k++) {
	                    result[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }
	        return result;
	    }
}
