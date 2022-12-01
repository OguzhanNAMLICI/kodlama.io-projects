package oppWithNLayeredApp.business;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entitites.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //business rules - basic example

        if(product.getUnitPrice() < 1){
            throw new Exception("Invalid unit price. Try again");
        }
        productDao.add(product);

        for(Logger logger: loggers){
            logger.log(product.getName());
        }
    }
}
