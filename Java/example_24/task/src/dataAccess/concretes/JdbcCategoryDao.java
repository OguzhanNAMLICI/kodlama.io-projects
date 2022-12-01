package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entity.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void addCategory(Category category) {
        System.out.println(category.getCategoryName() + " added to database with jdbc.");
    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println(category.getCategoryName() + " deleted to database with jdbc");
    }
}
