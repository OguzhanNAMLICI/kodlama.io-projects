package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entitites.Product;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product){
        System.out.println(product.getName() + " added to database with Hibernate");
    }
}
