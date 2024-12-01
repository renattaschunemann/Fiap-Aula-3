import java.util.Scanner;

public class Rodizio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        String placa;
        System.out.println("Digite os 4 últimos números da placa:");

        placa = leitor.nextLine();

        System.out.println("Placa: " + placa);

        String ultimoNumeroPlaca;
        ultimoNumeroPlaca = placa.substring(placa.length() - 1);
        System.out.println("Ultimo numero placa: " + ultimoNumeroPlaca);

        int numeroPlaca = Integer.parseInt(ultimoNumeroPlaca);

        System.out.println("Ultimo numero placa Inteiro: " + numeroPlaca);
        leitor.close();

        switch (numeroPlaca) {

            case 1:
            case 2:
                System.out.println("Seu Rodízio será na segunda-feira!");
                break;

            case  3 :
            case  4 :
                System.out.println("Seu Rodízio será na terça-feira!");
                break;

            case 5 :
            case 6 :
                System.out.println("Seu Rodízio será na Quarta-feira!");
                break;

            case 7:
            case 8:
                System.out.printf("Seu Rodízio será na Quinta-feira!");
                break;

            case 9:
            case 0 :
                System.out.println("Seu Rodízio será na Sexta-feira!");
                break;


        }



    }
}
