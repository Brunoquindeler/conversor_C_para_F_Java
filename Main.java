import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char resposta;
        double temperaturaC;
        double temperaturaF;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.printf("Digite a temperatura em Celsius: ");
            temperaturaC = sc.nextDouble();

            temperaturaF  = ((9 * temperaturaC) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaF);

            System.out.printf("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta == 's');

        System.out.println("Bye!!!");
        sc.close();
        
    }
}
