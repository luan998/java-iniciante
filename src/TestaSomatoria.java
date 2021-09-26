
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		//se declarar a variável dentro do while, ela sempre vai se resetar por que o código sempre recomeça do começo, a definição de variáveis dentro dele também se encaixa
		while(contador <= 10) {
			
			total = total + contador;
			//total += contador; daria o mesmo resultado para não ter que copiar total 2 vezes
			
			System.out.println(total);
			contador++;
			
		}
		//System.out.println(total); aqui só mostra o ultimo resultado que é 55, o resultado do contador se repetindo 10 vezes
		
	}
}
