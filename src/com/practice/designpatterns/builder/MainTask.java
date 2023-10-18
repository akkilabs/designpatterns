package com.practice.designpatterns.builder;

public class MainTask {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id(10)
                .name("Sandeep")
                .age(24)
                .email("sandeep@tesla.com")
                .phoneNum("9988776655")
                .universityName("Chicago")
                .gradYear(2016)
                .psp(90)
                .batchName("LLD")
                .build();

        System.out.println(student1.toString());

        Student student2 = Student.builder()
                .id(11)
                .name("krishna")
                .age(22)
                .phoneNum("9933557799")
                .gradYear(2020)
                .build();

        System.out.println(student2.toString());
    }
}

