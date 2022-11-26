public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int number){
        int numberDivideCounter = 0;
        for(int i = 1; i<=number; i++){
            if(number % i == 0){
                numberDivideCounter++;
            }
        }
        if(numberDivideCounter == 2){
            return true;
        }
        return false;
    }
}