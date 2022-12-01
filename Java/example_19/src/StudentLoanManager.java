public class StudentLoanManager extends MainLoanManager{
    @Override
    public double calculate(double amount) {
        return amount * 1.10;
    }
}
