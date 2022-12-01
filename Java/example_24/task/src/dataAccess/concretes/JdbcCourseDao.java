package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entity.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName() + " added to database with jdbc.");
    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println(course.getCourseName() + " deleted to database with jdbc.");
    }
}
