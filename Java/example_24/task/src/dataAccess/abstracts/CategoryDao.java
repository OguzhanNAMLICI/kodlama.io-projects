package dataAccess.abstracts;

import entity.Category;

public interface CategoryDao {

    public void addCategory(Category category);

    public void deleteCategory(Category category);

}
