public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 15, 120, 80, 30, 50);
        Fighter f2 = new Fighter("B", 20, 100, 75, 40, 50);

        Match m1 = new Match(f1, f2, 70, 85);

        m1.run();
    }
}