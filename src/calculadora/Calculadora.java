package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entra un primer nombre");
        int a = in.nextInt();
        System.out.println("Entra un segon nombre");
        int b = in.nextInt();
        System.out.println("El primer numero més el segon dónan com a resultat: " + suma(a,b));
    }
    private static int suma(int a, int b){
        return a+b;
    }
}
