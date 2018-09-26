package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cad1, cad2;
        System.out.println("Entra un primer nombre");
        int a = in.nextInt();
        System.out.println("Entra un segon nombre");
        int b = in.nextInt();
        System.out.println("La suma dels dos valors és de: " + suma(a,b));
        System.out.println("La resta dels dols valors és de: " + resta(a,b));
    }
    private static int suma(int a, int b){
        return a+b;
    }
    private static int resta(int a, int b){
        return a - b;
    }
}
