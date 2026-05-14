package estruturacondicionada;

import java.util.Scanner;

public class EstruturaCondicionada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numerno de 0 a 100");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro numerno de 0 a 100");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O número maior é : " + n1);
        }else if (n1 < n2) {
            System.out.println("O número maior é : " + n2);
        } else if (n1 == n2) {
            System.out.println("Esses numeros são iguais");

        }

        Scanner close;
    }
}
