import java.util.Scanner;
public class Par_Impar {
	
	public static void main(String[] args) {
		System.out.println("Digite um número e iremos verificar se ele e impar ou par:");
		Scanner scanner = new Scanner(System.in);
		int numero= scanner.nextInt();
		 if(numero%2==0) {
			 System.out.println("Este número e Par :" +numero);
		 }else if(numero%2!=0){
			 System.out.println("Este número e Impar :" +numero);
		 }
		System.out.println("Obrigado por usar o verificador de números pares e impares");
		
	}
}
