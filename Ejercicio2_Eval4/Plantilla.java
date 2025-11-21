package ejercicio2_eval4;
import java.util.*;

public class Plantilla 
{
    private String nombre;
    private double precio;
    private int cantidad;

    public Plantilla(String nombre, double precio, int cantidad) 
    {
        System.out.println("Bienvenido!");
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        if(precio < 0){
            System.out.println("El precio no puede ser negativo");
        }else {
            this.precio = precio;
        }
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        if(cantidad < 0){
            System.out.println("La cantidad no puede ser negativa");
        }else {
            this.cantidad = cantidad;
        }
    }

    private void modificarDatos() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**** MODIFICAR PRODUCTO ****");
        System.out.println("1- Modificar nombre");
        System.out.println("2- Modificar precio");
        System.out.println("3- Modificar cantidad");
        System.out.print("Seleccione su opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion){
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                setNombre(nuevoNombre);
                break;

            case 2:
                System.out.print("Ingrese el nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                setPrecio(nuevoPrecio);
                break;

            case 3:
                System.out.print("Ingrese la nueva cantidad: ");
                int nuevaCantidad = sc.nextInt();
                setCantidad(nuevaCantidad);
                break;

            default:
                System.out.println("Opción no valida");
        }
    }

    public void menuPrincipal() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n**** MENU DEL PRODUCTO ****");
        System.out.println("1- Modificar datos");
        System.out.println("2- Mostrar datos");
        System.out.print("Seleccione su opcion: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                modificarDatos();
                break;

            case 2:
                mostrarDatos();
                break;

            default:
                System.out.println("Opcion no válida.");
        }
    }

    private void mostrarDatos() {
        System.out.println("\n**** DATOS DEL PRODUCTO ****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}
