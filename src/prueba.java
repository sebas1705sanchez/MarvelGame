import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        List<Personaje> characters = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

        Player player = new Player("sebas");

        System.out.println(characters.size());

        for (int i = 0; i< characters.size(); i++) {
            characters.get(i).getId();
            characters.get(i).showData();
        }
        int op = sc.nextInt();
        player.setCharacters(characters.get(op));

        op = sc.nextInt();
        player.setCharacters(characters.get(op));

        player.getListCharacter();
    }
}
