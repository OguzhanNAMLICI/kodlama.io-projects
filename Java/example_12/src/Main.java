public class Main {
    public static void main(String[] args) {

        int number = 28;
        System.out.println(isPerfect(number));

    }

    public static boolean isPerfect(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }
}