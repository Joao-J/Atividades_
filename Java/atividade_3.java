import java.util.Scanner;
public class atividade3 {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Informe o saldo: ");
		float saldo = entrada.nextFloat();
		System.out.print("Seu saldo será igual " + saldo + " +  1% totalizando (" + (saldo + (saldo * 0.01)) + " R$)" );
	}

}
