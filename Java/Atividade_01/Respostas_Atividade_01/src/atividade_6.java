import java.util.Scanner;

public class atividade_6 {
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		try {
		System.out.print("Informe o valor do salário mínimo: ");
		float salario_minimo = entrada.nextFloat();
		System.out.print("Informe o salário do usúario: ");
		float salario_usuario = entrada.nextFloat();
		float numero_salario = (salario_usuario/salario_minimo);

		System.out.print(String.format("%.1f", numero_salario) + " SM = " + salario_usuario + "\n (SM = salário mínimo)");
	}catch(Exception e){System.out.print("Erro");}
		}
}
