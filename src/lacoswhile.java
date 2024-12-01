import java.util.Scanner;

public class lacoswhile {
    public static void main(String[] args) {
        //while(condição for true) {bloco de instrução}
        // programa que some 5 números
        // ++ acrescenter, -- retirar
        Scanner leitor = new Scanner(System.in);

       int num, cont = 1, soma = 0;

       while (cont <= 5) {
           System.out.println("Digite um número");
           num = leitor.nextInt();
           soma = soma + num;
           cont++;
       }
        System.out.println("Hello world, test");


        System.out.println("A soma dos números digitados é: " + soma);


    }


}
