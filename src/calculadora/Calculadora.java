package calculadora;
import static java.lang.Character.isDigit;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        boolean yes = false, zero = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Entra un primer nombre");
        int n1= 0;
        do{
            try{
                n1 = in.nextInt();
                yes = true;
            }catch(Exception e){
                System.out.println("Prova a introduir un numero enter");
            }
        }while(!yes);
        System.out.println("Entra un segon nombre");
        int n2 = in.nextInt();
        do{
            if (n2 == 0) {
                System.out.println("Introdueix un nombre diferent a 0");
                n2 = in.nextInt();
            }else{
                zero = true;
            }
        }while(!zero);
        
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
    public static double divisio(int a, int b){
        return a/b;
    }
}
