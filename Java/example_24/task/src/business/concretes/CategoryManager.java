package business.concretes;

import business.abstracts.CategoryService;
import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

    private Logger[] logger;
    private CategoryDao categoryDao;
    private List<Category> categories;

    public CategoryManager(Logger[] logger, CategoryDao categoryDao) {
        this.logger = logger;
        this.categoryDao = categoryDao;
        this.categories = new ArrayList<>();
    }

    @Override
    public void addCategory(Category category) throws Exception{
        for(Category loopCounter: categories){
            if(loopCounter.getCategoryName().equals(category.getCategoryName())){
                throw  new Exception("Invalid Category Name");
            }
        }
        categories.add(category);
        categoryDao.addCategory(category);

        for(Logger log: logger){
            log.log(category.getCategoryName());
        }
    }

    @Override
    public void deleteCategory(Category category) {
        categories.remove(category);
        categoryDao.deleteCategory(category);
        for(Logger log:logger){
            log.log(category.getCategoryName() + " deleted.");
        }
    }

}
