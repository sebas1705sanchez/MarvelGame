import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("--- Menu Principal ---");
        System.out.println("Opciones:");
        System.out.println("1. Ver info personajes");
        System.out.println("2. Registrarse");
        System.out.println("3. Ver datos usuario");
        System.out.println("4. Salir");
        System.out.println();
    }

    public static void main(String[] args) {
        Player player1 = null;
        Player player2 = null;
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        Personaje thor = new Personaje("thor", 1000, 105);
        GodsMythologicalBeings diosThor = new GodsMythologicalBeings(thor, "trueno");

        while (op != 4) {
            menu();
            System.out.print("Ingrese una opción: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
//                    System.out.println("game");
                    System.out.println("nombre: " + diosThor.getCharacterName() + " habilidad especial: " + diosThor.getSpecialAbility());

                    break;

                case 2:
                    System.out.println("Ingrese el nombre del jugador 1: ");
                    String name = scanner.nextLine();
                    System.out.println("Ingrese el nickname del jugador 1: ");
                    String nickname = scanner.nextLine();

                    System.out.println();
                    System.out.println();

                    player1 = new Player(name, nickname);

                    System.out.println("Ingrese el nombre del jugador 2: ");
                    name = scanner.nextLine();
                    System.out.println("Ingrese el nickname del jugador 2: ");
                    nickname = scanner.nextLine();

                    player2 = new Player(name, nickname);
                    break;

                case 3:
                    System.out.println("Ver datos de usuarios");
                    if (player1 != null) {
                        player1.showData();
                    }
                    if (player2 != null) {
                        player2.showData();
                    }

                    break;

                case 4:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Número incorrecto, ingrese una opción válida");
            }
        }

        System.out.println("Programa terminado.");
    }
}