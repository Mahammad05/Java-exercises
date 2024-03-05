// import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercies_2 {
    private static Scanner scanner = new Scanner(System.in);

    // Let the user enter input until he enters 0, collect what he entered, when he enters 0, it ends and the total is displayed.
    public static void sumNumbers () {
        System.out.println("Enter numbers and to see their total enter '0'");
        int total = 0;
        int number = 1;

        while (number != 0) {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();
            total += number;
        }

        System.out.println("The total of the given numbers : " + total);

    }

    // Take a list and print the largest and smallest number in the list on the screen.
    public static void printMaxValue () {
        int[] numbers = {12, 3, 11, 22, 35, 85, 43, 54, 75, 2, 69, 53, 74, 80, 79};
        int max = 0;
        int min =numbers[0];

        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
            else if (i < min) {
                min = i;
            }
        }

        System.out.println("The largest number in the array : " + max);
        System.out.println("The smallest number in the array : " + min);
    }

    // Let's say, n = 13, the user receives input until she enters 13, and when she enters 13, 
    // the program tells her that she found it in, for example, 5 tries, that is, it prints how many tries she found.
    public static void findNumber () {
        Random random = new Random();
        int targetNumber = random.nextInt(15) + 1;
        int number;
        int attempt = 1;

        System.out.println("Try to find a secret number...");

        while (true) {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();

            if (number == targetNumber) {
                System.out.println("Correct!. You found it in " + attempt + " attempts");
                break;
            }
            else {
                System.out.println("Try again...");
            }

            attempt++;
        }
    }

    public static void main(String[] args) {
        // sumNumbers();
        // printMaxValue();
        // findNumber();
        
    }
}
