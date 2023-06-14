import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    // function to checkPalindrome
    public void checkPalindrome() {
        System.out.println("Palindrome");

        System.out.print("enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;
        int processedNumber = 0;

        while (tempNumber != 0) {
            processedNumber = processedNumber * 10 + (tempNumber % 10);
            tempNumber /= 10;
        }

        if (processedNumber == number) {
            System.out.println("yes, the given number is palindrome.");
        } else {
            System.out.println("no, the given number is not palindrome");
        }

    }

    // function to printPattern
    public void printPattern() {
        System.out.println("Print pattern");

        System.out.print("enter a number: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.println("Check prime number");
        System.out.print("enter a number: ");
        int number = sc.nextInt();

        if (number == 0 || number == 1) {
            System.out.println("no, the given number is not a prime number.");
        } else {
            int flag = 0;
            for (int i = 2; i <= (number / 2); i++) {
                if (number % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("no, the given number is not a prime number.");
            } else {
                System.out.println("yes, the given number is a prime number.");
            }
        }
    }

    // function to print Fibonacci Series
    public void printFibonacciSeries() {

        // initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;

        System.out.println("Print fibonacci series");
        System.out.print("enter the length size: ");

        int length = sc.nextInt();

        System.out.print("the fibonacci series is: ");
        if (length == 1) {
            System.out.print(first);
        } else if (length == 2) {
            System.out.print(first + ", " + second);
        } else {
            System.out.print(first + ", " + second);
            for (int i = 1; i <= (length - 2); i++) {
                int temp = first + second;
                System.out.print(", " + temp);
                first = second;
                second = temp;
            }
        }
        System.out.println();

    }

    // main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1: {
                    obj.checkPalindrome();
                }
                    break;
                case 2: {
                    obj.printPattern();
                }
                    break;
                case 3: {
                    obj.checkPrimeNumber();
                }
                    break;
                case 4: {
                    obj.printFibonacciSeries();
                }
                    break;
                default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}