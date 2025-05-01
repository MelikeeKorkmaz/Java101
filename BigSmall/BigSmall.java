import java.util.Scanner;
import java.util.Arrays;

public class BigSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] sortedList = Arrays.copyOf(list, list.length);
        Arrays.sort(sortedList);

        System.out.println("Please write a number: ");
        int number = input.nextInt();
        int small = number, big = number;

        for(int i = 0; i < sortedList.length ; i++){
            if(sortedList[i] < number){
                small = sortedList[i];
            }else if(sortedList[i] > number){
                big = sortedList[i];
                break;
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println("The smallest number closest to the number: " + small);
        System.out.println("The biggest number closest to the number: " + big);
    }
}