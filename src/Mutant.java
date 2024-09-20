public class Mutant {
    private String specialAbility;
    private String transformation;
    private Personaje character;


    public Mutant(Personaje character, String specialability, String transformation){
        this.character = character;
        this.specialAbility = specialability;
        this.transformation = transformation;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public String getTransformation() {
        return transformation;
    }

    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }

    public String getCharacterName() {
        return character.getName();
    }

    public void setCharacterName(String name){
        this.character.setName(name);
    }

    public void activateTransformation() {
        System.out.println("El personaje " + character.getName() + " se tranformo " + transformation);
    }
}