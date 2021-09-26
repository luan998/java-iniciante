
public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado;
		//boolean acompanhado = quantidadePessoas >=2; "mostra que é true a booleana caso o resultado seja >=2, caso contrário é false
	
		//se eu usar o sysout com a acompanhado, não funciona porque ela não foi declarado ainda, porque o if else está embaixo
		
		// se eu declarar a variável dentro dumas chaves, ela só existe enquanto estiver
		// dentro das chaves, posso criar e declarar dentro do if, mas ela só funciona
		// lá dentro
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {

			System.out.println("infelizmente você não pode entrar");
		}

	}
}
