import java.util.Scanner;
public class Oi {
	public static void main(String[] args) {
		System.out.println("Bom dia!!");
		System.out.println("Qual e o seu nome ?");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
			System.out.println("Olá, "+nome+", Tudo bem ? ");
			String resposta = scanner.nextLine();
			if(resposta.equals("sim")) {
				System.out.println("Ainda bem,"+nome);
			}else if(resposta.equals("não")) {
				System.out.println("Que pena, "+nome);
			}
	
	}

}
