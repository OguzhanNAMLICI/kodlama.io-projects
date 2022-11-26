public class Main {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10){
            for(int j = 1; j <= 10; j++){
                for(int k = 1; k <= 10; k++){
                    System.out.println(j + " * " + k + " = " + (j*k));
                }
                System.out.println();
                i++;
            }
        }
    }
}