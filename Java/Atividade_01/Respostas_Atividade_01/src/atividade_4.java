import java.util.Scanner;
import java.util.ArrayList;;

public class atividade_4 {
//
	private static Scanner entrada = new Scanner(System.in);
	private static double IPI;
	private static boolean verificado = true;
//
	private static ArrayList<String> informacoes = new ArrayList<String>();
	private static ArrayList<Float> total = new ArrayList<Float>();
	
public static void main(String[] args) {
	
	System.out.print("Informe a porcentagem do IPI: ");
	String dados = entrada.nextLine();
	if(dados.contains(".")) {
	 IPI = Float.valueOf(dados);
	}else {
		dados = dados.replace("%", "");
		try {
		IPI = (Float.parseFloat(dados)*0.01);
		}
		catch(Exception e){
			verificado = false;
		};
	}
	while(verificado == true){
		boolean continuar = true;
		String ent; 
		try{
		while(continuar == true){
			entrada = new Scanner(System.in);
			System.out.print("Informe o ID do produto: ");
			ent = "ID: " + entrada.nextLine();
			System.out.print("Informe valor unitário: ");
			float num = entrada.nextFloat();
			ent = ent + " , valor: " + num;
			System.out.print("Informe a quantidade de produtos: ");
			float num2 = entrada.nextFloat();
			ent = ent + " , quantidade: " + num2;
			num *= num2;
			total.add(num);
			ent = ent + " , total + IPI: " + (num * IPI);
			informacoes.add(ent);
			System.out.print("Deseja adicionar mais?\n 1 para sim \n 2 para não \n");
			int escolha = entrada.nextInt();
			switch(escolha){
			case 1:
				continuar = true;
				entrada.reset();
				break;
			case 2:
				continuar = false;
				break;
			default:
				System.out.print("erro ao entender");
			}
		}
		System.out.print("\n");
		for(int x = 0; x < informacoes.size();x++){
			System.out.println(informacoes.get(x));
		};
		
		float resultado = 0;
		
		for(int x = 0; x < total.size(); x ++ ){
			resultado += total.get(x);
		};
		System.out.print("\nTotal = " + (resultado * IPI));
		verificado = false;
	}catch(Exception e){
	}
	}		
}
}

