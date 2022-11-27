import java.util.Scanner;
public class atividade_6 {
	private static Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
	while(true) {
		
	System.out.print("Informe um número: ");
	try {
		entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		System.out.println("O número que antecede o número " + numero + " é " + (numero - 1) + " e o número que sussede é o " + (numero + 1) + "\n");
		
	}catch(Exception e){
		System.out.println("Isto não é um dígito\n\n");
	}
	}
}
}
