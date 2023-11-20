package com.workintech.inheritance;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniors) {
        super(id, name, salary);
        this.juniors = juniors;
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try {

            if (juniors[index] == null) {
                juniors[index] = junior;
            } else {
                System.out.println("Index doludur.");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index bulunamadı : " + index);
        }
    }
    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if (mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("Index doludur.");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index bulunamadı : " + index);
        }
    }
    public void addEmployee(int index, SeniorDeveloper senior) {
        try {

            if (seniors[index] == null) {
                seniors[index] = senior;
            } else {
                System.out.println("Index doludur.");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index bulunamadı : " + index);
        }
    }
    @Override
    public void work() {
        setSalary(45000);
        System.out.println(getName() + " hr manager started to working.");
    }
}
