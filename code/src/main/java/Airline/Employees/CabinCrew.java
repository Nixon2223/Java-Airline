package Airline.Employees;

public class CabinCrew extends Employee {
    private String rank;

    public CabinCrew(String name, String rank){
        super(name);
        this.rank = rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String fastenSeatbelts(){
        return "Please fasten your seatbelts";
    }
}
