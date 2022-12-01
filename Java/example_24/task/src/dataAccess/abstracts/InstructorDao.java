package dataAccess.abstracts;

import entity.Instructor;

public interface InstructorDao {

    public void addInstructor(Instructor instructor);

    public void deleteInstructor(Instructor instructor);

}
