package com.hcl.employee;

public class Employees {
    private int empid;
    private String name;
    private double salary; 
    private String designation;
    private int age;
    private String phoneNo;
    
 // constructor 
    public Employees(int empid, String name, double salary, 
            String designation, int age, String phoneNo)
    {
       this.name = name;
       this.salary = salary;
       this.designation = designation;
       this.age = age;
       this.phoneNo = phoneNo;
       this.empid = empid;
    } 
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    } 
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

  //Overriding toString() method  
    @Override  
    public String toString() {  
        return "Employees [empid = " + empid + ", name = " + name + ", salary = " + salary + ", designation = " + designation  
                + ", age = " + age + ", phoneNo = " + phoneNo + "]";  
        }

     
}
