import java.util.Scanner;

public class atividade {
	private static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
	
	String num = "";
	int numero[] = {0,0,0,0};
	
	System.out.print("Informe quantos dias meses e anos tem (Exp.: 2 dias 3 meses e 5 anos \n)");
	String dados = entrada.nextLine().toLowerCase();
	for(int x = 0; x < dados.length(); x++ ){
		try{
			int z = Integer.parseInt(String.valueOf(dados.charAt(x)));
			num = num + String.valueOf(dados.charAt(x));
			
		}catch(Exception e){
			if(dados.charAt(x) == ' ' && num.length() > 0) {
				numero[0] = Integer.parseInt(num);
				num = "";
			}else{
				switch(dados.charAt(x)){
				case('d'):
					numero[1] = numero[0];
					numero[0] = 0;
					break;
				case('m'):
					numero[2] = numero[0];
					numero[0] = 0;
					break;
				case('a'):
					numero[3] = numero[0];
					numero[0] = 0;
					break;
				default:
					break;
				}
			}
		}
	}System.out.print("Você tem " + (numero[1] + (numero[2] * 30) + (numero[3] * 365) ) + " dias");
}
}
