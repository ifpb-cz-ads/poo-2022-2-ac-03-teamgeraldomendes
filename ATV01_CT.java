import java.util.Scanner;

public class ATV01_CT{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade <16){
			System.out.println("Não pode votar!");
		}
		else if (idade >= 16 && idade < 18 || idade > 65){
			System.out.println("Votar é facultativo!");

		}
		else {
			System.out.printf("Votar é obrigatório!");
		}
		
		entrada.close();

    }
}