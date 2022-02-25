package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private List<Course> enrolledCourses;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
