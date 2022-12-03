package com.firstassignment.dockerproject.model;

import jakarta.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String department;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
