
public class TestaSomatoria {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		//se declarar a vari�vel dentro do while, ela sempre vai se resetar por que o c�digo sempre recome�a do come�o, a defini��o de vari�veis dentro dele tamb�m se encaixa
		while(contador <= 10) {
			
			total = total + contador;
			//total += contador; daria o mesmo resultado para n�o ter que copiar total 2 vezes
			
			System.out.println(total);
			contador++;
			
		}
		//System.out.println(total); aqui s� mostra o ultimo resultado que � 55, o resultado do contador se repetindo 10 vezes
		
	}
}
