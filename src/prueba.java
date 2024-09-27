import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        List<Personaje> characters = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Player player = new Player("sebas");

        Personaje thor = new Personaje("thor", 1000, 105);
        GodsMythologicalBeings diosThor = new GodsMythologicalBeings(thor, "trueno");
        characters.add(thor);
        Personaje zeus = new Personaje("Zeus", 1200, 110);
        GodsMythologicalBeings diosZeus = new GodsMythologicalBeings(zeus, "rayo");
        characters.add(zeus);
        Personaje hades = new Personaje("Hades", 950, 95);
        GodsMythologicalBeings diosHades = new GodsMythologicalBeings(hades, "inframundo");
        characters.add(hades);
        Personaje athena = new Personaje("Athena", 900, 90);
        GodsMythologicalBeings diosAthena = new GodsMythologicalBeings(athena, "sabiduría");
        characters.add(athena);
        Personaje poseidon = new Personaje("Poseidón", 1100, 100);
        GodsMythologicalBeings diosPoseidon = new GodsMythologicalBeings(poseidon, "agua");
        characters.add(poseidon);
        Personaje loki = new Personaje("Loki", 850, 80);
        GodsMythologicalBeings diosLoki = new GodsMythologicalBeings(loki, "engaño");
        characters.add(loki);

        System.out.println("Cantidad de Personajes: ");
        System.out.println(characters.size());
        System.out.println("_________________________");

        for (Personaje p: characters) {
            System.out.println("Id: " + p.getId() + " Name: " + p.getName());
        }
        System.out.println("Personaje 1: ");
        int op = sc.nextInt();
        player.setCharacters(characters.get(op));

        System.out.println("Personaje 2: ");
        op = sc.nextInt();
        player.setCharacters(characters.get(op));

        System.out.println("Lista de Personajes: ");
        player.getListCharacter();
        System.out.println("_____________________");

        System.out.println("Eliminar un Personaje");
        op = sc.nextInt();

        System.out.println("Eleguido");
        System.out.println(characters.get(op).getName());
        System.out.println("------------");

        characters.remove(op);

        System.out.println("Lista de Personajes menos el que se borro: ");
        for (Personaje p: characters) {
            System.out.println(p.getName());
            p.getId();
        }

    }
}
