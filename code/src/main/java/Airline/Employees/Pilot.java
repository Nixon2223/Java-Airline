package Airline.Employees;

public class Pilot extends Employee{
    private String rank;

    public Pilot(String name, String rank){
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
