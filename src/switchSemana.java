
public class switchSemana {

	public static void main(String[] args) {

		int semana = 7;
		switch (semana) {
		case 1:
			System.out.println("O dia da semana é Domingo");

		case 2:
			System.out.println("O dia da semana é Segunda");

		case 3:
			System.out.println("O dia da semana é Terçã");

		case 4:
			System.out.println("O dia da semana é Quarta");

		case 5:
			System.out.println("O dia da semana é Quinta");

		case 6:
			System.out.println("O dia da semana é Sexta");

		case 7:
			System.out.println("O dia da semana é Sábado");
			break;

		default:
			System.out.println("Dia da semana é inválido");
			break;
		}
	}
}