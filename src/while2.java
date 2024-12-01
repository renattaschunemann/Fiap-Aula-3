import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num, cont = 1, soma = 0, qtd;
        System.out.println("Digite a quantidade de número que deseja somar: ");
        qtd = leitor.nextInt();

        while (cont <= qtd) {
            System.out.println("Digite um número: ");
            num = leitor.nextInt();
            soma = soma + num;
            cont++;
        }


        System.out.println("A soma dos números digitados é: " + soma);


    }


}
