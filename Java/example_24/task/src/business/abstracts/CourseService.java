package business.abstracts;

import entity.Course;

public interface CourseService {

    public void addCourse(Course course) throws Exception;

    public void deleteCourse(Course course);
}
