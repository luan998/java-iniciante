
public class TestaLacos {
	
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
		
			for(int contador = 0; contador <= 10 ; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
				//print comum pois ele n�o quer pular linha, e o espa�o ali para separar os resultados
			}
			System.out.println();
			//print ln aqui para pular linha ap�s cada sequ�ncia de 10 execu��es do contador
		}
	}
}
