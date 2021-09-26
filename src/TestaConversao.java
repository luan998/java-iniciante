
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario;
		//o (int) força a váriavel double a converter para int sem erros.
		System.out.println(valor);
			
		//outras variaveis numericas pouco usadas, int guarda até 2 bilhões, acima disso usar o long, e colocar um l diretamente após o numero
		
		long numeroGrande = 2244214465l;
		short valorPequeno = 32222;
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		//double não é o melhor para usar com dinheiro devido aos decimais infinitos que aparecem as vezes
		System.out.println(total);
		
		//deixar o f depois do resultado força a sele sair como float
		float pontoFlutuante = 3.14f;		
		System.out.println(pontoFlutuante);
		
	}

}
