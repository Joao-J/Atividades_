import java.util.Scanner;
public class atividade_6 {
	private static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
	while(true) {
		
	System.out.print("Informe um n�mero: ");
	try {
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		System.out.println("O n�mero que antecede o n�mero " + numero + " � " + (numero - 1) + " e o n�mero que sussede � o " + (numero + 1) + "\n");
		
	}catch(Exception e){
		System.out.println("Isto n�o � um d�gito\n\n");
	}
	}
}
}
