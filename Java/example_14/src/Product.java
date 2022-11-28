public class Product {

    private int id;
    private int stockAmount;
    private double price;
    private String description;
    private String name;

    public Product(){
        this(0,0,0.0,"no-description","no-name");
    }

    public Product(int id, int stockAmount, double price, String description, String name) {
        this.id = id;
        this.stockAmount = stockAmount;
        this.price = price;
        this.description = description;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", stockAmount=" + stockAmount +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
