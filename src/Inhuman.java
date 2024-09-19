public class Inhuman {
    private String habilidad;
    private Personaje character;
    private String armorhability;

    public Inhuman(String habilidad, Personaje character, String armorhability) {
        this.habilidad = habilidad;
        this.character = character;
        this.armorhability = armorhability;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getName() {
        return character.getName();
    }

    public String getArmorhability() {
        return armorhability;
    }

    public void setArmorhability(String armorhability) {
        this.armorhability = armorhability;
    }

}