
public class switchSemana {

	public static void main(String[] args) {

		int semana = 7;
		switch (semana) {
		case 1:
			System.out.println("O dia da semana � Domingo");

		case 2:
			System.out.println("O dia da semana � Segunda");

		case 3:
			System.out.println("O dia da semana � Ter��");

		case 4:
			System.out.println("O dia da semana � Quarta");

		case 5:
			System.out.println("O dia da semana � Quinta");

		case 6:
			System.out.println("O dia da semana � Sexta");

		case 7:
			System.out.println("O dia da semana � S�bado");
			break;

		default:
			System.out.println("Dia da semana � inv�lido");
			break;
		}
	}
}