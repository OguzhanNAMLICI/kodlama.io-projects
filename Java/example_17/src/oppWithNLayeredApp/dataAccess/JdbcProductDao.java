 package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entitites.Product;

public class JdbcProductDao implements ProductDao{

    @Override
    public void add( Product product){
        System.out.println(product.getName() + " added to database with JDBC");
    }


}
