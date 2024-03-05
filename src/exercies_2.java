import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    // change two elements position respectivly
    public static void changePlace (int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Sorting array with selection sort algorithm
    public static void printSortedArray() {
        int[] array = {3, 2, 4, 1};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                changePlace(array, i, minIndex);
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    // Creating an arraylist with cities
    public static void citiesList () {

        ArrayList<String> cities = new ArrayList<>();
        String cityName;

        for (int i=0; i < 5; i++) {
            System.out.print("Enter a city name : ");
            cityName = scanner.nextLine();
            cities.add(cityName);
        }

        System.out.println(cities);

        // Remove the last city
        cities.remove(cities.get(4));

        System.out.println("New list : " + cities);
    }

    // Create a list and write the odd numbers from 1 to 100 in this list and finally print the list
    public static void printOddNumbersList () {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i=0; i < 100; i++) {
            if (i % 2 != 0) {
                oddNumbers.add(i);
            }
        }

        System.out.println("Odd numbers:");
        for (Integer integer : oddNumbers) {
            System.out.println(integer);
        }
    }

    // Print the first 10 "mirror prime" numbers greater than 10 to the screen. If the number itself,
    // and if its inverse is prime, it is called a "mirror prime." For example, 13. Both 13,
    // also called "mirror prime" because its inverse is 31 prime. In solving the problem
    // function should also be used

    // Check the number is prime or not 
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Reverse the number
    public static int reverseNumber (int number) {
        String revers_number = "";
        while (number > 0) {
            revers_number += Integer.toString(number % 10);
            number = number /10;
        }
        return Integer.parseInt(revers_number);
    }

    public static void displayMirrorPrime () {
        
        int say = 0;
        int number = 11;

        while (true) {
            if (isPrime(number) && isPrime(reverseNumber(number))) {
                System.out.println(number);
                say++;
            }
            number++;

            if (say == 10) {
                break;
            }
        }
    }

    // two numbers are entered and the numbers in between are grouped separately, odd and even 
    public static void odds_and_evens () {

        System.out.print("Enter a first number : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a second number : ");
        int number2 = scanner.nextInt();

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        if (number1 > number2) {
            
            int i = number2;

            for (; i <= number1; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
                else {
                    oddNumbers.add(i);
                }
            }
        }
        else {
            int i = number1;

            for (; i <= number2; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
                else {
                    oddNumbers.add(i);
                }
            }
        }

        System.out.println("Odd Numbers : " + oddNumbers);
        System.out.println("Even Numbers : " + evenNumbers);
    }

    // any list is taken and a new list is created containing only the square of its elements less than 30. 
    // Methods such as map and filter must be used
    public static void squareElements () {

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        int randomNumber;

        for (int i=0; i < 20; i++) {
            randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }
        System.out.println(numbers);

        ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().filter(n -> n > 30).map(n -> n*n).collect(Collectors.toList());
        System.out.println(squareNumbers);
    }

    // Fibonacci numbers less than 10000
    public static void fibonacci () {
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(2);

        int number;

        while (true) {

            int lastindex = fibonacciNumbers.size() - 1;
            number = fibonacciNumbers.get(lastindex - 1) + fibonacciNumbers.get(lastindex);

            if (number > 10000) {
                break;
            }

            fibonacciNumbers.add(number);
        }

        System.out.println(fibonacciNumbers);
    }

    /* A number n is entered. The sum of the squares of the digits of this number is found and the same process is applied to the resulting number. 
    If we get 1 at the end of the process, the entered number n is called the "lucky number" number.
    Sample: n=19
    1^2+9^2=82 -> 8^2+2^2=68 -> 6^2+8^2=100 -> 1^2+0^2+0^2=1
    So the number 19 is "lucky." Determine if the entered number is "lucky" */
    public static int digits_square_sum (int number) {

        int sum = 0;

        while (number > 0) {
            sum += Math.pow(number % 10, 2);
            number = number / 10;
        }

        return sum;
    }

    public static void happyNumber () {

        System.out.print("Enter a number : ");
        int movingNumber  = scanner.nextInt();
        int stuckBeforeNumber = movingNumber;

        while (true) {
            movingNumber = digits_square_sum(movingNumber);
            stuckBeforeNumber = digits_square_sum(digits_square_sum(stuckBeforeNumber));

            if (movingNumber == 1 || stuckBeforeNumber == 1 || movingNumber == stuckBeforeNumber) {
                break;
            }
        }

        if (movingNumber == 1 || stuckBeforeNumber == 1) {
            System.out.println("This is a Happy Number.");
        } else {
            System.out.println("This is not a Happy Number.");
        }
    }

    
    public static void main(String[] args) {

        // sumNumbers();
        // printMaxValue();
        // findNumber();
        // printSortedArray();
        // citiesList();
        // printOddNumbersList();
        // displayMirrorPrime();
        // odds_and_evens();
        // squareElements();
        // fibonacci();
        // happyNumber();

        /* ---------------------------------------------------------------------------------------------- */

        // If we order the first 6 prime numbers from smallest to largest, we see that the 6th is 13. 
        // Therefore, print the 10001th prime number on the screen.

        // ArrayList<Integer> prime_numbers = new ArrayList<>();
        // int n = 1;
        // int index = -1;

        // while (true) {

        //     if (isPrime(n)) {
        //         prime_numbers.add(n);
        //         index++;
        //     }

        //     if (index == 10001) {
        //         break;
        //     }

        //     n++;

        // }
        // System.out.println(index);
        // System.out.println("10001st prime number : " + prime_numbers.get(index));
    }
}
