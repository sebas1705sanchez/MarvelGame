public class Player {
    private String name;
    private String nickname;
    // private String password;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public void showData() {
        System.out.println("-- Datos Jugador  --");
        System.out.println("Nombre: " + name);
        System.out.println("nickname: " + nickname);
    }
}
