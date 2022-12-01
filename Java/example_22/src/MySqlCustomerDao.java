
public class MySqlCustomerDao implements CustomerDao {

    @Override
    public void add() {
        System.out.println("Data added to mysqlserver database.");
    }
}
