import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int indexOfArray = scanner.nextInt();

        int[] arrays  = new int[indexOfArray];

        for(int i = 0; i < arrays.length; i++){
            System.out.print("Enter " + (i+1) + ". elements: " );
            arrays[i] = scanner.nextInt();
        }

        for(int i = 0; i < arrays.length; i++){
            System.out.println((i+1)+ ". element: " + arrays[i]);
        }
    }

}