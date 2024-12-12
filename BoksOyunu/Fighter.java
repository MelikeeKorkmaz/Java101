public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int chance;

    Fighter(String name, int damage, int health, int weight, int dodge, int chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.chance = chance;
    }

    int hit(Fighter foe) {
        if (isDodge()) {
            System.out.println(foe.name + " dövüşçüsü hasarı blokladı.");
            System.out.println(foe.name + " canı: " + foe.health);
            return foe.health;
        } else {
            foe.health -= damage;
            if (foe.health <= 0) {
                foe.health = 0;
                System.out.println(foe.name + " canı: " + foe.health);
                System.out.println(this.name + " dövüşçüsü maçı kazandı!");
                return 0;
            }
            System.out.println(foe.name + " canı: " + foe.health);
            return foe.health;
        }
    }

    boolean isDodge() {
        double randomNum = Math.random() * 100;
        if (dodge >= randomNum) {
            return true;
        }
        return false;
    }
}