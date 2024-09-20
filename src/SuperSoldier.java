public class SuperSoldier {
    private String habilidad;
    private Personaje character;
    private String armorhability;

    public SuperSoldier(String habilidad, Personaje character, String armorhability) {
        this.habilidad = habilidad;
        this.character = character;
        this.armorhability = armorhability;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getCharacterName() {
        return character.getName();
    }

    public void setCharacterName(String name){
        this.character.setName(name);
    }

    public String getArmorhability() {
        return armorhability;
    }

    public void setArmorhability(String armorhability) {
        this.armorhability = armorhability;
    }

}