package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if(this.students.containsKey(studentId)){
            return this.students.get(studentId);
        }
        return null;
    }

    public void showSummary()
    {
        //TODO
        String printSummary = "";
        if (students.size()>0){
            for (Student student : this.students.values()){
                printSummary += student + "\n" + "Enrolled Courses:\n" + student.printEnrolledCourses() + "\n";
            }
            System.out.println(printSummary);
        } else {
            System.out.println("No Student Yet");
        }

    }


    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        Student student = this.students.get(studentId);
        student.enrollToCourse(course);
    }
}
