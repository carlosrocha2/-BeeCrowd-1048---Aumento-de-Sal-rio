import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leia = new Scanner(System.in);
        double salario = leia.nextDouble();

        double reajustesala = 0;
        if (salario <= 400.00) {
            reajustesala = salario * 0.15;
            salario = reajustesala + salario;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajustesala);
            System.out.printf("Em percentual: 15 %%\n");
            
        }else if (salario >= 400.01 && salario <= 800.00) {
            reajustesala = salario * 0.12;
            salario = reajustesala + salario;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajustesala);
            System.out.printf("Em percentual: 12 %%\n");
        }else if (salario >= 800.01 && salario <= 1200.00) {
            reajustesala = salario * 0.10;
            salario = reajustesala + salario;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajustesala);
            System.out.printf("Em percentual: 10 %%\n");
        }else if (salario >= 1200.01 && salario <= 2000.00) {
            reajustesala = salario * 0.07;
            salario = reajustesala + salario;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajustesala);
            System.out.printf("Em percentual: 7 %%\n");
        }else{
            reajustesala = salario * 0.04;
            salario = reajustesala + salario;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajustesala);
            System.out.printf("Em percentual: 4 %%\n");
        }
     }

    }