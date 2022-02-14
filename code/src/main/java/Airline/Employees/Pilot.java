package Airline.Employees;

import Airline.Plane;

public class Pilot extends Employee{
    private String rank;

    public Pilot(String name, String rank){
        super(name);
        this.rank = rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String fly(Plane plane){
        return "Flying " + plane.getType();
    }
}
