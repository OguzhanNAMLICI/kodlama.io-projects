import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Second Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (addNumbers(firstNumber,secondNumber)));

        System.out.println("Squared value of 10 is : " + square(10));

        System.out.println("10 + 22 + 32 + 56: " + addNumber(10,22,32,56));


    }

    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int square(int number){
        return (int) Math.pow(number,2);
    }


    public static int addNumber(int... numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

}