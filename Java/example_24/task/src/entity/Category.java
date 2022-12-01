package entity;

import java.util.List;

public class Category {
    private int id;
    private String categoryName;
    private List<Course> courses;

    public Category() {

    }


    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", courses=" + courses +
                '}';
    }
}

