package com.workintech.inheritance;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(29000);
        System.out.println(getName() + " mid developer started to working.");
    }
}
