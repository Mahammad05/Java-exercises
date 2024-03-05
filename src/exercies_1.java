import java.util.Scanner;

public class exercies_1 {

    private static Scanner scanner = new Scanner(System.in);

    /* Print the given number's positive divisiors */
    public static void positiveDivisors (int number) {
        System.out.println(number + "'s positive divisors are :");
        for (int i=1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    /* Check the given number is perfect or not */
    public static void isPerfectNumber (int number) {
        int divisors_sum = 0;

        for (int i=1; i < number; i++) {
            if (number % i == 0) {
                divisors_sum += i;
            }
        }

        if (divisors_sum == number) {
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " is not a perfect number!");
        }
    }

    /* Sum all the even numbers between 0 and 100 */
    public static int sumEvenNumbers () {
        int number = 100;
        int sum = 0;

        while (number > 0) {
            if (number % 2 == 0) {
                sum += number;
            }
            number--;
        }

        return sum;
    
    }

    /* Check the number is prime or not */
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

    /* Print the prime numbers between the 2 entered numbers */
    public static void findPrimes () {

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("The prime numbers between " + number1 + " and " + number2 + " :");

        if (number1 > number2) {
            int i = number2;

            for (; i <= number1; i++) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
        } 
        else {
            int i = number1;

            for (; i <= number2; i++) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    
    // Get 2 numbers from the user and print the average of prime numbers between these two numbers.
    public static void calcPrimeAvrg () {

        System.out.print("Enter a first number : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a second number : ");
        int number2 = scanner.nextInt();

        int total = 0;
        int say = 0;
        double average;

        if (number1 > number2) {
            int i = number2;

            for (; i <= number1; i++) {
                if (isPrime(i)) {
                    total += i;
                    say++;
                }
            }
        }
        else {
            int i = number1;

            for (; i <= number2; i++) {
                if (isPrime(i)) {
                    total += i;
                    say++;
                }
            }
        }

        average = (double) total / say;

        System.out.println("The average of prime numbers between " + number1 + " and " + number2 + " : " + average);

    }

    /* Calculate the employee's new salary, including salary and increase percentage. */
    public static int salaryGrowth (int salary, int percentage) {
        int new_salary = salary + (salary * percentage) / 100;
        return new_salary;
    }

    /* Calculate the factorial of given number */
    public static int calcFactorial (int number) {
        int product = 1;

        for (int i=1; i <= number; i++) {
            product *= i;
        }
        return product;
    }

    /* Enter a number and print the number of digits */
    public static int countDigits (int number) {
        int count = 0;

        while (number > 0) {
            count += 1;
            number = number / 10;
        }

        return count;
    }

    /* Find the biggest digit of the given number */
    public static int fingBiggestDigit (int number) {
        int digit;
        int max_digit = 1;

        while(number > 0) {
            digit = number % 10;
            if (digit > max_digit) {
                max_digit = digit;
            }
            number = number / 10;
        }
        return max_digit;
    }

    /* Calculate the sum and product of the given number digits */
    public static void calc_Sum_Product (int number) {
        int digits_sum = 0;
        int digits_product = 1;

        while (number > 0) {
            digits_sum += number % 10;
            digits_product *= number % 10;
            number = number / 10;
        }
        System.out.println("The sum of the given number digits : " + digits_sum);
        System.out.println("The product of the given number digits : " + digits_product);
    }

    /* Reverse the given number */
    public static int reverseNumber (int number) {
        String revers_number = "";
        while (number > 0) {
            revers_number += Integer.toString(number % 10);
            number = number /10;
        }
        return Integer.parseInt(revers_number);
    }

    public static void main (String[] args) {

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        positiveDivisors(number);
        /* -------------------------------------------------------------- */
        isPerfectNumber(number);
        /* -------------------------------------------------------------- */
        calc_Sum_Product(number);
        /* -------------------------------------------------------------- */

        // Call the calcFactorial()
        System.out.println("Factiorial : " + calcFactorial(number));

        /* -------------------------------------------------------------- */
        // Call the sumEvenNumbers()
        System.out.println("Sum of the even numbers between 0 and 100 : " + sumEvenNumbers());

        /* -------------------------------------------------------------- */
        // Call the countDigits()
        System.out.println("The number of digits of given number : " + countDigits(number));

        /* -------------------------------------------------------------- */
        // Call the findBiggestDigit()
        System.out.println("The biggest digit of given number : " + fingBiggestDigit(number));

        /* -------------------------------------------------------------- */
        // Call the reverseNumber()
        System.out.println("Reverse of the given number : " + reverseNumber(number));

        /* -------------------------------------------------------------- */

        findPrimes();
        
        calcPrimeAvrg();

        /* -------------------------------------------------------------- */

        /* -------------------------------------------------------------- */ 
        
        System.out.print("Enter your current salary : ");
        int salary = scanner.nextInt();

        System.out.print("Enter the increase percentage : ");
        int percentage = scanner.nextInt();

        System.out.println("Your new salary is " + salaryGrowth(salary, percentage));

        /* -------------------------------------------------------------- */

        /* ------------------------------------------------------------------------------------------------------------------ */

        // Print whether the student passed the class based on the visa entered (30%), individual activity (20%) and final grades (50%) 

        System.out.print("Enter a visa score : ");
        int visa = scanner.nextInt();

        System.out.print("Enter a individual activity score : ");
        int indactiv = scanner.nextInt();

        System.out.print("Enter a final score : ");
        int final_score = scanner.nextInt();
        
        double total_score = (visa * 3 / 10.0) + (indactiv * 2 / 10.0) + (final_score * 5 / 10.0);

        if (total_score >= 91) {
            System.out.println("You passed. Score : " + total_score + " A ");
        }
        else if (total_score >= 81) {
            System.out.println("You passed. Score : " + total_score + " B ");
        }
        else if (total_score >= 71) {
            System.out.println("You passed. Score : " + total_score + " C ");
        }
        else if (total_score >= 61) {
            System.out.println("You passed. Score : " + total_score + " D ");
        }
        else if (total_score >= 51) {
            System.out.println("You passed. Score : " + total_score + " E ");
        }
        else {
            System.out.println("You failed. Score : " + total_score + " F ");
        }

        /* ------------------------------------------------------------------------------------------------------------------ */

        /* ------------------------------------------------------------------------------ */

        // Let the user enter input until he enters 0. Add up what he entered. When he enters 0, it ends and the total is displayed. 

        int total = 0;

        while (true) {
            System.out.print("Enter a number : ");
            int number2 = scanner.nextInt();

            total += number2;
            
            if (number2 == 0) {
                System.out.println("The total of entered numbers : " + total);
                break;
            }
        }

        /* ------------------------------------------------------------------------------ */

        /* ------------------------------------------------------------------------------------------------ */
        // Calculate the sum of complex and prime numbers between 1 and the number entered by the user 

        System.out.print("Enter a number : ");
        int number3 = scanner.nextInt();

        int prime_total = 0;
        int complex_total = 0;

        for (int i=1; i <= number3; i++) {
            if(isPrime(i)) {
                prime_total += i;
            }
            else {
                complex_total += i;
            }
        }

        System.out.print("The sum of prime numbers between 1 and " + number3 + " : " + prime_total + "\n");
        System.out.print("The sum of complex numbers between 1 and " + number3 + " : " + complex_total);

        /* ------------------------------------------------------------------------------------------------ */

        /* ------------------------------------------------------------------------------------------------ */

        // Print the multiplication table to the screen

        for (int i=2; i < 10; i++) {
            System.out.println("*************************************");
            for (int j=1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i *j);
            }
        }

        /* ------------------------------------------------------------------------------------------------ */

    }
}
