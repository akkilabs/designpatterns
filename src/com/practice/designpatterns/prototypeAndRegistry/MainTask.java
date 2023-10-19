package com.practice.designpatterns.prototypeAndRegistry;

import java.util.ArrayList;
import java.util.List;

public class MainTask {

    public static void main(String[] args) throws Exception {
        RegistryStudent registryStudent = new RegistryStudent();
        // starting a new batch with 100 students
        // 1. creating each enrollment at a time and pass all the details
        // 2. create 100 enrollments with common data and later on add individual attribute values

        // For option 2 there should be a way to do clones of students

        Student s = new Student(1, "Sandeep",90,"Jul22","LLD","BE",2022,"Naman",2023,"RazorPay",70);

        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<100;i++){
            studentList.add(s.clone());
        }

        Student Jul22 = new Student(3, "Yashwitha",90,"Jul22","LLD","BE",2022,"Durga",2023,"RazorPay",70);
        Student Sep22 = new Student(1, "Rudresh",98,"Sep22","DSA","FS",2022,"Anshuman",2023,"RazorPay",70);

        registryStudent.addToRegistry(Jul22.getBatchName(),Jul22);
        registryStudent.addToRegistry(Sep22.getBatchName(),Sep22);

        Student akkiFeb23 = registryStudent.getFromRegistry(Sep22.getBatchName()).clone();
        akkiFeb23.setId(5);
        akkiFeb23.setName("Akki");
        akkiFeb23.setPsp(95);
    }

    public static Student getClone(Student s){
        // Instead of all this we just call s.clone() by defining clone() inside Student(C) itself.

        /*Student s1 = new Student();

        //Need to know all the implementation details of Student class

        s1.setId(s.getId());
        s1.setName(s.getName());
        s1.setPsp(s.getPsp());
        s1.setBatchName(s.getBatchName());
        s1.setModuleName(s.getModuleName());
        s1.setTrack(s.getTrack());
        s1.setJoinYear(s.getJoinYear());
        s1.setInstructorName(s.getInstructorName());
        s1.setCompletionYear(s.getCompletionYear());
        //s1.setPaymentPartner(s.getPaymentPartner); // hidden attributes will not get copied

        //Any changes in Student class attributes, need to make changes in this method as well
        s1.setBatchPSP(s.getBatchPSP());

        return s1;*/

        return s.clone();
    }

    public static ICar getCarClone(ICar c){

        //Using deep copy constructor will not work in scenarios where we have Parent class/interfaces --> upcasting

        // Is it either Tata or Maruti accept ICar --> NO
        // child class ref can't store Parent class object

       /* if(c instanceof Tata){
        return new Tata((Tata)c); // Even if we do down casting here but at runtime throws RuntimeException - CCE
        }
        return new Maruti((Maruti)c);*/ // Even if we do down casting here but at runtime throws RuntimeException -   CCE

        //return null;

        return c.clone(); // Invokes Child class clone ()
    }
}
