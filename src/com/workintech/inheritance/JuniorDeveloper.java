package com.workintech.inheritance;

public class JuniorDeveloper extends Employee{


    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        setSalary(18000);
        System.out.println(getName() + " junior started to working.");
    }
}
