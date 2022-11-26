public class Main {
    public static void main(String[] args) {

        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;

        short myShortMaxValue = Short.MAX_VALUE;
        short myShortMinValue = Short.MIN_VALUE;

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        char myCharValue = 'a';
        char myOtherCharValue = 'A';


        boolean isTrue = true;
        boolean isFalse = false;

        String myStringValue= "Hello";
        String myOtherStringValue = "World";

        System.out.println("Minimum Integer Value: " + myIntMinValue);
        System.out.println("Maximum Integer Value: " + myIntMaxValue);

        System.out.println("Minimum Short Value: " + myShortMinValue);
        System.out.println("Maximum Short Value: " + myShortMaxValue);

        System.out.println("Minimum Double Value: " + myMinDoubleValue);
        System.out.println("Maximum Double Value: " + myMaxDoubleValue);

        System.out.println("Boolean: " + isTrue);
        System.out.println("Boolean: " + isFalse);

        System.out.println("Char: " + myCharValue);
        System.out.println("Char: " + myOtherCharValue);

        System.out.println(myStringValue + " " + myOtherStringValue);

    }
}