import java.util.Scanner;

public class ATV02_BM{
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int dia;
        
        do {
        System.out.print("Informe um número entre 1 e 7: ");
        dia = entrada.nextInt();
        
        if (dia < 1 || dia > 7) {
            System.out.print("Número inválido!\n");
        }
        else{
            switch (dia){
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda-feira"); break;
                case 3: System.out.println("Terça-feira"); break;
                case 4: System.out.println("Quarta-feira"); break;
                case 5: System.out.println("Quinta-feira"); break;
                case 6: System.out.println("Sexta-feira"); break;
                case 7: System.out.println("Sábado"); break;
            }   
        }   
        } while (dia < 1 || dia > 7);
    
        entrada.close();
    
    }
       
}