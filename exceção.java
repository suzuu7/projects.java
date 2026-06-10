import java.util.Scanner;

public class extenso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] unidades = {"", "um", "dois", "três", "quatro",
                "cinco", "seis", "sete", "oito", "nove"};

        String[] dezenas = {"", "", "vinte", "trinta", "quarenta",
                "cinquenta", "sessenta", "setenta",
                "oitenta", "noventa"};

        String[] centenas = {"", "cento", "duzentos", "trezentos",
                "quatrocentos", "quinhentos",
                "seiscentos", "setecentos",
                "oitocentos", "novecentos"};

        System.out.print("Digite um número até 1000: ");
        int numero = teclado.nextInt();

        if (numero == 1000) {
            System.out.println("mil");
        }
        else if (numero == 100) {
            System.out.println("cem");
        }
        else {

            int c = numero / 100;
            int d = (numero % 100) / 10;
            int u = numero % 10;

            if (c > 0) {
                System.out.print(centenas[c]);
                if (d > 0 || u > 0) {
                    System.out.print(" e ");
                }
            }

            if (u == 0) {
                System.out.print(dezenas[d]);
            } else {
                if (d > 0) {
                    System.out.print(dezenas[d] + " e ");
                }
                System.out.print(unidades[u]);
            }
        }
        teclado.close();  
    }
}
