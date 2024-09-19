public class Mutant {
    private String specialAbility;
    private String transformation;
    private Personaje character;


    public Mutant(Personaje character, String specialability, String transformation){
        this.character = character;
        this.specialAbility = specialability;
        this.transformation = transformation;
    }
    //getters
    public String getSpecialAbility() {
        return specialAbility;
    }

    public String getTransformation() {
        return transformation;
    }

    public String getName() {
        return character.getName();
    }
    // Setters
    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }

    public void activateTransformation() {
        System.out.println("El personaje " + character.getName() + " se tranformo " + this.transformation);
    }

}