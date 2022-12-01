package entity;

public class Course {

    private int id;
    private String courseName;
    private Instructor instructor;
    private double coursePrice;

    public Course() {
    }

    public Course(int id, String courseName, double coursePrice) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", instructor=" + instructor +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
