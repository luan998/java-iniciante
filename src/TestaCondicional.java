
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando if");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("voc� n�o tem 18 mas pode entrar, "
					+ "pois est� acompanhado");
			} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
		}
	}
}
