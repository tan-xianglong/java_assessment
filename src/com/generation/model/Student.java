package com.generation.model;

import com.generation.service.CourseService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private Map<Course, Double> enrolledCourses;


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        this.enrolledCourses = new HashMap<>();
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        this.enrolledCourses.put(course, 0.0);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        if (this.enrolledCourses.size() > 0) {
            List<Course> enrolledCoursesList = new ArrayList<>();
            for(Course course : this.enrolledCourses.keySet()){
                if (this.enrolledCourses.get(course) >= PASS_MIN_GRADE){
                    enrolledCoursesList.add(course);
                }
            }
            return enrolledCoursesList;
        }
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        for(Course course : this.enrolledCourses.keySet()){
            if(course.getCode().equals(courseId)){
                return  course;
            }
        }
        return null;
    }

    public void gradeCourse (Course course, double courseGrade){
        this.enrolledCourses.replace(course, courseGrade);
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        if (this.enrolledCourses.size() > 0) {
            List<Course> enrolledCoursesList = new ArrayList<>();
            for(Course course : this.enrolledCourses.keySet()){
                enrolledCoursesList.add(course);
            }
            return enrolledCoursesList;
        }
        return null;
    }

    private double getGrade(Course course){
        return this.enrolledCourses.get(course);
    }

    public String printEnrolledCourses()
    {
        String printEnrolledCourses = "";

        for (int i = 0; i < this.getEnrolledCourses().size(); i++){
            String grade = "";
            if(getGrade(this.getEnrolledCourses().get(i)) != 0){
                grade = " Grade: "+ String.valueOf(getGrade(this.getEnrolledCourses().get(i)));
            }
            printEnrolledCourses += this.getEnrolledCourses().get(i) + grade + "\n";
        }
        return printEnrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
