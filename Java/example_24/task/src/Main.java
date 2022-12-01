import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.abstracts.Logger;
import core.concretes.EmailLogger;
import core.concretes.FileLogger;
import core.concretes.SmsLogger;
import dataAccess.concretes.HibernateCourseDaoImpl;
import dataAccess.concretes.HibernateInstructorDaoImpl;
import dataAccess.concretes.JdbcCategoryDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        Category programmingCategory = new Category(1,"Programming");
        Category financeCategory = new Category(2,"Finance");


        Course javaCourse = new Course(1,"Java",20);
        Course angularCourse = new Course(2,"Angular",25);
        Course javaScriptCourse = new Course(3,"JavaScript",30);


        Instructor instructor = new Instructor(1,"Tim","Price","timprice@email.com");



        Logger[] loggers = {new FileLogger(), new EmailLogger(), new SmsLogger()};



        //programming course list
        List<Course> courseList = new ArrayList<>();

        //finance course list
        List<Course> courses = new ArrayList<>();


        instructor.setCourses(courseList);

        programmingCategory.setCourses(courseList);
        financeCategory.setCourses(courses);


        javaCourse.setInstructor(instructor);
        angularCourse.setInstructor(instructor);
        javaScriptCourse.setInstructor(instructor);

        CourseManager courseManager = new CourseManager(loggers, new HibernateCourseDaoImpl(), courseList);

        courseManager.addCourse(javaCourse);
        System.out.println("=======================");
        courseManager.addCourse(angularCourse);
        System.out.println("=======================");
        courseManager.addCourse(javaScriptCourse);
        System.out.println("=======================");
        courseManager.deleteCourse(angularCourse);
        System.out.println("=======================");


        CategoryManager categoryManager = new CategoryManager(loggers, new JdbcCategoryDao());

        categoryManager.addCategory(programmingCategory);
        System.out.println("=======================");
        categoryManager.addCategory(financeCategory);
        System.out.println("=======================");
        categoryManager.deleteCategory(financeCategory);
        System.out.println("=======================");


        InstructorManager instructorManager = new InstructorManager(loggers, new HibernateInstructorDaoImpl());
        instructorManager.addInstructor(instructor);
        System.out.println("=======================");
        instructorManager.deleteInstructor(instructor);




    }
}