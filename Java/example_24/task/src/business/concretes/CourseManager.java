package business.concretes;

import business.abstracts.CourseService;
import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entity.Course;

import java.util.List;

public class CourseManager  implements CourseService {

    private Logger[] logger;
    private CourseDao courseDao;
    private List<Course> courses;


    public CourseManager(Logger[] logger, CourseDao courseDao, List<Course> courses) {
        this.logger = logger;
        this.courseDao = courseDao;
        this.courses = courses;
    }


    @Override
    public void addCourse(Course course) throws Exception{
        if(course.getCoursePrice() < 0){
            throw new Exception("Invalid Course Price");
        }else{
            for(Course loopCounter: courses){
                if(loopCounter.getCourseName().equals(course.getCourseName())){
                    throw  new Exception("Invalid Course Name");
                }
            }
            courses.add(course);
            courseDao.addCourse(course);
            for(Logger log: logger){
                log.log(course.getCourseName());
            }
        }
    }

    @Override
    public void deleteCourse(Course course) {
        courses.remove(course);
        courseDao.deleteCourse(course);
        for(Logger log: logger){
            log.log(course.getCourseName() + " delete.");
        }

    }
}
