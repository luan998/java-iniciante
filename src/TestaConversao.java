
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario;
		//o (int) for�a a v�riavel double a converter para int sem erros.
		System.out.println(valor);
			
		//outras variaveis numericas pouco usadas, int guarda at� 2 bilh�es, acima disso usar o long, e colocar um l diretamente ap�s o numero
		
		long numeroGrande = 2244214465l;
		short valorPequeno = 32222;
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		//double n�o � o melhor para usar com dinheiro devido aos decimais infinitos que aparecem as vezes
		System.out.println(total);
		
		//deixar o f depois do resultado for�a a sele sair como float
		float pontoFlutuante = 3.14f;		
		System.out.println(pontoFlutuante);
		
	}

}
