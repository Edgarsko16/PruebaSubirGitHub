import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la ciudad de origen: ");
        String ciudadOrigen = lectura.nextLine();
        System.out.print("Ingrese la ciudad de destino: ");
        String ciudadDestino = lectura.nextLine();
        System.out.println("¿Quiere realizar un viaje desde " + ciudadOrigen + " a " + ciudadDestino + "?");
        System.out.println("¿Quiere realizar un viaje desde " .concat(ciudadOrigen).concat(" a ").concat(ciudadDestino));
    }
}