package com.example.TestParameta.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NotEmpty(message = "field cannot be empty")
    private String name;
    @NotEmpty(message = "field cannot be empty")
    private  String lastName;
    @NotEmpty(message = "field cannot be empty")
    private  String kindDocument;
    @NotEmpty(message = "field cannot be empty")
    private  String numberDocument;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotEmpty(message = "field cannot be empty")
    private Date birthday;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotEmpty(message = "field cannot be empty")
    private Date ebondingDate;
    @NotEmpty(message = "field cannot be empty")
    private String position;
    @NotEmpty(message = "field cannot be empty")
    private double salary;
    public Employee() {
    }

    public Employee(int id, String name, String lastName, String kindDocument, String numberDocument, Date birthday, Date ebondingDate, String position, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.kindDocument = kindDocument;
        this.numberDocument = numberDocument;
        this.birthday = birthday;
        this.ebondingDate = ebondingDate;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", kindDocument='" + kindDocument + '\'' +
                ", numberDocument='" + numberDocument + '\'' +
                ", birthday=" + birthday +
                ", ebondingDate=" + ebondingDate +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKindDocument() {
        return kindDocument;
    }

    public void setKindDocument(String kindDocument) {
        this.kindDocument = kindDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date setBirthday(int i, Date birthday) {
        this.birthday = birthday;
        return birthday;
    }

    public Date getEbondingDate() {
        return ebondingDate;
    }

    public void setEbondingDate(Date ebondingDate) {
        this.ebondingDate = ebondingDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
