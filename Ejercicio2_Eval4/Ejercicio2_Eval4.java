package ejercicio2_eval4;
import java.util.*;

public class Ejercicio2_Eval4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Plantilla producto = new Plantilla("Audifonos", 24.95, 30);

        String seguir;

        do{
            producto.menuPrincipal();

            System.out.print("\nDesea realizar algo mas? (s/n): ");
            seguir = sc.next();

        }while(seguir.equalsIgnoreCase("s"));

        System.out.println("\nSaliendo...");
    }
}

