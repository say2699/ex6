package kz.iitu.projects.ex6;



public class Hourly extends Employees {
    private String name;
    private int id;
    private double salary;
    private int hours;
    private double total;


    public Hourly(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public double getTotalSalary()
    {
        total = hours * salary;
        return total;
    }





    public String msg(){
        return "this is Hourly";
    }



}
