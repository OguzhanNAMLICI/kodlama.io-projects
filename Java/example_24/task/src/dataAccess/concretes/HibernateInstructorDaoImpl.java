package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import entity.Instructor;

public class HibernateInstructorDaoImpl implements InstructorDao {
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " added to database with hibernate.");
    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " deleted to database with hibernate.");
    }
}
