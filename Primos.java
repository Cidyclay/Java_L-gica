import java.util.Scanner;
public class Primos {
	
	public static void main(String[] args) {
		System.out.println("Ola senhor ou senhora");
		System.out.println("Digite abaixo um número para verificarmos se e primo ou não:");
		Scanner scanner = new Scanner(System.in);
		int cont=0;
		int numero = scanner.nextInt();
		for(int i = 1;i<=numero;i++) {
			if(numero%i==0) {
				cont++;
			}
		}
		if(cont==2) {
			System.out.println("E primo");
		}else if(cont>2) {
			System.out.println("Não e primo");
		}
	   System.out.println("Obrigado e até a volta!!");
	}
	

}
