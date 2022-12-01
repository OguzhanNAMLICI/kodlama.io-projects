public class Main {
    public static void main(String[] args) {

        //GameCalculator gameCalculator = new GameCalculator();
        GameCalculator gameCalculator = new AssassinGameCalculator();
        GameCalculator gameCalculator1 = new WarriorGameCalculator();
        GameCalculator gameCalculator2 = new MageGameCalculator();

        gameCalculator.calculate();
        gameCalculator1.calculate();
        gameCalculator2.calculate();
    }
}