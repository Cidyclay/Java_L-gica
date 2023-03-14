import java.util.Scanner;
public class imc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao calculador de IMC");
		System.out.println("Digite o seu peso");
		float peso = scanner.nextFloat();
		System.out.println("Digite a sua altura");
		float altura = scanner.nextFloat();
		float resultado = peso/(altura*altura);
		System.out.println("O seu IMC e :"+resultado);
	}
	
}
