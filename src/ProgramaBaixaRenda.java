import java.util.Scanner;

public class ProgramaBaixaRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RendaMensal;
        int quantidade;
        double rendapercapita;

        System.out.print("Digite a renda mensal da família: ");
        RendaMensal = scanner.nextDouble();

        System.out.print("Digite a quantidade de pessoas na família: ");
        quantidade = scanner.nextInt();

        rendapercapita = (RendaMensal / quantidade);
        System.out.println("Á família tem renda percapita de: " + rendapercapita);

            if (rendapercapita <= 218) {
                System.out.println("A família é considerada de baixa renda (aprovado).");
            } else {
                System.out.println("A família não é considerada de baixa renda (reprovado).");
            }

        scanner.close();
    }
}