import java.util.Scanner;
public class Trapezio {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bem vindo ao calculador de área de trapézios!!");
	System.out.println("Digite o valor da Base Maior");
	float B = scanner.nextFloat();
	System.out.println("Digite o valor da Base Menor");
	float b = scanner.nextFloat();
	System.out.println("Digite o valor da altura");
	float A = scanner.nextFloat();
		float resultado = ((B+b)*A)/2;
		System.out.println("O valor da área e "+resultado+"cm2");
	}
	
}
