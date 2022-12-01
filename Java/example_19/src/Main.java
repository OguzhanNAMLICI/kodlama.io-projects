public class Main {
    public static void main(String[] args) {
        MainLoanManager[] mainLoanManagers = new MainLoanManager[]{new TeacherLoanManager(), new AgriculturalLoanManager(),new StudentLoanManager()};

        for(MainLoanManager mainLoanManager : mainLoanManagers){
            System.out.println(mainLoanManager.calculate(1000));
        }
    }
}