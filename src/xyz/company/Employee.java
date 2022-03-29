package xyz.company;

public class Employee {

    private int empId;
    private String name;

    public double calWages(double hourlyRate, int hoursWorked){
        return hourlyRate*hoursWorked;
    }

    public double calWages(double hourlyRate, int hoursWorked, double bonus){
        return calWages(hourlyRate, hoursWorked)+bonus;

    }
}
