package com.practice.designpatterns.builder;
public class Student {

    private int id;
    private String name;
    private int age;
    private String email;
    private String phoneNum;
    private String universityName;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(int id, String name, int age, String email, String phoneNum, String universityName, int gradYear, double psp, String batchName) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.email=email;
        this.phoneNum=phoneNum;
        this.universityName=universityName;
        this.gradYear=gradYear;
        this.psp=psp;
        this.batchName=batchName;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private String email;
        private String phoneNum;
        private String universityName;
        private int gradYear;
        private double psp;
        private String batchName;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder batchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        //validations on few fields
        private void validate(){
            if (age < 18)
                throw new InvalidAgeException();
            if (phoneNum == null)
                throw new InvalidPhoneNumException();
            if (gradYear >= 2023)
                throw new InvalidGradYearException();
        }
        public Student build(){
            validate();
            return new Student(this.id,this.name,this.age,this.email,this.phoneNum,this.universityName,this.gradYear,this.psp,this.batchName);
        }

    }
}
