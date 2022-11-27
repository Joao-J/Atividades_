
public class atividade_2 {
public static void main(String[] args) {
	int NumerosA[] = {8, 9, 7}; 
	int NumerosB[] = {4, 5, 6};
	int media[] = {0,0} ;
	String numsA = "";
	String numsB = "";
	
	for(int i = 0; i < NumerosA.length; i ++ ) {
		String j = ", ";
		if(i == (NumerosA.length - 1)){
			j = "";
		};
		media[0] = media[0] + NumerosA[i];
		numsA = numsA + (String.valueOf(NumerosA[i]) + j);
	}
	for(int i = 0; i < NumerosB.length; i ++ ) {
		String j = ", ";
		if(i == (NumerosA.length - 1)){
			j = "";
		};
		media[1] = media[1] + NumerosB[i];
		numsB = numsB + (String.valueOf(NumerosB[i])+j);
	}
	System.out.print("A média dos números " + numsA + " é igual a " + (media[0]/NumerosA.length) + "\nA média dos números " + numsB + " é igual a " + (media[1]/NumerosA.length) + "\n");
	System.out.print("A média das medias " + (media[0]/NumerosA.length) + " , " + (media[1]/NumerosA.length) + " é igual a " + (((media[0]/NumerosA.length)+(media[1]/NumerosA.length))/2));
}
}
