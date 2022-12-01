package dataAccess.abstracts;

import entity.Course;

public interface CourseDao {

    public void addCourse(Course course);

    public void deleteCourse(Course course);
}
