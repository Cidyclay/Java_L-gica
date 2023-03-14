import java.util.Scanner;
public class Maior_O_U_Menor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ");
		System.out.println("Digite o Primeiro número");
		float numero = scanner.nextFloat();
		System.out.println("Digite o segundo número");
		float numero2 = scanner.nextFloat();
		if(numero>numero2) {
			System.out.println("Este número e maior :"+numero);
		}else if(numero<numero2) {
			System.out.println("Este número e maior " +numero2);
		}else {
			System.out.println("Os números são iguais");
		}
		
	}
}
