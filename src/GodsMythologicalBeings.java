public class GodsMythologicalBeings {
    private Personaje character;
    private String specialAbility;

    public GodsMythologicalBeings(Personaje character, String specialAbility) {
        this.character = character;
        this.specialAbility = specialAbility;
    }

    public String getCharacterName() {
        return character.getName();
    }

    public void SetCharacterName(String name) {
        this.character.setName(name);
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

}
