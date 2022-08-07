import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner cmd = new Scanner(System.in);
        System.out.println("Ingrese Titular:");
        String titular = cmd.next();

        System.out.println("Ingrese Cantidad:");
        double cantidad = cmd.nextInt();

        Cuenta cuenta1 = new Cuenta(titular,cantidad);
        System.out.println("Cuenta 1");
        System.out.println(cuenta1.getTitular());
        System.out.println(cuenta1.getCantidad());
        System.out.println("Ingresa :"+cuenta1.ingresar(500));
        //System.out.println("Queda: "+ cuenta1.retirar(100));





    }
}