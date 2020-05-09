package kz.iitu.projects.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String name;
    private double salary;
    @Enumerated(EnumType.STRING)
    private EmployeeType EmployeeType;


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public long getID(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
}
