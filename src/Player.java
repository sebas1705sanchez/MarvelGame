import java.util.ArrayList;
import java.util.List;

public class Player {
    private String nickname;
    private List<Personaje> characters;

    public Player(String nickname) {
        this.nickname = nickname;

        this.characters = new ArrayList<>();
    }

    public void getListCharacter() {
        for (int i = 0; i< characters.size(); i++) {
            System.out.println(characters.get(i).getName());
        }
    }

    public void setCharacters(Personaje characters) {
        this.characters.add(characters);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void showData() {
        System.out.println("-- Datos Jugador  --");
        System.out.println("nickname: " + nickname);
    }
}
