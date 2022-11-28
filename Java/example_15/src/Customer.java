public class Customer extends Person{

    private String customerNumber;

    public Customer() {
        super(0,"default","default","default","default","default");
    }

    public Customer(int id, String firstName, String lastName, String phoneNumber, String dateOfBirth, String email, String customerNumber) {
        super(id, firstName, lastName, phoneNumber, dateOfBirth, email);
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                "} " + super.toString();
    }
}
