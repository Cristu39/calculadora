package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entra un primer nombre");
        int n1 = in.nextInt();
        System.out.println("Entra un segon nombre");
        int n2 = in.nextInt();
        System.out.println("La suma dels dos valors és de: " + suma(n1,n2));
        System.out.println("La resta dels dos valors és de: " + resta(n1,n2));
        System.out.println("La multiplicació dels dos valors és de: " + multiplicacio(n1, n2));
        System.out.println("La divisió dels dos nombres és de: " + divisio(n1,n2));
    }
    private static int suma(int a, int b){
        return a+b;
    }
    private static int resta(int a, int b){
        return a - b;
    }
    public static float multiplicacio(int a, int b){
        return a * b;
    }
    public static float divisio(int a, int b){
        return a/b;
    }
}
