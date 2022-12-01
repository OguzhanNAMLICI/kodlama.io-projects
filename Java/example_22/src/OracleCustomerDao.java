public class OracleCustomerDao implements CustomerDao{

    @Override
    public void add() {
        System.out.println("Data added to oracle database");
    }
}
