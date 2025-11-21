package ejercicio3_eval4;
import java.util.*;

public class Ejercicio3_Eval4 
{
    public static void main(String[] args) 
    {
        System.out.println("**** Mensajes de Pasatiempos ****");

        new Plantilla1();
        new Plantilla1("The Boys");
        new Plantilla1("F.C Barcelona", 1899);
        new Plantilla1("Rock Clasico", "AC/DC");

        System.out.println("\n**** Ingreso de datos del estudiante ****");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su carnet: ");
        String carnet = entrada.nextLine();

        Plantilla2 e = new Plantilla2();
        e.setNombre(nombre);
        e.setCarnet(carnet);

        System.out.println("\nDatos ingresados: \nNombre: " + e.getNombre() + " | Carnet: " + e.getCarnet());
    }
}
