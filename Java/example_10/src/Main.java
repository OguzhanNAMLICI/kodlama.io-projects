public class Main {
    public static void main(String[] args) {
        String message = "Hello World This is a beautiful day";

        char[] getChars = new char[5];

        System.out.println("Message Length: " + message.length());
        System.out.println("5.index: " + message.charAt(4));
        System.out.println(message.concat("."));
        System.out.println(message);
        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("Hel"));
        System.out.println(message.endsWith("day"));
        System.out.println(message.indexOf('W'));
        System.out.println(message.lastIndexOf('a'));
        System.out.println(message.replace(" ", "-"));
        System.out.println(message);
        System.out.println(message.substring(2));
        System.out.println(message.substring(2,5));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        message.getChars(0,5, getChars,0);
        System.out.println(getChars);


        for(String word : message.split(" ")){
            System.out.println(word);
        }
    }
}