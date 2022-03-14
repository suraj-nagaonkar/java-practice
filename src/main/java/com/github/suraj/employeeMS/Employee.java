package com.github.suraj.employeeMS;

/**
 * @author 11-03-2022
 */

public class Employee {
    private String name;
    private int id;
    private int age;
    private String maritalstatus;
    private String bloodgorup;
    private int experience;
    private int salary;

    public Employee(String name, int id, int age, String maritalstatus, String bloodgroup, int experience, int salary){
        this.name = name;
        this.id = id;
        this.maritalstatus = maritalstatus;
        this.bloodgorup = bloodgroup;
        this.experience = experience;
        this.salary = salary;
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

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getBloodgorup() {
        return bloodgorup;
    }

    public void setBloodgorup(String bloodgorup) {
        this.bloodgorup = bloodgorup;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
