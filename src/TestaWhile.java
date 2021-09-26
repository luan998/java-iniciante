
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0;
		while(contador < 10) {
			System.out.println(contador);
			//contador = contador + 1; é a mesma coisa do debaixo, só que o + é sempre antes do igual.
			//contador += 1; é a mesma coisa do debaixo, sempre é contador + outro + que é 1
			contador++;
			////\/\ a forma mais simplificada de fazer um contador
		}
		System.out.println(contador);
		//mostra o ultimo contador que não pode aparecer no while, como eu botei menos que 10,o while mostra só até o 9 e o ultimo contador mostra o 10
		
	}
}
//while é bem fácil, é um sistema de laço simples que roda até as definições entre parenteses forem ativas.
//Exemplo ali, enquanto o resultado for menor que 10, ele vai se repetir. Ou seja, sempre que o resultado for true, ele se repete.
