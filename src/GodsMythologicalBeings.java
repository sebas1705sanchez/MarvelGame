public class GodsMythologicalBeings {
    private Personaje character;
    private String specialAbility;

    public GodsMythologicalBeings(Personaje character, String specialAbility) {
        this.character = character;
        this.specialAbility = specialAbility;
    }

    public String getName() {
        return character.getName();
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

}
