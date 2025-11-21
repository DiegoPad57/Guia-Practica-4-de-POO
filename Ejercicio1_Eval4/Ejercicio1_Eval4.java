package ejercicio1_eval4;
import java.util.*;

public class Ejercicio1_Eval4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Plantilla cuenta = new Plantilla("Diego", 100);

        String seguir;

        do{
            cuenta.ejecutarOperacion();

            System.out.print("\nDesea realizar otra operacion? (s/n): ");
            seguir = sc.next();

        }while (seguir.equalsIgnoreCase("s"));

        System.out.println("\nSaliendo...");
    } 
}
