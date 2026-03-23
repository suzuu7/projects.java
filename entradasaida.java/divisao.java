import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n2 != 0) {
            int resto = n1 % n2;
            System.out.println("Resto da divisão: " + resto);
        } else {
            System.out.println("Não é possível dividir por zero");
        }

        sc.close();
    }
}