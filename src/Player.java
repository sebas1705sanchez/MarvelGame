public class Player {
    static int id = 0;
    private String name;
    private String nickname;
    // private String password;

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;

        id ++;
    }

    public void showData() {
        System.out.println("-- Datos Jugador " + id + " --");
        System.out.println("Nombre: " + name);
        System.out.println("nickname: " + nickname);
    }
}
