/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio2.model;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Person implements Serializable {
    
    private String name;
    private int age;
    private double salary;

    
   
    
    
    
    public Person(String name, int age, double salary) {
        
        setAge(age);
        setName(name);
        setSalary(salary);
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
    
    
    
}
