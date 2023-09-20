package mayornumero;
import java.util.Scanner;
/**
 *
 * @author KevinElChistes
 */
public class MayorNumero {

    public void mayor() {
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer entero");
        n1 = entrada.nextInt();
        System.out.println("Introduce el segundo entero");
        n2 = entrada.nextInt();
        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        } else {
            System.out.println("El numero mayor es: " + n2);
        }
    }
    public static void main(String[] args) {
        MayorNumero ma = new MayorNumero();
        ma.mayor();
    }
}
