import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner obj = new Scanner(System.in);
        int[] count = new int[5];
        System.out.println("[Random numbers test]");
        System.out.println("Enter the amount of times you want this to run");
        int counter = obj.nextInt();
        for (int i = 0; i < counter; i++){
            int Num = rand.nextInt(1, 6);
            switch (Num){
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
            }
        }
        System.out.println("Program Statistics:");
        System.out.println("1: " + count[0]);
        System.out.println("2: " + count[1]);
        System.out.println("3: " + count[2]);
        System.out.println("4: " + count[3]);
        System.out.println("5: " + count[4]);
        int sum = 0;
        for (int p : count) {
            sum += p;
        }
        int mean = sum / 5;

        int highIndex = 0;
        int lowIndex = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] > count[highIndex]) {
                highIndex = i;
            }
            if (count[i] < count[lowIndex]) {
                lowIndex = i;
            }
        }
        System.out.println("Successfully ran " + sum + "/" + counter + " tests");
        System.out.println("[Further Breakdown]");
        System.out.println("The mean is: " + mean);
        System.out.println("The number that was called the most was: " + (highIndex + 1) + " (" + count[highIndex] + " times)");
        System.out.println("The number that was called the least was: " + (lowIndex + 1) + " (" + count[lowIndex] + " times)");
    }
}