public class ProductManager {

    public void addProduct(Product product){
        System.out.println(product.getName() + " added.");
    }

    public void deleteProduct(Product product){
        System.out.println(product.getName() + " deleted.");
    }
}
