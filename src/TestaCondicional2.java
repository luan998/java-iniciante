
public class TestaCondicional2 {

	public static void main(String[] args) {


				System.out.println("testando condicionais");
				int idade = 16;
				int quantidadePessoas = 3;
				
				//&& � o E, uma condicional que acontece caso voc� � maior de 18 E tem mais que 2 s� ai pode
				//Caso a quantidade seja 1, d� um erro pois ele compila como n�o pode
				// || � a condicional or
				
				if (idade >= 18 || quantidadePessoas >=2) {
					System.out.println("Seja bem vindo");
				}
				else {
					 
					System.out.println("infelizmente voc� n�o pode entrar");
			}
				
		}	
	}

