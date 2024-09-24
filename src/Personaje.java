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

    public void heal(int health) {
        this.health += health;
    }

    public void attack(Personaje victima) {
        if (this.health > 0) { // Verifica que el que ataca este vivo
            if (victima.getHealth() > 0) { // verifica si el que esta siendo atacado esta vivido
                victima.damageTake(this.power);
                System.out.println(this.name + " Se realiza el ataque causando " + this.power + " de daño.");
            } else {
                System.out.println(victima.getName() + " ya ha muerto y no puede ser atacado.");
            }
        } else {
            System.out.println("El personaje atacante ha muerto y no puede atacar.");
        }
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
        System.out.println();
    }
}

