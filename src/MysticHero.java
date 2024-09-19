public class MysticHero {
    private String spell;
    private Personaje character;

    public MysticHero(Personaje character, String spell){
        this.character = character;
    }

    public String getName() {
        return character.getName();
    }

    public void setname(String name){
        this.character.setName(name);
    }

    public String getSpell(){
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }


}