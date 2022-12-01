package business.concretes;

import business.abstracts.InstructorService;
import core.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entity.Instructor;

public class InstructorManager implements InstructorService {

    private Logger[] logger;
    private InstructorDao instructorDao;

    public InstructorManager(Logger[] logger, InstructorDao instructorDao) {
        this.logger = logger;
        this.instructorDao = instructorDao;
    }

    @Override
    public void addInstructor(Instructor instructor){
        instructorDao.addInstructor(instructor);
        for(Logger log: logger){
            log.log(instructor.getFirstName() + " " + instructor.getLastName() + " added.");
        }

    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        instructorDao.deleteInstructor(instructor);
        for(Logger log: logger){
            log.log(instructor.getFirstName() + " " + instructor.getLastName() + " deleted.");
        }
    }
}
