import java.util.Scanner;
public class ordem_numero {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Digite um número do tipo inteiro");
	 int inteiro = scanner.nextInt();
	 System.out.println("Digite um número do tipo long");
	 long longo = scanner.nextLong();
	 System.out.println("Digite um número do tipo float");
	 float decimal = scanner.nextFloat();
	 System.out.println("O número inteiro digitado foi "+inteiro+ " , O número long digitado foi "+longo+ " ,O número float digitado foi "+decimal);
 }
}
