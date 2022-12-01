package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entity.Category;

public class HibernateCategoryDaoImpl implements CategoryDao {

    @Override
    public void addCategory(Category category) {
        System.out.println(category.getCategoryName() + " added to database with hibernate.");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println(category.getCategoryName() + " deleted to database with hibernate");
    }
}
