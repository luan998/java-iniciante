
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0;
		while(contador < 10) {
			System.out.println(contador);
			//contador = contador + 1; � a mesma coisa do debaixo, s� que o + � sempre antes do igual.
			//contador += 1; � a mesma coisa do debaixo, sempre � contador + outro + que � 1
			contador++;
			////\/\ a forma mais simplificada de fazer um contador
		}
		System.out.println(contador);
		//mostra o ultimo contador que n�o pode aparecer no while, como eu botei menos que 10,o while mostra s� at� o 9 e o ultimo contador mostra o 10
		
	}
}
//while � bem f�cil, � um sistema de la�o simples que roda at� as defini��es entre parenteses forem ativas.
//Exemplo ali, enquanto o resultado for menor que 10, ele vai se repetir. Ou seja, sempre que o resultado for true, ele se repete.
