
public class TestaEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado;
		//boolean acompanhado = quantidadePessoas >=2; "mostra que � true a booleana caso o resultado seja >=2, caso contr�rio � false
	
		//se eu usar o sysout com a acompanhado, n�o funciona porque ela n�o foi declarado ainda, porque o if else est� embaixo
		
		// se eu declarar a vari�vel dentro dumas chaves, ela s� existe enquanto estiver
		// dentro das chaves, posso criar e declarar dentro do if, mas ela s� funciona
		// l� dentro
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {

			System.out.println("infelizmente voc� n�o pode entrar");
		}

	}
}
