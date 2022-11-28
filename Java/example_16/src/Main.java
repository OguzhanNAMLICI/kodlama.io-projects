public class Main {
    public static void main(String[] args) {
        TeacherLoanManager teacherLoanManager = new TeacherLoanManager();

        AgriculturalLoanManager agriculturalLoanManager = new AgriculturalLoanManager();

        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(teacherLoanManager);
    }
}