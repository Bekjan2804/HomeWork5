public class Hero {

    private int health;
    private  int damage;
    private  String Superpowers;

    public Hero(int helth, int damage, String superpowers) {
        this.health = helth;
        this.damage = damage;
        Superpowers = superpowers;
    }

    public Hero(int helth, int damage) {
        this.health = helth;
        this.damage = damage;
    }

    public int getHelth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpowers() {
        return Superpowers;
    }
}
