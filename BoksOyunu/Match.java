public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (f1.health > 0 && f2.health > 0) {
                if (choose()) {
                    System.out.println("------------");
                    System.out.println(f2.name + " dövüşçüsü " + f1.name + " dövüşçüsüne " + f2.damage + " hasar verdi.");
                    f1.health = f2.hit(f1);
                    if (f1.health > 0) {
                        System.out.println(f1.name + " dövüşçüsü " + f2.name + " dövüşçüsüne " + f1.damage + " hasar verdi.");
                        f2.health = f1.hit(f2);
                    }
                } else {
                    System.out.println("------------");
                    System.out.println(f1.name + " dövüşçüsü " + f2.name + " dövüşçüsüne " + f1.damage + " hasar verdi.");
                    f2.health = f1.hit(f2);
                    if (f2.health > 0) {
                        System.out.println(f2.name + " dövüşçüsü " + f1.name + " dövüşçüsüne " + f2.damage + " hasar verdi.");
                        f1.health = f2.hit(f1);
                    }
                }
            }
        } else {
            System.out.println("Dövüşçülerin sikletleri uyuşmuyor!");
        }
    }

    boolean isCheck() {
        if ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight)) {
            return true;
        } else {
            return false;
        }
    }

    boolean choose() {
        double result = Math.random() * 100;
        if (result < 50) {
            return true;
        } else {
            return false;
        }
    }
}