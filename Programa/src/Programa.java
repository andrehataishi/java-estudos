//André Hideki -- Aprendendo conceitos javas -- 12/10/2023 -- SP/BR 

public class Programa {

	public static void main(String[] args) {
		int idadeJoao = 18;
		int idadeMaria = 21;
		
		int somaIdade = idadeJoao + idadeMaria;
		
		System.out.println(somaIdade);
		
		int numero;
		//System.out.println(numero);
		
		double pi = 3.1415;
		System.out.println(pi);
		double dobroPi = pi*2;
		System.out.println(dobroPi);
		
		boolean amigo = true;
		boolean inimigo = false;
		boolean inimigo2 = !amigo;
		
		boolean maiorIdade = idadeJoao >= 18;
		System.out.println(maiorIdade);
		
		char letra = 'm';
		String nomeCompleto = "Joao da Silva";
		System.out.println(nomeCompleto);
		
		int numeroPequeno = 32000;
		long numeroGrande = 99999999999L;
		
		int numero1 = 10;
		long numero2 = numero1;
		//conversão/casting
		long numero3 = 314;		
		int numero4 = (int) numero3;
		
		int idadeVisitante = 15;
		boolean amigoDono = true;
		if(idadeVisitante >= 18 && amigoDono) {
			System.out.println("Entra na festa");
		} else {
			System.out.println("Volte pra casa");
		}
		
		for(int i = 1; i <= 15; i++) {
			System.out.println("Parabens pelo aniversario " + i);
		}
		
		int j = 1;
		while(j <= 15) {
			System.out.println("Parabens pelo aniversario " + j);
			j++;
		}
		
		int multiplicador = 2;
		for(int x = 0; x < 10; x++) {
			if(x % 2 == 0) {
				int numeroQ = 10;
				System.out.println(numeroQ);
				System.out.println(x * multiplicador);
			}
			
//			System.out.println(numeroQ);			
		}

		
		int swit = 1;
		
		switch(swit) {
			case 1:
				System.out.println("Um");
				break;
			case 2:
				System.out.println("Dois");
				break;
			default:
				System.out.println("Numero grande");
			
		}
		
		

	}

}
