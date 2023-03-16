public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(300);
        boss.setDamage(150);
        boss.setTypeOfProtection("Armor");
        System.out.println(
                "Health: " + boss.getHealth() +
                        "Damage: " + boss.getDamage() +
                        "Type of protection: " + boss.getTypeOfProtection());
    }


}





