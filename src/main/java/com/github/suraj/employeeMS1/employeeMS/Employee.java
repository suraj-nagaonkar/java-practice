package com.github.suraj.employeeMS1.employeeMS;

/**
 * @author 11-03-2022
 */

public class Employee {
    private String name;
    private int id;
    private int age;
    private String bloodgroup;
    private int salary;
    private int experience;
    private String maritalstatus;

    Employee(String name, int id, int age, String bloodgroup, int salary, int experience, String maritalstatus){
        this.name = name;
        this.id = id;
        this.age = age;
        this.bloodgroup = bloodgroup;
        this.salary = salary;
        this.experience = experience;
        this.maritalstatus = maritalstatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }
}
