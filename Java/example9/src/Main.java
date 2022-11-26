import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cities = new String[2][2];


       for(int i = 0; i < cities.length; i++){
           for(int j = 0; j < cities[i].length; j++){
               System.out.print("Enter a City: ");
               cities[i][j] = scanner.nextLine();
           }
       }


       for(String[] city : cities){
           for(String index : city){
               System.out.println(index);
           }
       }

    }
}