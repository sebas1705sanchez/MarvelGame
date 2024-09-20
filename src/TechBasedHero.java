public class TechBasedHero {
    private int techLevel; //nivel de tecnologia
    private String techWeapon; //tecnologia del arma
    private Personaje character; //es un objeto que trae los atributos de la clase personaje

    public TechBasedHero(int techLevel, String techWeapon, Personaje character){
        this.techLevel = techLevel;
        this.techWeapon = techWeapon;
        this.character = character;
    }
    public int getTechLevel(){
        return techLevel;
    }
    public void setTechLevel(int techLevel){
        this.techLevel = techLevel;
    }
    public String getTechWeapon(){
        return techWeapon;
    }
    public void setTechWeapon(String techWeapon){
        this.techWeapon = techWeapon;
    }
    public String getCharacterName(){
        return character.getName();
    }
    public void setCharacterName(String name){
        this.character.setName(name);
    }

}
