public class Personaje {
    private String name;
    private int health;
    private int power;

    public Personaje(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void damageTake(int damage) {
        this.health -= damage;
    }

    public void heal(int vida) {
        this.health += vida;
    }
}
