public class Main {
    public static void main(String[] args) {

        int number = 8;

        int firstNumber = 15;
        int secondNumber = 20;
        int thirdNumber = 30;

        if(number < 20){
            System.out.println("The number is less than 20. Your number is: " + number);
        }else if(number == 20){
            System.out.println("Number is equal to 20.");
        }else{
            System.out.println("The number is greater than 20. Your number is: " + number);
        }


        
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The first number greater than the other two numbers. First Number: " + firstNumber);
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("The second number greater than the other numbers. two Second Number: " + secondNumber);
        }else{
            System.out.println("The third number greater than the other two numbers. Third Number: " + thirdNumber);
        }
        
    }
}