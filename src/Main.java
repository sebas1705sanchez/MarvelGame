import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("Menu Principal");
        System.out.println("Opciones:");
        System.out.println("1. Jugar");
        System.out.println("2. Registrarse");
        System.out.println("3. Ver datos usuario ");
        System.out.println("4. Salir");
    }

    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        menu();
        op = scanner.nextInt();
        System.out.println(op);

        if (op == 1) {
            System.out.println("game");
        } else if (op == 2) {
            System.out.println("Ingrese el nombre del jugador 1: ");
            String name = scanner.nextLine();
            System.out.println("Ingrese el nickname del jugador 1: ");
            String nickname = scanner.nextLine();

            Player player1 = new Player(name, nickname);

            System.out.println("Ingrese el nombre del jugador 2: ");
            name = scanner.nextLine();
            System.out.println("Ingrese el nickname del jugador 2: ");
            nickname = scanner.nextLine();

            Player player2 = new Player(name, nickname);
        } else if (op == 3) {
            System.out.println("ver datos usuarios");
        } else if (op == 4) {
            System.out.println("salir");
        } else {
            System.out.println("numero incorrecto, ingrese una opcion valida");
            menu();
        }

    }
}