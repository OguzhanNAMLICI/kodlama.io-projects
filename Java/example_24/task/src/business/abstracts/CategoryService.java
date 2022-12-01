package business.abstracts;

import entity.Category;

public interface CategoryService {

    public void addCategory(Category category) throws Exception;

    public void deleteCategory(Category category) throws Exception;
}
