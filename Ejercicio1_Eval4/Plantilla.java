package ejercicio1_eval4;
import java.util.*;

public class Plantilla 
{
    public void ejecutarOperacion() 
    {
        mostrarMenu();
    }
    
    private String Nom_Titular;
    private double Saldo_Act;

    public Plantilla(String titular, double saldo_inicial) 
    {
        this.Nom_Titular = titular;
        this.Saldo_Act = saldo_inicial;
        System.out.println("Bienvenido/a " + Nom_Titular);
    }

    private void mostrarMenu() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**** MENU PRINCIPAL ****");
        System.out.println("1- Abonar dinero");
        System.out.println("2- Retirar dinero");
        System.out.println("3- Mostrar saldo");
        System.out.print("Seleccione su opcion: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                abono(sc);
                break;

            case 2:
                retiro(sc);
                break;

            case 3:
                System.out.println("Su saldo actual es: $" + Saldo_Act);
                break;

            default:
                System.out.println("Opcion no válida.");
        }
    }

    private void abono(Scanner sc) 
    {
        System.out.print("Ingrese la cantidad a abonar: ");
        double cantidad = sc.nextDouble();

        if(cantidad <= 0){
            System.out.println("El abono debe ser mayor a 0");
        }else {
            Saldo_Act += cantidad;
            System.out.println("Abono realizado \nSu nuevo saldo es: $" + Saldo_Act);
        }
    }

    private void retiro(Scanner sc) 
    {
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = sc.nextDouble();

        if(cantidad <= 0){
            System.out.println("El retiro debe ser mayor a 0.");
        }else if (cantidad > Saldo_Act){
            System.out.println("Saldo insuficiente");
        }else{
            Saldo_Act -= cantidad;
            System.out.println("Retiro exitoso \nSu saldo actual es de: $" + Saldo_Act);
        }
    }
}