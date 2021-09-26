
public class TestaCondicional2 {

	public static void main(String[] args) {


				System.out.println("testando condicionais");
				int idade = 16;
				int quantidadePessoas = 3;
				
				//&& é o E, uma condicional que acontece caso você é maior de 18 E tem mais que 2 só ai pode
				//Caso a quantidade seja 1, dá um erro pois ele compila como não pode
				// || é a condicional or
				
				if (idade >= 18 || quantidadePessoas >=2) {
					System.out.println("Seja bem vindo");
				}
				else {
					 
					System.out.println("infelizmente você não pode entrar");
			}
				
		}	
	}

