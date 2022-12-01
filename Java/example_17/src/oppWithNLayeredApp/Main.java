package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.core.logging.MailLogger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.entitites.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"Iphone 11",15000);

       Logger[] loggers = {new DatabaseLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);

        productManager.add(product);

    }
}
