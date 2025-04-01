import java.util.Scanner;
class PassingTheClass {
    public static void main(String[] args) {
        int math, phy, turk, chem, music, total = 0;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exam results between 0 and 100. If not entered correctly, they will not be included in the average and the avarage will decrease!!!");
        System.out.print("Math exam result: ");
        math = input.nextInt();
        System.out.print("Physics exam result: ");
        phy = input.nextInt();
        System.out.print("Turkish exam result: ");
        turk = input.nextInt();
        System.out.print("Chemistry exam result: ");
        chem = input.nextInt();
        System.out.print("Music exam result: ");
        music = input.nextInt();

        if (0 <= math && math <= 100) {
            total += math;
        }
        if (0 <= phy && phy <= 100) {
            total += phy;
        }
        if (0 <= turk && turk <= 100) {
            total += turk;
        }
        if (0 <= chem && chem <= 100) {
            total += chem;
        }
        if (0 <= music && music <= 100) {
            total += music;
        }
        avg = total / 5.0;

        System.out.println("==========================");
        System.out.println("Class passing grade: 55");
        System.out.println("Your average: " + avg);

        if(avg < 55){
            System.out.println("You failed the class!");
        }else{
            System.out.println("You passed the class!");
        }
    }
}